package JDBC_Tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Product_Management_JDBC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/jdbcs";
        String username = "root";
        String password = "Root@123";
        String query = "INSERT INTO product VALUES (?, ?, ?, ?)";
        try {
            Connection con = DriverManager.getConnection(url, username, password);

            PreparedStatement ps = con.prepareStatement(query);

            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Product Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Product Quantity: ");
            int quantity = sc.nextInt();

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, price);
            ps.setInt(4, quantity);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Product added successfully");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
}
