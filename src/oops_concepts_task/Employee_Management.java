package oops_concepts_task;

class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, double salary,String programmingLanguage) {

        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Language: " + programmingLanguage);
    }
}

public class Employee_Management {
    public static void main(String[] args) {

        Developer d1 = new Developer("Guru", 201, 45000, "Java");
        d1.displayDetails();
    }
}
