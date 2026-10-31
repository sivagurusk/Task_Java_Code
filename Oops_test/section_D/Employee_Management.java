package section_D;

class Employee {
    int employeeId;
    String name;
    Employee(int employeeId,String name) {
        this.employeeId = employeeId;
        this.name = name;
    }
    void displayDetails() {
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Name: "+name);
    }
}

class Manager extends Employee {
    String department;
    Manager(int employeeId,String name,String department) {
        super(employeeId, name);
        this.department = department;
    }
    @Override
    void displayDetails() {
        System.out.println("Manager Details");
        super.displayDetails();
        System.out.println("Department: "+department);
    }
}
class Developer extends Employee {
    String programmingLanguage;
    Developer(int employeeId,String name,String programmingLanguage) {
        super(employeeId, name);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    void displayDetails() {
        System.out.println("Developer Details");
        super.displayDetails();
        System.out.println("Programming Language: "+programmingLanguage);
    }
}
public class Employee_Management {
    public static void main(String[] args) {
        Employee emp1 = new Manager(217,"Guru","React Developer...");
        Employee emp2 = new Developer(721,"Kumar","Java Developer...");
        emp1.displayDetails();
        System.out.println("==========================");
        emp2.displayDetails();
    }
}