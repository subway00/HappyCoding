package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ApplicationController", urlPatterns = {"/ApplicationController"})
public class ApplicationController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String operation = request.getParameter("operation");
        RequestDispatcher rd = null;
        
        HttpSession session = request.getSession();
        switch (operation) {
            case "Login":
                rd = request.getRequestDispatcher("/WEB-INF/login.jsp");
                break;
            case "LoginSubmit":
                String user = (String) request.getParameter("user");
                String pass = (String) request.getParameter("pass");
                if ("Tom".equals(user) && "1234".equals(pass)) {
                    rd = request.getRequestDispatcher("/index.jsp");
                    session.setAttribute("user", user);
                    request.setAttribute("welcome", "歡迎光臨<br>" + user + "<br>請選擇服務");
                }
                else {
                    request.setAttribute("loginError", "帳號 或 密碼輸入錯誤，請重新輸入");
                    rd = request.getRequestDispatcher("/WEB-INF/login.jsp");
                }
                break;
            case "Atm":
                rd = request.getRequestDispatcher("/WEB-INF/atm.jsp");
                break;
            case "Logout":
                request.setAttribute("welcome", "您已送出，請重新登入");
                session.invalidate();
                rd = request.getRequestDispatcher("index.jsp");
                break;
        }
        rd.forward(request, response);
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
