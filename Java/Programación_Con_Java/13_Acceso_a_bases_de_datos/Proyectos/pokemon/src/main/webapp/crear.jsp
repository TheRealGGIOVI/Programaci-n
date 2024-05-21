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
    <title>Crear Pokémon</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h1 class="mt-5">Crear Pokémon</h1>
        <!-- Formulario para crear un nuevo Pokémon -->
        <form method="post" action="crear.jsp">
            <div class="form-group">
                <label for="nombre">Nombre</label>
                <input type="text" class="form-control" id="nombre" name="nombre" required>
            </div>
            <div class="form-group">
                <label for="numero_pokedex">Número de Pokédex</label>
                <input type="number" class="form-control" id="numero_pokedex" name="numero_pokedex" required>
            </div>
            <div class="form-group">
                <label for="altura">Altura</label>
                <input type="number" step="0.1" class="form-control" id="altura" name="altura" required>
            </div>
            <div class="form-group">
                <label for="peso">Peso</label>
                <input type="number" step="0.1" class="form-control" id="peso" name="peso" required>
            </div>
            <div class="form-group">
                <label for="sprite">URL del Sprite</label>
                <input type="text" class="form-control" id="sprite" name="sprite" required>
            </div>
            <div class="form-group">
                <label for="tipos">Tipos (separados por comas)</label>
                <input type="text" class="form-control" id="tipos" name="tipos" required>
            </div>
            <button type="submit" class="btn btn-primary">Crear</button>
        </form>
        <!-- Botón para volver a la página principal -->
        <a href="index.jsp" class="btn btn-secondary mt-3">Volver a la página principal</a>
        <%
            if (request.getMethod().equalsIgnoreCase("POST")) {
                // Recuperamos los datos del formulario
                String nombre = request.getParameter("nombre");
                int numeroPokedex = Integer.parseInt(request.getParameter("numero_pokedex"));
                double altura = Double.parseDouble(request.getParameter("altura"));
                double peso = Double.parseDouble(request.getParameter("peso"));
                String sprite = request.getParameter("sprite");
                String tipos = request.getParameter("tipos");
                String[] tiposArray = tipos.split(",");

                // Conexión a la base de datos
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemondb", "root", "");

                // Verificamos si el número de Pokédex ya existe
                PreparedStatement checkStmt = conexion.prepareStatement("SELECT COUNT(*) FROM pokemon WHERE numero_pokedex = ?");
                checkStmt.setInt(1, numeroPokedex);
                ResultSet checkResult = checkStmt.executeQuery();
                checkResult.next();
                int count = checkResult.getInt(1);
                if (count > 0) {
                    out.println("<div class='alert alert-danger mt-3'>El número de Pokédex ya existe.</div>");
                } else {
                    // Insertamos el nuevo Pokémon
                    PreparedStatement stmt = conexion.prepareStatement("INSERT INTO pokemon (numero_pokedex, nombre, altura, peso, sprite) VALUES (?, ?, ?, ?, ?)");
                    stmt.setInt(1, numeroPokedex);
                    stmt.setString(2, nombre);
                    stmt.setDouble(3, altura);
                    stmt.setDouble(4, peso);
                    stmt.setString(5, sprite);
                    stmt.executeUpdate();

                    // Insertamos los tipos del Pokémon
                    for (String tipo : tiposArray) {
                        tipo = tipo.trim();

                        // Obtenemos el id_tipo para el nombre del tipo
                        PreparedStatement tipoStmt = conexion.prepareStatement("SELECT id_tipo FROM tipo WHERE nombre = ?");
                        tipoStmt.setString(1, tipo);
                        ResultSet tipoResult = tipoStmt.executeQuery();
                        if (tipoResult.next()) {
                            int tipoId = tipoResult.getInt("id_tipo");
                            PreparedStatement ptStmt = conexion.prepareStatement("INSERT INTO pokemon_tipo (numero_pokedex, id_tipo) VALUES (?, ?)");
                            ptStmt.setInt(1, numeroPokedex);
                            ptStmt.setInt(2, tipoId);
                            ptStmt.executeUpdate();
                        }
                    }

                    out.println("<div class='alert alert-success mt-3'>Pokémon creado correctamente.</div>");
                }
                conexion.close();
            }
        %>
    </div>
</body>
</html>