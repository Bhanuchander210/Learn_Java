import java.util.*;
class EarthQuake
{
    static List<Edge> edgeList = new ArrayList<>();
    static HashMap<Integer, List<Integer>> allMap = new HashMap<>();
    static HashMap<Integer, Edge> map = new HashMap<>();
    static List<Integer> innerCircle = new ArrayList<>();

    static class Edge
    {
        int from;
        int to;
        int t;
        int h;
        Edge (int inFrom, int inTo, int t, int h)
        {
            from = inFrom;
            to = inTo;
            t = t;
            h = h;
        }
    }

    public static HashMap<Integer, Integer> getPath(Integer node, Integer startNode, Integer p, Integer th) {
        p++;
        HashMap<Integer, Integer> inMap = new HashMap<>();
        System.out.println("Current : "+ node);
        for (Integer n : allMap.get(node)) {
            System.out.println("iter : "+ n);
            Edge inEdge = map.get(n);
            th += inEdge.t - inEdge.h;
            if (startNode == inEdge.to) {
                inMap.put(0, p);
                inMap.put(1, th);
                return inMap;
            }
            inMap = getPath(inEdge.to, startNode, p, th);
        }
        return inMap;
    }

    public static void getCalMap() {
        for (Integer ele : innerCircle){
            System.out.println("Node In innerCircle: "+ ele );
            System.out.println(getPath(ele, ele, 1, 0).get(new Integer(0)));
        }
    }

    public static void main (String args[])
    {
        System.out.println("Bhanuchander");
        Scanner sc = new Scanner(System.in);
        String inString = sc.nextLine();
        final Integer[] ints = Arrays.stream(inString.split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
        int n = ints[0];
        int m = ints[1];
        int u, v, t, h;
        for (int i =0; i< m; i++) {
            inString = sc.nextLine();
            Integer[] vals = Arrays.stream(inString.split(" "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
            u = vals[0];
            v = vals[1];
            t = vals[2];
            h = vals[3];
            Edge edge = new Edge(u, v, t, h);
            if (!allMap.keySet().contains(u))
            {
                allMap.put(u, new ArrayList<>());
            }
            allMap.get(u).add(v);
            if (allMap.keySet().contains(v))
            {
                innerCircle.add(v);
            }
            edgeList.add(edge);
            map.put(edge.from, edge);
        }
        System.out.println("Size : "+ edgeList.size());
        System.out.println("Inner Size : "+ innerCircle.size());
        getCalMap();
    }
}