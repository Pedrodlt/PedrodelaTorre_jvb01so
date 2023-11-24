<%-- 
    Document   : index
    Created on : 21 nov 2023, 15:38:06
    Author     : pedro
--%>

<%@page import="java.util.Comparator"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.votacion.votacionpartido.logica.Votacion"%>
<%@page contentType="text/html charset=UTF-8" pageEncoding="UTF-8"%><!-- esta linea tambien para ñ y acentos -->
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Elecciones Estudiantiles</title>
    <!-- Agrega la referencia a Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body class="container mt-5">

    <h2 class="mb-4">Votacion Estudiantes</h2>

    <form action="VotacionSv" method="post">
        <div class="form-group">
            <label>Selecciona tu partido:</label>
            <div class="form-check">
                <input type="radio" name="partido" value="PartidoA" class="form-check-input">
                <label class="form-check-label">Partido A</label>
            </div>
            <div class="form-check">
                <input type="radio" name="partido" value="PartidoB" class="form-check-input">
                <label class="form-check-label">Partido B</label>
            </div>
            <div class="form-check">
                <input type="radio" name="partido" value="PartidoC" class="form-check-input">
                <label class="form-check-label">Partido C</label>
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Votar</button>
    </form>

    <br>

    <form action="VotacionSv" method="get">
        <button type="submit" class="btn btn-success">Mostrar resultados</button>
    </form>
    <br>
    <!-- Resultados en tabla EQUIPOS -->
    <div class="results-table">
    <% if (request.getAttribute("resultados") != null) { %>
        <h3>Votos registrados:</h3>
        <table class="table">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Votos</th>
                </tr>
            </thead>
            <tbody>
               <% 
                // Recogemos los datos traidos del servlet en "resultados" y los guardamos en una lista
                List<Map.Entry<String, Integer>> resultadosList = new ArrayList<>(((Map<String, Integer>) request.getAttribute("resultados")).entrySet());
                // Ordenamos la lista por orden alfabético utilizando un sort y el Comparator
                resultadosList.sort(Comparator.comparing(Map.Entry::getKey));
                %>
                <!-- Recorremos la lista mapeada para pintar tanto el nombre como la cantidad de ellos, utilizando un Map.Entry para los valores-->
                <% for (Map.Entry<String, Integer> result : resultadosList) { %>
                    <tr>
                        <td><%= result.getKey() %></td>
                        <td><%= result.getValue() %></td>
                    </tr>
                <% } %>
            </tbody>
        </table>
    <% } else { %>
        <p>No hay resultados disponibles.</p>
    <% } %>
    </div>
    <!-- Scripts de Bootstrap -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>
