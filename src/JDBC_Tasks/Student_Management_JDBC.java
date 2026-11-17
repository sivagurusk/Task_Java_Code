package JDBC_Tasks;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Student_Management_JDBC {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbcs";
        String username = "root";
        String password = "Root@123";

        String query = "INSERT INTO student VALUES (?, ?, ?, ?)";

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, 101);
            ps.setString(2, "Anand");
            ps.setInt(3, 22);
            ps.setString(4, "Java");

            ps.executeUpdate();
            System.out.println("Student inserted successfully");

           
            ps.setInt(1, 102);
            ps.setString(2, "Arun");
            ps.setInt(3, 23);
            ps.setString(4, "Python");

            ps.executeUpdate();
            System.out.println("Student inserted successfully");

        
            ps.setInt(1, 103);
            ps.setString(2, "Kumar");
            ps.setInt(3, 21);
            ps.setString(4, "React");

            ps.executeUpdate();
            System.out.println("Student inserted successfully");

            ps.close();
            con.close();

        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
}
