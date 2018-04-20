public class CelsiustoFahrenheit {

        public static double celsiusToFahrenheit (double celsius)
        {
            double fahrenheit = ((9.0/5)*celsius)+32;
            return fahrenheit;
        }

        public static double fahrenheitToCelsius (double fahrenheit)
        {
            double celsius = (fahrenheit-32)*(5.0/9);
            return celsius;
        }
}