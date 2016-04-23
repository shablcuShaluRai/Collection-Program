import java.util.*;

public class ArraycollRetain {

	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();
		al.add("shalu");
		al.add("sahil");
		al.add("ayush");

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("shalu");
		al2.add("sahil");
		al2.add("anu");

		al.retainAll(al2);// it return the common element
		System.out.println("iyteration after retain all method");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
