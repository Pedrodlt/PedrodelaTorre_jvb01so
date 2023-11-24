/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.votacion.votacionpartido.servlets;

import com.votacion.votacionpartido.logica.Controladora;
import com.votacion.votacionpartido.logica.Votacion;
import java.io.IOException;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pedro
 */
@WebServlet(name = "VotacionSv", urlPatterns = {"/VotacionSv"})
public class VotacionSv extends HttpServlet {

    private Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Mapeamos la cantidad de votos obtenidos desde la controladora
        Map<String, Integer> resultados = control.obtenerCantidadVotosPorPartido();

        // Establecer los resultados en la solicitud para que se muestren en el JSP
        request.setAttribute("resultados", resultados);

        // Redirigir de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String partido = request.getParameter("partido");
        
        Votacion votacion = new Votacion();
        votacion.setPartido(partido);
        
        //modificamos la lista por el método crear
        control.crearVotacion(votacion);

        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
