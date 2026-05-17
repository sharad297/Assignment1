package practice;
class Person
{
	Person()
	{
		System.out.println("Person Created");
	}
	
}
class Student extends Person{
	Student(){
		super();
		System.out.println("Student Created");
	}
	
}
public class SuperKeyword {

	public static void main(String[] args) {
		Student s = new Student();
		
	}

}
