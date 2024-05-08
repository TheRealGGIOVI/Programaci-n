<%-- index.jsp --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="modules.Fruta"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Fruta</title>
    <meta charset="UTF-8" />
    <style> img { width: 20%; } </style>
  </head>
  <body>
    <h1>Fruta</h1>

    <% 
      //Establecemos conexión con la BBDD
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/fruta", "root", "");

      //Establecemos contulta con la BBDD
      Statement consulta = conexion.createStatement();
    
      if(request.getParameterMap().isEmpty()){
    
      
      ResultSet resultado = consulta.executeQuery("SELECT * FROM frutas;");

    %>

    <form method="get" action="index.jsp">
      Introduzca el nombre de una fruta:
      <select name="fruta" id="fruta">
        <% 
          while(resultado.next()) {
            out.println("<option value=\"" + resultado.getString("id") + "\">" +
            resultado.getString("nombre") + "</option>");
          }
         
        %>
      </select>
      <input type="submit" value="OK">
    </form>
    
    <% 
      }else{
        ResultSet resultado = consulta.executeQuery("SELECT * FROM frutas WHERE id = "+
        request.getParameter("fruta") + " ; ");

        //Movemos el cursor al primer (y único en este caso) registro 
        resultado.next();

        //Establecemos codificación UTF-8
        request.setCharacterEncoding("UTF-8"); 
        Fruta fruta = new Fruta(resultado.getString("nombre"),resultado.getString("id"));
        out.println("<h4>Me gusta mucho comer " + fruta.getNombre() +
                    "</h4>");
        out.println(fruta);


        
      }

      //Cerramos conexión
      conexion.close();
    %>
    
  </body>
</html>