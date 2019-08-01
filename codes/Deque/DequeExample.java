import java.util.*;

class DequeExample{

	private static Deque<Integer> deque = new LinkedList<>();

	public static void main (String args [])
	{
		Scanner scanner = new Scanner(System.in);
		Integer a = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < a; i++)
		{
			String line = scanner.nextLine();
			String vars[] = line.split(" ");
			Arrays.asList(vars).stream().map(v -> Integer.parseInt(v)).forEach(deque::add);
		}
		deque.stream().map(v -> "val : "+v).forEach(System.out::println);
	}
}