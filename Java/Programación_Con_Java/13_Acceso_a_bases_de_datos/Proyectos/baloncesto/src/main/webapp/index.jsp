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
    ResultSet resultSet = statement.executeQuery("SELECT * FROM socio ;" );
  %>
  <br>
  <table>
     <table class="table table-striped">
     <tr><th>Nº de socio</th><th>Nombre</th><th>Estatura</th><th>Edad</th><th>Localidad</th></tr>
        <form method="get" action="grabarSocio.jsp">
          <tr><td><input type="text" name="socioID" size="5"></td>
              <td><input type="text" name="nombre" size="30"></td>
              <td><input type="text" name="estatura" size="5"></td>
              <td><input type="text" name="edad" size="5"></td>
              <td><input type="text" name="localidad" size="20"></td>
              <td><button type="submit" value="Añadir" class="btn btn-primary"><span class="glyphicon glyphicon-plus"></span> Añadir</button></td><td></td></tr>
    <% while(resultSet.next()) { %>
    <tr>
      <td><%=resultSet.getString("socioID") %></td>
      <td><%=resultSet.getString("nombre") %></td>
      <td><%=resultSet.getString("estatura") %></td>
      <td><%=resultSet.getString("edad") %></td>
      <td><%=resultSet.getString("localidad") %></td>
      <td>
        <form  action="editar.jsp" method="post">
          <input type="hidden" name="id" value="<%=resultSet.getString("socioID") %>" />
          <button class="btn brn-info">Editar </button>
        </form>
      </td>
       <td>
        <form  action="borrar.jsp" method="post">
          <input type="hidden" name="id" value="<%=resultSet.getString("socioID") %>" />
          <button class="btn brn-info">Borrar </button>
        </form>
      </td>
      <% } %>
    </tr>
</body>
</html>