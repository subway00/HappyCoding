import java.sql.Connection;     
import java.sql.DriverManager;  //class
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {

    public static void main(String[] args) {
       String url = "jdbc:sqlserver://localhost:1433;databaseName=EmployeeDB;";
        //String url = "jdbc:derby://localhost:1527/EmployeeDB;";
        String user = "sa";
        String pass = "12345";
        
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            con = DriverManager.getConnection(url, user, pass);
            stmt = con.createStatement();
            String query = "select * from EMPLOYEE";
            rs = stmt.executeQuery(query);
            
            while (rs.next()) {                
                int id = rs.getInt("id");
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                java.util.Date birthdate = rs.getDate("birthdate");
                float salary = rs.getFloat("salary");
                System.out.println(id + " " + firstName + " " + lastName + " " + birthdate +" " +salary);
            }
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            try { if (rs != null) rs.close();} catch(SQLException e) {
                System.err.println(e);
            } 
            try { if (stmt != null) stmt.close();} catch (SQLException e) {
                System.err.println(e);
            }
            try { if (con != null) con.close(); } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
}
