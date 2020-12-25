package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Juego3Raya;

/**
 *
 * @author javi
 */
@WebServlet(urlPatterns = {"/jugar"})
public class jugar extends HttpServlet {

    private Juego3Raya juego;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    @Override
    public void init(ServletConfig config) throws ServletException {
        juego = new Juego3Raya();
        super.init(config); //To change body of generated methods, choose Tools | Templates.
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String sTamanyo = request.getParameter("tamanyo");
        if (sTamanyo != null) {
            //Inicializar el juego
            int tamanyo = Integer.parseInt(sTamanyo);
            juego.setTamanyo(tamanyo);
            request.getSession().setAttribute("juego", juego);
            this.getServletContext().getRequestDispatcher("/interfazjuego.jsp").forward(request, response);
        } else {
            String sFila = request.getParameter("filaseleccionada");
            String sColumna = request.getParameter("columnaseleccionada");
            
            int fila = Integer.parseInt(sFila);
            int col = Integer.parseInt(sColumna);
            juego.mover(fila, col);    
           
            this.getServletContext().getRequestDispatcher("/interfazjuego.jsp").forward(request, response);
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
