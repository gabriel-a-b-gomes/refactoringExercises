package exercise2;

public class App {

	public static void main(String[] args) {
		// Employee kent = new Employee(50);
		// JobItem j1 = new JobItem(5, 0, true, kent);
		// JobItem j2 = new JobItem(15, 10, false, null);
		JobItem j1 = new JobItem(5, 0, true, 50);
		JobItem j2 = new JobItem(15, 10, false, 0);
		int total = j1.getTotalPrice() + j2.getTotalPrice();
	}

}
