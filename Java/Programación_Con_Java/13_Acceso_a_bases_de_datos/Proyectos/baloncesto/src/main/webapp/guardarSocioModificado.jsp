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
  <h1>Club de Balocensto</h1>
  <% 
    String actualizacion = "UPDATE socio SET "
                           + "nombre='" + request.getParameter("nombre")
                           + "', estatura=" + Integer.valueOf(request.getParameter("estatura"))
                           + ", edad=" + Integer.valueOf(request.getParameter("edad"))
                           + ", localidad='" + request.getParameter("localidad")
                           + "' WHERE socioID=" + Integer.valueOf(request.getParameter("socioID"));
    Class.forName("com.mysql.jdbc.Driver");
    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/baloncesto", "root", "");

    Statement statement = conexion.createStatement();
    ResultSet resultSet = statement.executeQuery(actualizacion + " ;");
  %>
  <a href="index.jsp" class="btn btn-secondary mt-3">Volver a la página principal</a>
</body>
</html>