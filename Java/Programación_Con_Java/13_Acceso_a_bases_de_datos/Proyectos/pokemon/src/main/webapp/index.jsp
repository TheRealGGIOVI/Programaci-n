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
    ResultSet resultSet = statement.executeQuery("SELECT * FROM pokemon ;" );
  %>
  <table>
    <tr>
        <th>#</th>
        <th>Nombre del Pokémon</th>
    </tr>
    <% while (resultSet.next()) { %>
        <tr>
            <td><%= resultSet.getInt("numero_pokedex") %></td>
            <td><%= resultSet.getString("nombre") %></td>
            <td><img src="<%= resultSet.getString("sprite") %>"></td>
            <td>
              <form action="detalles.jsp" method="post">
                <input type="hidden" name="numPokedex" value="<%= resultSet.getInt("numero_pokedex") %>"/>
                <button class="btn brn-info">Detalles</button>
              </form>
            </td>
              
              
        </tr>
    <% } %>
  </table>
  <%
    conexion.close();
  %>
  
</body>
</html>