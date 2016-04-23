import java.util.*;


public class Vectorprog {

	public static void main(String[] args) {

		Vector<Integer> vc = new Vector<Integer>();

		int x[] = { 11, 25, 30, 60, 80 };

		for (int i = 0; i < x.length; i++) {
			vc.add(x[i]);

		}

		// retrieve the element using get method

		/*System.out.println("Vectors element");
		for (int i = 0; i < x.length; i++) {
			System.out.println(vc.get(i));
		}*/

		// retrieve the element using ListIterator Interface
		System.out.println("retrive element using ListIterator Interface");
		ListIterator lit = vc.listIterator();
		
		System.out.println("list iterator  in forwaard direction");
		while (lit.hasNext()){ 
			System.out.println(lit.next()+"\t");
		}
		System.out.println("List iterator in backward direction");
		while (lit.hasPrevious()) {
			System.out.println(lit.hasPrevious());
		}

	}

}
