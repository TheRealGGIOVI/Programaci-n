<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Borrar Tipo del Pokémon</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h1 class="mt-5">Borrar Tipo del Pokémon</h1>
        <%
            // Recuperamos los parámetros
            int numPokedex = Integer.parseInt(request.getParameter("numPokedex"));
            int idTipo = Integer.parseInt(request.getParameter("idTipo"));
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemondb", "root", "");

            // Borramos el tipo del Pokémon
            PreparedStatement stmt = conexion.prepareStatement("DELETE FROM pokemon_tipo WHERE numero_pokedex = ? AND id_tipo = ?");
            stmt.setInt(1, numPokedex);
            stmt.setInt(2, idTipo);
            int rows = stmt.executeUpdate();

            if (rows > 0) {
                out.println("<div class='alert alert-success mt-3'>Tipo del Pokémon borrado correctamente.</div>");
            } else {
                out.println("<div class='alert alert-danger mt-3'>No se pudo borrar el tipo del Pokémon.</div>");
            }
            conexion.close();
        %>
        <!-- Botón para volver a la página principal -->
        <a href="index.jsp" class="btn btn-secondary mt-3">Volver a la página principal</a>
    </div>
</body>
</html>