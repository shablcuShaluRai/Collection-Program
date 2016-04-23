import java.io.*;

class Employee {
	int id;
	String name;

	public Employee(int i, String n) {
		id = i;
		name = n;
	}

	public void Display() {
		System.out.println(id + "\t" + name);
	}
}

public class Group {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Employee arr[] = new Employee[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("enter id:");
			int id = Integer.parseInt(br.readLine());

			System.out.println("enter name:");
			String name = br.readLine();
			arr[i] = new Employee(id, name);
		}
		System.out.println("\n the employee data");

		for (int i = 0; i < arr.length; i++) {
			arr[i].Display();

		}
	}

}
