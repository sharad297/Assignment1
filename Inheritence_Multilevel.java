package practice;

//Base class
class Device{
	void start() {
		System.out.println("Device starting....");
	};
}

//Derieved class
class Mobile extends Device{
	void calling() {
		System.out.println("Mobile is making call...");
	}
}

//Further Derieved Class
class SmartPhone extends Mobile{
	void Internet() {
		System.out.println("SmartPhone is browsing the internet...");
	}
	
}
public class Inheritence_Multilevel {

	public static void main(String[] args) {
		
		SmartPhone sp=new SmartPhone();
		sp.Internet(); //FROM SMARTPHONE
		sp.calling();  //FROM MOBILE
		sp.start();    //FROM DEVICE
		

	}

}
