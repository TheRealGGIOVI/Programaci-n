<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Detalles del Pokémon</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h1 class="mt-5">Detalles del Pokémon</h1>
        <%
            // Conexión a la base de datos
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemondb", "root", "");
            int numPokedex = Integer.parseInt(request.getParameter("numPokedex"));
            Statement consulta = conexion.createStatement();

            // Obtener la información del Pokémon
            String queryPokemon = "SELECT p.nombre, p.sprite, p.altura, p.peso, GROUP_CONCAT(t.nombre SEPARATOR ', ') AS tipos " +
                                  "FROM pokemon p " +
                                  "LEFT JOIN pokemon_tipo pt ON p.numero_pokedex = pt.numero_pokedex " +
                                  "LEFT JOIN tipo t ON pt.id_tipo = t.id_tipo " +
                                  "WHERE p.numero_pokedex = " + numPokedex + " " +
                                  "GROUP BY p.numero_pokedex";
            ResultSet resultadoPokemon = consulta.executeQuery(queryPokemon);

            if (resultadoPokemon.next()) {
        %>
        <h2><%= resultadoPokemon.getString("nombre") %></h2>
        <img src="<%= resultadoPokemon.getString("sprite") %>" alt="<%= resultadoPokemon.getString("nombre") %>" width="100" height="100">
        <ul type="square">
            <li>Altura: <%= resultadoPokemon.getDouble("altura") %> m</li>
            <li>Peso: <%= resultadoPokemon.getDouble("peso") %> kg</li>
            <li>Tipos: <%= resultadoPokemon.getString("tipos") %></li>
        </ul>

        <h3>Tipos del Pokémon:</h3>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Tipo</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
            <%
                // Obtener la descripción de los tipos del Pokémon
                String queryTipos = "SELECT t.id_tipo, t.nombre, t.descripcion " +
                                    "FROM tipo t " +
                                    "JOIN pokemon_tipo pt ON t.id_tipo = pt.id_tipo " +
                                    "WHERE pt.numero_pokedex = " + numPokedex;
                ResultSet resultadoTipos = consulta.executeQuery(queryTipos);
                while (resultadoTipos.next()) {
            %>
                <tr>
                    <td><%= resultadoTipos.getString("nombre") %></td>
                    <td>
                        <a href="editar.jsp?numPokedex=<%= numPokedex %>&idTipo=<%= resultadoTipos.getInt("id_tipo") %>" class="btn btn-warning">Editar</a>
                        <a href="borrar.jsp?numPokedex=<%= numPokedex %>&idTipo=<%= resultadoTipos.getInt("id_tipo") %>" class="btn btn-danger">Borrar</a>
                    </td>
                </tr>
            <%
                }
            %>
            </tbody>
        </table>
        <%
            } else {
                out.println("No se encuentra el Pokémon.");
            }
            conexion.close();
        %>
        <!-- Botón para volver a la página principal -->
        <a href="index.jsp" class="btn btn-secondary mt-3">Volver a la página principal</a>
    </div>
</body>
</html>