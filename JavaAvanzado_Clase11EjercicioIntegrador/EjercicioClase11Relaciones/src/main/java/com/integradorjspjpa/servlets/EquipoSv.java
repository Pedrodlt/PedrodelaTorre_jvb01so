/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.integradorjspjpa.servlets;

import com.integradorjspjpa.logica.Controladora;
import com.integradorjspjpa.logica.Equipo;
import com.integradorjspjpa.persistencia.EquipoJpaController;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pedro
 */
@WebServlet(name = "EquipoSv", urlPatterns = {"/EquipoSv"})
public class EquipoSv extends HttpServlet {
    
    Controladora controlLogica = new Controladora();

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Equipo> equiposCoincidentes = controlLogica.mostrarEquipos();

        // seteamos los datos obtenidos en la página
        request.setAttribute("resultados", equiposCoincidentes);

        // Redirigimos a la misma página
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Obtenemos los datos introducidos en el formulario
        String nombre = request.getParameter("nombre");
        String ciudad = request.getParameter("ciudad");
        
        //Creamos el nuevo equipo
        Equipo equipo = new Equipo();
        equipo.setNombre(nombre);
        equipo.setCiudad(ciudad);
        
        controlLogica.crearEquipo(equipo);
        //Redirigimos a la misma página
        response.sendRedirect("index.jsp"); 
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
