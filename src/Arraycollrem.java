import java.util.*;

public class Arraycollrem {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("shalu");
		al.add("sahil");
		al.add("ayush");

		ArrayList<String> al2 = new ArrayList<String>();

		al2.add("shalu");
		al2.add("ram");
		al2.add("shyam");

		al.removeAll(al2);
		//using removeAll method
		System.out.println("iteration  removing the element after  al2 ");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}

}
