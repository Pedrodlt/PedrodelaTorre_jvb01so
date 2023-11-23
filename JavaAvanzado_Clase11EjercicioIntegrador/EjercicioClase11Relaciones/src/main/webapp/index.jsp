
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.integradorjspjpa.logica.Equipo"%>
<%@page import="com.integradorjspjpa.logica.Partido"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Relaciones</title>
        <!-- Agregar estilos de Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">        
    </head>
    <body>
        <div class="container mt-4">
            <h2>Formulario Equipo</h2>
            <form action="EquipoSv" method="post">
                <div class="form-group">
                    <label for="nombre">Nombre:</label>
                    <input type="text" class="form-control" id="nombre" name="nombre">
                </div>
                <div class="form-group">
                    <label for="ciudad">Ciudad: </label>
                    <input type="text" class="form-control" id="ciudad" name="ciudad">
                </div>

                <button type="submit" class="btn btn-primary">Enviar</button>
            </form>

            <hr>

                <form action="EquipoSv" method="GET">    
                    <button type="submit" class="btn btn-primary">Ver equipos</button>
                </form> 

            <br>
                <!-- Resultados en tabla EQUIPOS -->
                <div class="results-table">
                    <% if (request.getAttribute("resultados") != null) { %>
                        <h3>Equipos registrados:</h3>
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Nombre</th>
                                    <th>Ciudad</th>
                                </tr>
                            </thead>
                            <tbody>
                                <% for (Equipo equipo : (List<Equipo>) request.getAttribute("resultados")) { %>
                                    <tr>
                                        <td><%= equipo.getId() %></td>
                                        <td><%= equipo.getNombre() %></td>
                                        <td><%= equipo.getCiudad() %></td>
                                    </tr>
                                <% } %>
                            </tbody>
                        </table>
                    <% } %>
                </div>
                <br>            
            <hr>
            <h2>Formulario Partido</h2>
            <form action="PartidoSv" method="POST">
                <div class="form-group">
                    <label for="fecha">Fecha:</label>
                    <input type="text" class="form-control" id="fecha_partido" name="fecha_partido">
                </div>     
                <div class="form-group">
                    <label for="equipoLocal">Id equipo Local:</label>
                    <input type="text" class="form-control" id="id_equipoLocal" name="id_equipoLocal">
                </div>                
                <div class="form-group">
                    <label for="equipoVisitante">Id equipo Visitante:</label>
                    <input type="text" class="form-control" id="id_equipoVisitante" name="id_equipoVisitante">
                </div>                
                <div class="form-group">
                    <label for="resultado_local">Resultado equipo Local:</label>
                    <input type="text" class="form-control" id="resultado_equipoLocal" name="resultado_equipoLocal">
                </div>                 
                <div class="form-group">
                    <label for="resultado_visitante">Resultado equipo Visitante:</label>
                    <input type="text" class="form-control" id="resultado_equipoVisitante" name="resultado_equipoVisitante">
                </div>                  
                
                <button type="submit" class="btn btn-primary">Guardar</button>
            </form>            
            <hr>
            <form action="PartidoSv" method="GET">    
                <button type="submit" class="btn btn-primary">Ver partidos</button>
            </form>               
            
            <br>
            <!-- Resultados en tabla PARTIDOS -->
            <div class="results-table">
                <% if (request.getAttribute("partidos") != null) { %>
                    <h3>Partidos registrados:</h3>
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Fecha</th>
                                <th>Equipo Local</th>
                                <th>Equipo Visitante</th>
                                <th>Resultado Equipo Local</th>
                                <th>Resultado Equipo Visitante</th>                                
                            </tr>
                        </thead>
                        <tbody>
                            <% for (Partido partido : (List<Partido>) request.getAttribute("partidos")) { %>
                                <tr>
                                    <td><%= partido.getFecha()%></td>
                                    <td><%= partido.getEquipoLocal().getNombre()%></td>
                                    <td><%= partido.getEquipoVisitante().getNombre()%></td>   
                                    <td><%= partido.getResultado_local()%></td>
                                    <td><%= partido.getResultado_visitante()%></td>
                                </tr>
                            <% } %>
                        </tbody>
                    </table>
                <% } %>
            </div>
            </div>
        <!-- Scripts de Bootstrap -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>
