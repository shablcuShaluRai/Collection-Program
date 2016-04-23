import java.util.*;

public class Arraycoll {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("shalu");
		al.add("sahil");
		al.add("ayush");

		ArrayList<String> al2 = new ArrayList<String>();

		al2.add("ram");
		al2.add("shayam");

		al.addAll(al2);
		//using addAll method
		
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
