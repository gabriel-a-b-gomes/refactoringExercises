package exercise3;

public class Person {

	private Department department;

	public void setDepartment(Department arg) {
		department = arg;
	}

	// CODE SMELL: Middle Man
	// public Person getManager() {
	// 	return department.getManager();
	// }

	// Refactoring: Remove Middle Man
	public Department getDepartment() {
		return department;
	}
}
