<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>
  <h1>Club de Baloncesto</h1>
  <% 
    int idSocio = Integer.parseInt(request.getParameter("id"));
    Class.forName("com.mysql.jdbc.Driver");
    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/baloncesto", "root", "");

    Statement statement = conexion.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT * FROM socio WHERE socioID = " +idSocio +" ;");
    // Verificamos si hay resultados antes de intentar obtener datos
    if(resultSet.next()) {
        // Obtenemos el número de socio de la primera fila (suponiendo que solo hay una fila)
        String numeroSocio = resultSet.getString("socioID");
        String nombreSocio = resultSet.getString("nombre");
        String edadSocio = resultSet.getString("edad");
        String alturaSocio = resultSet.getString("estatura");
        String localidadSocio = resultSet.getString("localidad");  
  %>
  <div class="container">
        <h2>Modificación de socio</h2>
        <form action="guardarSocioModificado.jsp" method="get">
            <div class="form-group">
                <label for="numeroSocio">Nº de socio:</label>
                <input type="text" id="numeroSocio" name="numeroSocio" value="<%= numeroSocio %>" readonly>
            </div>
            <div class="form-group">
                <label for="nombre">Nombre:</label>
                <input type="text" id="nombre" name="nombre" value="<%= nombreSocio %>">
            </div>
            <div class="form-group">
                <label for="estatura">Estatura (en cm):</label>
                <input type="number" id="estatura" name="estatura" value="<%= alturaSocio %>">
            </div>
            <div class="form-group">
                <label for="edad">Edad:</label>
                <input type="number" id="edad" name="edad" value="<%= edadSocio %>">
            </div>
            <div class="form-group">
                <label for="localidad">Localidad:</label>
                <input type="text" id="localidad" name="localidad" value="<%= localidadSocio %>">
            </div>
            <div class="form-actions">
                <button type="button" class="btn btn-danger" onclick="window.location.href='index.jsp'">Cancelar</button>
                <button type="submit" class="btn btn-success">Aceptar</button>
            </div>
        </form>
    </div>
    <% } %>
</body>
</html>