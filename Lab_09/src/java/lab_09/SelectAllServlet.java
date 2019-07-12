package lab_09;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.ArrayList;

@WebServlet(name = "SelectAllServlet", urlPatterns = {"/SelectAll.do"})
public class SelectAllServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            List <Employee> list = selectAllEmployee();
           request.getSession().setAttribute("list", list);
           //root 網站根目錄
           String root = getServletContext().getContextPath();
            String  jspurl = root + "/employee.view";
            System.out.println("jspurl = " + jspurl);
            response.sendRedirect(jspurl);
        }
    }
    private List selectAllEmployee(){
        List <Employee> list = new ArrayList();
        String url = "jdbc:sqlserver://localhost:1433;databasename=EmployeeDB";
        String user = "sa";
        String pw = "12345";
        String query = "SELECT * FROM EmployeeDB";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try ( 
                Connection con = DriverManager.getConnection(url, user, pw);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                    ){
                while(rs.next()){
                    int id = rs.getInt("ID");
                    String firstName = rs.getString("FIRSTNAME");
                    String lastName = rs.getString("LASTNAME");
                    Date birthday = rs.getDate("BIRTHDATE");
                    float salary = rs.getFloat("SALARY");
                    
                    Employee emp = new Employee(id, firstName, lastName, birthday, salary);
                    list.add(emp);
                    //
                    System.out.println(emp.toString());
                    getServletContext().log(emp.toString());
                }
                
            }
        } catch(SQLException | ClassNotFoundException e) {
            System.err.println(e);
        }
        return list;
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
