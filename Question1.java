package practice;

class Employee
{
	private int empId;
	private String empName;
	private double Salary;
	
	//gettter
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public double getSalary() {
		return Salary;
	}
	
	//setter
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	public void displayDetails()
	{
		System.out.println("Employee ID: "+ empId);
		System.out.println("Employee Name: "+ empName);
		System.out.println("Salary: "+ Salary);
	}
}
public class Question1 {

	public static void main(String[] args) {
		Employee emp=new Employee();
		
		emp.setEmpId(100);
		emp.setEmpName("Rohan");
		emp.setSalary(500000);
		
		emp.displayDetails();
		

	}

}
