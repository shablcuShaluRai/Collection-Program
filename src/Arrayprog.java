import java.util.*;

public class Arrayprog {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("shalu");
		al.add("sahil");
		al.add("ayush");
		al.add("Ram");
		Iterator it = al.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}
	}

}
