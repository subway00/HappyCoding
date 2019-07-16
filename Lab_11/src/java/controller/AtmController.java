package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import domain.Account;

@WebServlet(name = "AtmController", urlPatterns = {"/AtmController"})
public class AtmController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String operation = request.getParameter("operation");
        RequestDispatcher rd = null ;
        
        HttpSession session = request.getSession();
        Account acc;
        acc = (Account) session.getAttribute("acc");
        
        if (acc==null) {
            acc = new Account();
            session.setAttribute("acc", acc);
        }
        else {
            acc = (Account) session.getAttribute("acc");
        }
        switch (operation) {
            case "Deposit" :
                session.setAttribute("doAtmTitle", "Deposit");
                rd = request.getRequestDispatcher("/WEB-INF/doAtm.jsp");
                break;
            case "Withdraw" :
                session.setAttribute("doAtmTitle", "Withdraw");
                rd = request.getRequestDispatcher("/WEB-INF/doAtm.jsp");
                break;
            case "DoAtm" :
                String doAtmTitle;
                doAtmTitle = (String) session.getAttribute("doAtmTitle");
                
                long amount;
                amount = Long.parseLong(request.getParameter("amount"));
                request.setAttribute("amount", amount);
                if (doAtmTitle.equals("Deposit")) {
                    acc.deposit(amount);
                } else if (doAtmTitle.equals("Withdraw")) {
                    acc.withdraw(amount);
                }
                
                rd = request.getRequestDispatcher("/WEB-INF/doAtmResult.jsp");
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
