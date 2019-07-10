package lab_09;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "JdbcServlet", urlPatterns = {"/JdbcServlet"})
public class JdbcServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            listEmployees();
    }
    private void listEmployees() {
        System.out.println("-----------------------------------------------" + new java.util.Date());
        
        String url = "jdbc:sqlserver://localhost:1433;databasename=EmployeeDB";
        String user = "sa";
        String pass = "12345";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
                        //com.microsoft.sqlserver.jdbc.SQLServerDriver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, user, pass);
            stmt = con.createStatement();
            String query = "SELECT * FROM EMPLOYEE";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                java.util.Date birthdate = rs.getDate("birthdate");
                float salary = rs.getFloat("salary");
                String s = id + " " + firstname + " " + lastname + " " + birthdate + " " + salary ;
                System.out.println(s);
            }
        } catch(SQLException | ClassNotFoundException e) {
            System.err.println(e);
        } finally {
            try {
                if (rs != null) rs.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
            try {
                if (stmt != null) stmt.close();
            } catch(SQLException ex) {
                System.err.println(ex);
            }
            try {
                if (con != null) con.close() ;
            } catch(SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
