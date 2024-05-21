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
    Class.forName("com.mysql.jdbc.Driver");
    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/baloncesto", "root", "");

    Statement statement = conexion.createStatement();
    String insert = "INSERT INTO socio VALUES(" +request.getParameter("socioID") 
        +", " +request.getParameter("name") +", " 
        + Integer.valueOf(request.getParameter("estatura")) 
        +", " +Integer.valueOf(request.getParameter("edad")) +", " 
        +request.getParameter("localidad") +")" ;
    
    ResultSet resultSet = statement.executeQuery(insert);

  %>
  <h2>Socio GRABADO CORRECTAMENTE</h2>
  <a href="index.jsp" class="btn btn-primary"><span class="glyphicon glyphicon-home"></span> Página principal</button>

    
</body>
</html>