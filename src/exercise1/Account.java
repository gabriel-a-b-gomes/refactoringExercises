package exercise1;

public class Account {

	// ...
	private AccountType type;
	private int daysOverdrawn;

	// CODE SMELL: Duplicate Code
	// public double overdraftCharge() {
	// 	if (type.isPremium()) {
	// 		double result = 10;
	// 		if (daysOverdrawn > 7) {
	// 			result += (daysOverdrawn - 7) * 0.85;
	// 		}
	// 		return result;
	//     }
	//     else {
	//     	return daysOverdrawn * 1.75;
	//     }
	// }

	// Refactoring: Simplify condition expressions
	public double overdraftCharge() {
		if (type.isPremium()) {
			double result = 10;
			if (daysOverdrawn > 7) {
				result += (daysOverdrawn - 7) * 0.85;
			}

			return result;
	    }
	    
	    return daysOverdrawn * 1.75;
	}
	  
	public double bankCharge() {
		double result = 4.5;
		if (daysOverdrawn > 0) {
			result += overdraftCharge();
	    }
	   	return result;
	}
}