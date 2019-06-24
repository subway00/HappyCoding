
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.Locale;
import java.sql.PreparedStatement;

public class PreparedStatementTest {

    public static void main(String[] args) {
        
        String url =  "jdbc:sqlserver://localhost:1433;databaseName=EmployeeDB;";
        String user = "sa";
        String pass = "12345";
        
        //SQL Injection
        //輸入 1' OR '1'='1
        String inputFirstName = JOptionPane.showInputDialog("請輸入要查詢的員工 first name");
        
        
        
        String query = "select * from employee where firstname=?" ;     //?表參數之後設定
        System.out.println("querry= " + query);
        
        try(
            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement pstmt = con.prepareStatement(query);
                ) {
            pstmt.setString(1, inputFirstName);     //1表第1個?. 第一個?號放入inputFirstName
            ResultSet rs = pstmt.executeQuery();
            int count = 0;
            while (rs.next()) {                
                count++;
                int id = rs.getInt("id");
                String firstName = rs.getString("FIRSTNAME");
                
                String lastName = rs.getString("lastName");
                java.util.Date birDate = rs.getDate("birthdate");
                float salary = rs.getFloat("salary");
                
                String s = String.format("%d \t %-20s %s %15s", id, firstName + " " +
                        lastName, birDate, NumberFormat.getCurrencyInstance(Locale.US).format(salary));
                System.out.println(s);
            }
            if (count == 0) {
                System.out.println("查無此人");
            }
        }   catch (SQLException e) {
            
        } 
        }
    
}
