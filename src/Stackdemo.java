import java.io.*;
import java.util.*;

public class Stackdemo {

	public static void main(String[] args) throws IOException {
		Stack<Integer> st = new Stack<Integer>();
		int choice = 0;
		int position, element;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (choice <= 4) {
			System.out.println("stack operation");
			System.out.println("1 push an element");
			System.out.println("2.pop an element");
			System.out.println("3 search an element");
			System.out.println("4 exit");
			System.out.println("your choice: ");
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:
				System.out.println("enter element:");
				element = Integer.parseInt(br.readLine());
				st.push(element);
				break;

			case 2:
				Integer obj = st.pop();
				System.out.println("popped object " + obj);
				break;

			case 3:
				System.out.println("which element?");
				element = Integer.parseInt(br.readLine());
				position = st.search(element);
				if (position == -1)
					System.out.println("Element not found");
				else
					System.out.println("position:" + position);
				break;
			default:
				return;
			}

			System.out.println("stack contents: " + st);

		}
	}
}

