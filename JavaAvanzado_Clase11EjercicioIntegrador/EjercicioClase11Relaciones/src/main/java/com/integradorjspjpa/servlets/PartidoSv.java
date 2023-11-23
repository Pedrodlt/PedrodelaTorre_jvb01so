/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.integradorjspjpa.servlets;

import com.integradorjspjpa.logica.Controladora;
import com.integradorjspjpa.logica.Partido;
import com.integradorjspjpa.persistencia.PartidoJpaController;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pedro
 */
@WebServlet(name = "PartidoSv", urlPatterns = {"/PartidoSv"})
public class PartidoSv extends HttpServlet {
    
    Controladora controlLogica = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         //Obtenemos los partidos 
        List<Partido> listPartidos = controlLogica.traerPartido();
        
        // Seteamos los datos obtenidos en la página
        request.setAttribute("partidos", listPartidos);
        
        // Redirigir a la misma página
        request.getRequestDispatcher("index.jsp").forward(request, response);    
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Obtenemos los datos introducidos en el formulario
        String fechaIngresada = request.getParameter("fecha_partido");
        String resultadoEquipoLocal = request.getParameter("resultado_equipoLocal");
        String resultadoEquipoVisitante = request.getParameter("resultado_equipoVisitante");
        String idEquipoLocal = request.getParameter("id_equipoLocal");
        String idEquipoVisitante = request.getParameter("id_equipoVisitante");
        //Creamos el nuevo partido
        Partido partido = new Partido();
        partido.setFecha(fechaIngresada);
        partido.setResultado_local(Integer.parseInt(resultadoEquipoLocal));
        partido.setResultado_visitante(Integer.parseInt(resultadoEquipoVisitante));
        //al crear el partido, mandamos los IDs también
        controlLogica.crearPartido(partido, Long.parseLong(idEquipoLocal), Long.parseLong(idEquipoVisitante));
        // Redirigimos a la misma pagina
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
