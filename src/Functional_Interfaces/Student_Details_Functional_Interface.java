package Functional_Interfaces;

@FunctionalInterface
interface Student {
    void display();
}

public class Student_Details_Functional_Interface {
    public static void main(String[] args) {
        String name = "Guru";
        int age = 21;
        String department = "Java";
        Student s = () -> {
            System.out.println("Student Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Department: " + department);
        };
        s.display();
    }
}
