package practice;

class LoanCalculator
{
	
	public void  calculateLoan(int amount)
	{
		System.out.println("Loan Amount: " + amount);
	       
	}
	
	public void calculateLoan(int amount, double interestRate) {
		System.out.println("Loan Amount: " + amount);
		System.out.println("Interest Amount: " + interestRate +"%");
		double interest = (amount * interestRate) / 100;
        System.out.println("Calculated Interest: " + interest);
		
	}

}
public class MethodOverload {

	public static void main(String[] args) {
		LoanCalculator loan = new LoanCalculator();
		loan.calculateLoan(5000);
		loan.calculateLoan(10000,7.5);
	}

}
