import java.util.*;
import java.io.*;

public class HasMapprog {

	public static void main(String[] args) throws IOException {
		HashMap<String, Long> hm = new HashMap<String, Long>();
		String name, str;
		Long phno;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("1.enter phone enteries");
			System.out.println("2.lookup in the book");
			System.out.println("3.Display name in books");
			System.out.println("4.exit");

			System.out.println("enter choice");
			int n = Integer.parseInt(br.readLine());

			switch (n) {
			case 1:
				System.out.println("enter name");
				name = br.readLine();
				System.out.println("enter phone number");
				//phno = Long.getLong(br.readLine()); won't work.
				phno=new Long(br.readLine());
				hm.put(name, phno);
				break;

			case 2:
				System.out.println("Enter name");
				name = br.readLine();
				name = name.trim();
				phno = hm.get(name);
				System.out.println("phno=" + phno);
				break;
			case 3:
				Set<String> set = new HashSet<String>();
				set = hm.keySet();
				System.out.println(set);
				break;
			case 4:
				return;

			}

		}
	}

}

