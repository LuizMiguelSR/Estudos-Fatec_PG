/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fatec
 */
@WebServlet(name = "JurosSimplesServlets", urlPatterns = {"/juros-simples.html"})
public class JurosSimplesServlets extends HttpServlet {

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
            String error = null;
            double presente = 0.0, tempo = 0, juros = 0.0;
            
            try{
                String p1 = request.getParameter("presente");
                String p2 = request.getParameter("juros");
                String p3 = request.getParameter("tempo");
                
                presente = Double.parseDouble(p1);
                juros = Double.parseDouble(p2);
                tempo = Integer.parseInt(p3);
            }catch (Exception e){
                error = e.getMessage();
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Juros Simples</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3><a href='index.html'>Voltar</a></h3><hr>");
            out.println("<h1>Cálculo Juros Simples</h1>");
            if(error != null){
                out.println("<span style='color:red'>Erro ao tentar ler parâmetros</span>");
            }else{
                out.println("<div>");
                juros = juros/100;
                double calculo = juros * tempo;
                calculo += 1;
                out.println("Valor presente: "+presente+"</br>Juros: "+juros+"</br>Tempo: "+tempo+"</br>Valor Futuro: "+(presente * calculo));
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
