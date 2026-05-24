package practice;

//Base Class
class Course{
	void courseInfo() {
		System.out.println("Info about Course");
	}
}

//subclass
class science extends Course{
	void scienceInfo() {
		System.out.println("Science it is");
	}
}
class commerce extends Course{
	void commerceInfo() {
		System.out.println("Commerce it is");
	}
	
}
class arts extends Course{
	void artsInfo() {
		System.out.println("Arts it is");
	}
}
public class Hirerachical_Inheritence {

	public static void main(String[] args) {
		science sci = new science();
		commerce com = new commerce();
	    arts art = new arts();
	    
	    sci.courseInfo();
	    sci.scienceInfo();
	    
	    com.courseInfo();
	    com.commerceInfo();
	    
	    art.courseInfo();
	    art.artsInfo();
	}

}
