import java.util.*;

public class Arrayprog3 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("apple");
		al.add("guava");
		al.add("mango");
		al.add("mango");

		System.out.println("contents " + al);

		al.remove(3);
		al.remove("apple");
		System.out.println("contents after removing" + al);
		System.out.println("size of arraylist: "+al.size());
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
	}

}
