import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionExample {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb", "root", "password");

            con.setAutoCommit(false);

            Statement stmt = con.createStatement();

            stmt.executeUpdate("INSERT INTO students VALUES(4,'Rahul')");
            stmt.executeUpdate("INSERT INTO students VALUES(5,'Anjali')");

            con.commit();
            System.out.println("Transaction completed successfully");

            con.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
