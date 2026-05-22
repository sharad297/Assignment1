package practice;

class Bank{
	public final String IFSC = "IFSC00012";
	public final void showIFSC() {
		System.out.println("Bank IFSC code " + IFSC);
	}
}

//Subclass
class HDFCBank extends Bank{
//	@Override
//	public void showIFSC(){
//		System.out.println("Trying to Override IFSC in HDFCBank ");
//	}
}
public class finalKeyword {

	public static void main(String[] args) {
		
		Bank bank =new Bank();
		bank.showIFSC();
		
		HDFCBank hdfc = new HDFCBank();
	    hdfc.showIFSC();
		

	}

}
