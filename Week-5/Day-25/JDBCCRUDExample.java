import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCCRUDExample {
    public static void main(String[] args) {

        try {
            // Step 1: Establish connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb", "root", "password");

            // Step 2: Insert record (Create)
            String insertQuery = "INSERT INTO students(id, name) VALUES(?, ?)";
            PreparedStatement ps = con.prepareStatement(insertQuery);
            ps.setInt(1, 1);
            ps.setString(2, "Sangmesh");
            ps.executeUpdate();

            System.out.println("Record inserted successfully");

            // Step 3: Read records
            String selectQuery = "SELECT * FROM students";
            PreparedStatement ps2 = con.prepareStatement(selectQuery);
            ResultSet rs = ps2.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

            con.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}