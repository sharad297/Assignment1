package practice;

class Student {

    static String collegeName = "ABC";
    String name;
    int rollNo;

    // Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Method to print static and instance data
    void display() {
        System.out.println("Name: " + name +
                           ", Roll No: " + rollNo +
                           ", College: " + collegeName);
    }
}

public class StaticKeyword {

    public static void main(String[] args) {

        Student s1 = new Student("Ram", 12);
        Student s2 = new Student("Tom", 13);
        Student s3 = new Student("Sham", 14);

        s1.display();
        s2.display();
        s3.display();
    }
}