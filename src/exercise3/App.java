package exercise3;

public class App {

	public static void main(String[] args) {

		Person john = new Person();
		// ...
		// Person manager = john.getManager();
		Department johnsDepartment = john.getDepartment();
		Person manager = johnsDepartment.getManager();
	}
}
