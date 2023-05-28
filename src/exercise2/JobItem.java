package exercise2;

// Refactoring: Remove Middle Man
public class JobItem {

	private int quantity;
	private int unitPrice;
	// private Employee employee;
	private int rate
	private boolean isLabor;

	// public JobItem(int quantity, int unitPrice, boolean isLabor, Employee employee) {
	public JobItem(int quantity, int unitPrice, boolean isLabor, int rate) {	
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.isLabor = isLabor;
		this.rate = rate;
	}

	public int getTotalPrice() {
		return quantity * getUnitPrice();
	}

	public int getQuantity() {
		return quantity;
	}

	public int getUnitPrice() {
		// return (isLabor) ? employee.getRate() : unitPrice;
		return (isLabor) ? rate : unitPrice;
	}

	// public Employee getEmployee() {
	// 	return employee;
	// }
}
