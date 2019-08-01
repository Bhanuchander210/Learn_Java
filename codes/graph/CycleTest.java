// A Java Program to detect cycle in a graph 
import java.util.ArrayList; 
import java.util.LinkedList; 
import java.util.List; 

class CycleTest {

	int v;
	List<List<Integer>> edgeMap;

	CycleTest(int noOfVertices)
	{
		v = noOfVertices;
		edgeMap = new ArrayList<>(v);
		for (int i =0; i < v; i++)
			edgeMap.add (new LinkedList<>());
	}

	void addEdges (int v, int val)
	{
		edgeMap.get(v).add(val);
	} 

	boolean isCycleUtil(int i, boolean visited[], boolean reclist[])
	{

		if (reclist[i])
			return true;

		if(visited[i])
			return false;

		visited[i] = true;
		reclist[i] = true;

		for (Integer child : edgeMap.get(i))
		{
			if (isCycleUtil(i, visited, reclist));
				return true;
		}
		reclist[i] = false;
		return false;
	}
	
	boolean isCycle()
	{
		boolean visited [] = new boolean [v];
		boolean reclist [] = new boolean [v];

		for (int i =0; i<= v; i++)
		{
			return isCycleUtil(i, visited, reclist);
		}
		return false;
	}
	

	public static void main(String[] args) 
	{

		CycleTest ct = new CycleTest(5);
		ct.addEdges(0, 1);
		ct.addEdges(0, 1);

		System.out.println(ct.isCycle());
	} 
} 

// This code is contributed by Sagar Shah. 
