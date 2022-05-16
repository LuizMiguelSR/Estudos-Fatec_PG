/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fatec
 */
@WebServlet(name = "JurosCompostosServlet", urlPatterns = {"/juros-compostos.html"})
public class JurosCompostosServlet extends HttpServlet {

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
            NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
            String error = null;
            double presente = 0.0, tempo = 0, taxa = 0.0;
            
            try{
                String p1 = request.getParameter("presente1");
                String p2 = request.getParameter("taxa1");
                String p3 = request.getParameter("tempo1");
                
                presente = Double.parseDouble(p1);
                taxa = Double.parseDouble(p2);
                tempo = Integer.parseInt(p3);
            }catch (Exception e){
                error = e.getMessage();
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Juros Compostos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3><a href='index.html'>Voltar</a></h3><hr>");
            out.println("<h1>Cálculo Juros Compostos</h1>");
            if(error != null){
                out.println("<span style='color:red'>Erro ao tentar ler parâmetros</span>");
            }else{
                out.println("<div>");
                out.println("<b>Valor presente:</b> " + formatter.format(presente));
                out.printf("<br><b>Tempo:</b> %.0f meses\n", tempo);
                out.println("<br><b>Taxa:</b> " + taxa + "% a.m");
                double futuro = presente * Math.pow((1+(taxa/100)), tempo);
                out.println("<br><b>Valor futuro:</b> " + formatter.format(futuro));
                out.println("</div>");
            }
            out.println("</body>");
            out.println("</html>");
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
