import java.util.LinkedList; 
import java.util.Queue; 

public class QueueTest
{ 
public static void main(String[] args) 
{ 
	Queue<Integer> q = new LinkedList<>();

	for (int i=0; i<5; i++) 
	q.add(i); 
	System.out.println("Elements of queue : " + q); 
	System.out.println("removed element-" + q.remove()); 

	System.out.println(q); 
	System.out.println("head of queue-" + q.peek()); 
	System.out.println("Size of queue-" + q.size()); 
} 
} 
