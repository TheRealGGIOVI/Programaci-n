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
    <title>Editar Tipo del Pokémon</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h1 class="mt-5">Editar Tipo del Pokémon</h1>
        <%
            // Recuperamos los parámetros
            int numPokedex = Integer.parseInt(request.getParameter("numPokedex"));
            int idTipo = Integer.parseInt(request.getParameter("idTipo"));
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemondb", "root", "");

            // Obtener el tipo actual
            String tipoActual = "";
            Statement consulta = conexion.createStatement();
            ResultSet resultadoTipo = consulta.executeQuery("SELECT nombre FROM tipo WHERE id_tipo = " + idTipo);
            if (resultadoTipo.next()) {
                tipoActual = resultadoTipo.getString("nombre");
            }
        %>
        <!-- Formulario para editar el tipo del Pokémon -->
        <form method="post" action="grabarPokemonEditado.jsp?numPokedex=<%= numPokedex %>&idTipo=<%= idTipo %>">
            <div class="form-group">
                <label for="tipo">Tipo actual: <%= tipoActual %></label>
                <select class="form-control" id="tipo" name="tipo" required>
                    <%
                        // Obtener todos los tipos de Pokémon
                        ResultSet resultadoTodosTipos = consulta.executeQuery("SELECT id_tipo, nombre FROM tipo");
                        while (resultadoTodosTipos.next()) {
                    %>
                    <option value="<%= resultadoTodosTipos.getInt("id_tipo") %>"><%= resultadoTodosTipos.getString("nombre") %></option>
                    <%
                        }
                    %>
                </select>
            </div>
            <button type="submit" class="btn btn-primary">Guardar cambios</button>
        </form>
        <!-- Botón para volver a la página principal -->
        <a href="index.jsp" class="btn btn-secondary mt-3">Volver a la página principal</a>
    </div>
</body>
</html>