import java.util.*;
import java.io.*;

public class Linklistprog {

	public static void main(String[] args) throws IOException {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Shalu");
		ll.add("sahil");
		ll.add("ayush");

		System.out.println("linked ist content " + ll);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String element;
		int position, choice = 0;

		while (choice < 4) {
			System.out.println("\n LinkedLiust Operation");
			System.out.println("\n 1.Add an element");
			System.out.println("\n 2.Remove an element");
			System.out.println("\n 3. change an element");
			System.out.println("\n 4.Exit");

			System.out.println("enter the choice");
			choice = Integer.parseInt(br.readLine());

			switch (choice) {

			case 1:
				System.out.println("enter the element:");
				element = br.readLine();
				System.out.println("what position");
				position = Integer.parseInt(br.readLine());
				ll.add(position - 1, element);
				break;

			case 2:
				System.out.println("enter position");
				position = Integer.parseInt(br.readLine());
				ll.remove(position - 1);
				break;

			case 3:
				System.out.println("enter position");
				position = Integer.parseInt(br.readLine());
				System.out.println("enter new element");
				element = br.readLine();
				ll.set(position - 1, element);
				break;
			default:
				return;

			}
			System.out.println("List =");
			Iterator it = ll.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}

		}

	}

}
