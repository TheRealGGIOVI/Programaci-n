<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>

<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>pokemon</title>
</head>
<body>
 <h1>Pokemón</h1>
  <% 
    Class.forName("com.mysql.jdbc.Driver");
    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemondb", "root", "");

    Statement statement = conexion.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT * FROM pokemon WHERE numero_pokedex = " +request.getParameter("numPokedex") +" ;");

    if(!resultSet.next()) {
      out.println("No se encuentra tipo");
    } else {
  %>
  <h2><%= resultSet.getString("nombre") %></h2>
  <h2><img src="<%= resultSet.getString("sprite")%>"></h2>
  <ul type="square">
    <li>Altura: <%= resultSet.getString("altura")%> m</li>
    <li>Peso: <%= resultSet.getString("peso")%> kg</li>
  </ul>

  <% 
    String sql = "SELECT id_tipo FROM tipo T JOIN id_tipo FROM pokemon_tipo TP ON ()";
  %>
  <% } %>
  <%
    conexion.close();
  %>
  
</body>
</html>