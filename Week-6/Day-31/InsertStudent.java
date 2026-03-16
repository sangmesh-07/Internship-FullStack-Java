import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertStudent {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb", "root", "password");

            String query = "INSERT INTO students(id, name) VALUES(?, ?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, 101);
            ps.setString(2, "Sangmesh");

            ps.executeUpdate();

            System.out.println("Record inserted successfully");

            con.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*output: Record inserted successfully  
 */