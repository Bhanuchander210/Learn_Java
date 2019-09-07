import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.net.URLConnection;

import javax.net.ssl.*;
import java.net.URL;
import java.io.*;
import java.net.MalformedURLException;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;

class HttpsURLConnectionUtil
{
    static class SSLSocketFactoryUtil
    {
        private String caCertPath;
        private String certPath;
        private String passWord = "changeit";
        private final String PKCS12_STR = "PKCS12";
        private final String JKS_STR = "JKS";

        SSLSocketFactoryUtil(String caCert, String cert)
        {
            caCertPath = caCert; certPath = cert;
        }

        SSLSocketFactoryUtil(String caCert, String cert, String pass)
        {
            caCertPath = caCert; certPath = cert; passWord = pass;
        }
        SSLSocketFactory getSSLSocketFactory() throws Exception
        {
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(getKeyManagers(), getTrustManagers(), new SecureRandom());
            return sslContext.getSocketFactory();
        }
        private KeyStore getPKCSKeyStore() throws Exception
        {
            return KeyStore.getInstance(PKCS12_STR);
        }
        private KeyStore getJKSKeyStore() throws Exception
        {
            return KeyStore.getInstance (JKS_STR);
        }

        private Certificate getCertificate (String path) throws Exception
        {
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            InputStream caInput = getFileInputStream(path);
            Certificate c = cf.generateCertificate(caInput);
            caInput.close();
            return c;
        }

        private TrustManager [] getTrustManagers() throws Exception
        {
            KeyStore tKeyStore = getJKSKeyStore();
            tKeyStore.load (null, null);
            tKeyStore.setCertificateEntry ("CA-Cert", getCertificate (caCertPath));
            TrustManagerFactory tmf = TrustManagerFactory.getInstance (TrustManagerFactory.getDefaultAlgorithm());
            tmf.init (tKeyStore);
            return tmf.getTrustManagers();
        }

        private KeyManager [] getKeyManagers() throws Exception
        {
            KeyStore keyStore = getPKCSKeyStore();
            keyStore.load (getFileInputStream(certPath), passWord.toCharArray());
            KeyManagerFactory kmf = KeyManagerFactory.getInstance (KeyManagerFactory.getDefaultAlgorithm());
            kmf.init (keyStore, passWord.toCharArray());
            return kmf.getKeyManagers();
        }

        private FileInputStream getFileInputStream(String path) throws Exception
        {
            return new FileInputStream (new File (path));
        }
    }

    public static void main (String [] args) throws Exception
    {
        System.out.println("HTTPs URL Connection with SSL Certificates.");
        String url = "https://SomeSSLUrl:port/path";
        String caCertPath = "/path/to/SomeThing-CA.crt";
        String certPath = "/path/to/SomeThing.p12";

        URLConnection connection = null;
        try {
            URL urlObj = new URL(url);
            connection = urlObj.openConnection();
        }catch (MalformedURLException e)
        {
            System.out.println(e);
            return;
        }
        SSLSocketFactoryUtil ssfu = new SSLSocketFactoryUtil(caCertPath, certPath);
        HttpURLConnection httpConnection = (HttpURLConnection) connection;
        HttpsURLConnection httpsConnection = (HttpsURLConnection) httpConnection;
        httpsConnection.setSSLSocketFactory(ssfu.getSSLSocketFactory());
        // Do your work.
        System.out.println("Done");
    }
}