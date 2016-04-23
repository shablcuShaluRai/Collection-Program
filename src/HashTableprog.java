import java.util.*;
import java.io.*;

public class HashTableprog {

	public static void main(String[] args) throws IOException {

		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("Shalu", 20);
		ht.put("Sahil", 25);
		ht.put("Shayam", 30);
		ht.put("Ram", 20);

		System.out.println("the player names");
		Enumeration e = ht.keys();
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter player name");
		String name = br.readLine();
		name = name.trim();
		Integer score = ht.get(name);
		if (score != null) {

			int sc = score.intValue();
			System.out.println(name + " scored : " + sc);
		} else
			System.out.println("player  not found");

	}
}
