package practice;

class Account{
	private String  accountHolderName;
	private double balance;
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance<0) {
			System.out.println("Balance cannot be zero");
		}
		else {
			this.balance=balance;
		}
	}
}
public class Encacpsualtion_Validation {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setAccountHolderName("Ram");
		a1.setBalance(-1);
		a1.setBalance(5000);
		
		 System.out.println("Account Holder: " + a1.getAccountHolderName());
	     System.out.println("Balance: " + a1.getBalance());

	}

}
