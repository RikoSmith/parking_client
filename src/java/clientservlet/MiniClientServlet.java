/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientservlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import service.CallerService;

/**
 *
 * @author Rustam
 */
@WebServlet(name = "MiniClientServlet", urlPatterns = {"/MiniClientServlet"})
public class MiniClientServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/104.131.95.198_8080/service/CallerService.wsdl")
    private CallerService service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            Boolean isAuth = true;
            java.util.List<java.lang.String> x;
            x = getList();
            out.println("<h1>Sucess</h1>");
            /*out.println("<html>");
            out.println("<head>");
            out.println("<title>Returned List</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<style>table,th,td{border: 1px solid black;}</style>");
            out.println("<h2>Here are the users:</h2>");
            out.println("<table>");
            for (int i = 0; i < x.size(); i++) {
                    out.println("<tr>");
                        out.println("<td>");
                            out.println(i);
                        out.println("</td>");
                        out.println("<td>");
                            out.println(x.get(i));
                        out.println("</td>");
                    out.println("</tr>");
		}
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
            */
            
            
            request.setAttribute("list", x);
            request.getRequestDispatcher("admin.jsp").forward(request, response);
            
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

    private java.util.List<java.lang.String> getList() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.Caller port = service.getCallerPort();
        return port.getPersons();
    }


}
