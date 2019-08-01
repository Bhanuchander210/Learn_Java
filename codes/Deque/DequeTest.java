import java.util.LinkedList; 
import java.util.Deque; 

public class DequeTest
{ 
public static void main(String[] args) 
{ 
	Deque<Integer> q = new LinkedList<>();

	for (int i=0; i<5; i++){
		q.addFirst(i);
		q.addLast(i);
	}

	System.out.println("Elements of queue : " + q); 
	System.out.println("removed element-" + q.removeLast()); 

	System.out.println(q); 
	System.out.println("head of queue-" + q.peek()); 
	System.out.println("Tail of queue-" + q.peekLast()); 
	System.out.println("Size of queue-" + q.size()); 
} 
} 
