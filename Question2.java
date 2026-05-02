package practice;


//Base class
class Vehicle
{
	void fuelType()
	{
		System.out.println("Runs on fuel");
	}
}

//Child Class
class electricCar extends Vehicle
{
	void fuelType() {
		System.out.println("Runs on Electricity");
	}
}
public class Question2 {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.fuelType();
		
		electricCar e = new electricCar();
		e.fuelType();

	}

}
