package JDBC_Tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Employee_Management_JDBC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/jdbcs";
        String username = "root";
        String password = "Root@123";

        String query = "INSERT INTO employee VALUES (?, ?, ?, ?)";

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            PreparedStatement ps = con.prepareStatement(query);

            for (int i = 1; i <= 3; i++) {

                System.out.println("\nEnter Employee " + i + " Details");

                System.out.print("Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Salary: ");
                double salary = sc.nextDouble();
                sc.nextLine();

                System.out.print("Department: ");
                String department = sc.nextLine();

                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setDouble(3, salary);
                ps.setString(4, department);

                int result = ps.executeUpdate();

                if (result > 0) {
                    System.out.println("Employee ID: " + id);
                    System.out.println("Employee Name: " + name);
                    System.out.println("Employee inserted successfully");
                }
            }
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
