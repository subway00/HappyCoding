import java.sql.DriverManager;
import java.util.Calendar;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCTest3_Insert {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1980, 4, 1);
        Date birthDate = calendar.getTime();
        
        Employee e = new Employee(10, "Ketty", "Perry", birthDate , 6666_660);
        
        String url = "jdbc:sqlserver://localhost:1433;databaseName=EmployeeDB;";
        String user = "sa";
        String pass = "12345";
        String query = "insert into employee values(?,?,?,?,?)";
        
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement pstmt = con.prepareStatement(query);
            
            pstmt.setInt(1, e.getId());
            pstmt.setString(2, e.getFirstName());
            pstmt.setString(3, e.getLastName());
            
            
            Date date = e.getBirthDate();
            long time = date.getTime();
            java.sql.Date sqlDate = new java.sql.Date(time);
            
            pstmt.setDate(4, sqlDate);
            pstmt.setFloat(5, e.getSalary());
            
            if (pstmt.executeUpdate() == 1) {
                System.out.println(e.getFirstName() + "新增成功");
            }
            else {
                System.out.println(e.getFirstName() + "新增失敗");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
}
