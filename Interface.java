package practice;

interface Payment{
	void makePayment();
}
class Upi implements Payment{
	@Override
	public void makePayment() {
		System.out.println("Make Payment via UPI ");  
		
	}
}
class CreditCard implements Payment{

	@Override
	public void makePayment() {
		System.out.println("Make Payment via Credit Card");
		
	}
	
}
public class Interface {

	public static void main(String[] args) {
		Payment ref  = new Upi();
		Payment ref1 = new CreditCard();
		
		ref.makePayment();
		ref1.makePayment();
	

	}

}
