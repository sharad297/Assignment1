package practice;

class Library{
	String libraryName;
	Library()
	{
		System.out.println("Welcome to the library");
	}
	void showLocation() {
		System.out.println("This library is located in Mumbai");
	}
}

public class Class_object {

	public static void main(String[] args) {
		Library lib =new Library();
		//Library();
		lib.showLocation();
	}

}
