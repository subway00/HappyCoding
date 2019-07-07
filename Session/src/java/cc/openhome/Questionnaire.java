package cc.openhome;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Questionnaire", urlPatterns = {"/questionnaire"})
public class Questionnaire extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset = 'UTF-8'>");
            out.println("</head>");
            out.println("<body>");
            
            String page = request.getParameter("page");
            out.println("<form action='questionnaire' method='post'>");
            
            if("page1".equals(page)) {
                page1(out);
            }
            else if ("page2".equals(page)) {
                page2(request, out);
            }
            else if("finish".equals(page)) {
                page3(request, out);
            }
            
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
     private void page1(PrintWriter out) {
            out.println("問題一:<input type='text' name='p1q1'><br>");
            out.println("問題二:<input type='text' name='p1q2'><br>");
            out.println("<input type='submit' name='page' value='page2'>");
            }
     private void page2(HttpServletRequest request, PrintWriter out) {
         String p1q1 = request.getParameter("p1q1");
         String p1q2 = request.getParameter("p1q2");
         out.println("問題三:<input type='text' name='p2q1'><br>");
         out.printf("<input type='hidden' name='p1q1' value='%s'>%n", p1q1);
         out.printf("<input type='hidden' name='p1q2' value='%s'>%n", p1q2);
         out.println("<input type='submit' name='page' value='finish'>");
     }
     private void page3(HttpServletRequest request, PrintWriter out) {
         out.println(request.getParameter("p1q1")+"<br>");
         out.println(request.getParameter("p1q2")+"<br>");
         out.println(request.getParameter("p2q1")+"<br>");
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
