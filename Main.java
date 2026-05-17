package practice;
//Assignment question 5
abstract class Animal{
	abstract void sound();
}

//Subclass Dog
class Dog extends Animal{
	void sound() {
		System.out.println("Dog Barks");
	}
	
}

//Subclass Cat
class Cat extends Animal{
	void sound() {
			System.out.println("Cat Meows");
		}
}
public class Main {

	public static void main(String[] args) {
		Animal dog =new Dog();
		Animal cat =new Cat();
		
		dog.sound();
		cat.sound();
		

	}

}
