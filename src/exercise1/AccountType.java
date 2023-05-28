package exercise1;

public class AccountType {

	public static final int REGULAR_ACCOUNT = 0;
	public static final int PREMIUM_ACCOUNT = 1;
	
	private int accountType;
	
	// CODE SMELL: Speculative Generality
	// public boolean isPremium() {
	// 	if (this.accountType == PREMIUM_ACCOUNT)
	// 		return true;
	// 	return false;
	// }

	// Refactoring: Inline Methods
	public boolean isPremium() {
		return this.accountType == PREMIUM_ACCOUNT;
	}
	
	// Consider there is additional code here...

}
