<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modules.Conexion"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>

<!DOCTYPE html>
<html lang="es">
    <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
      <title>PROYECTO PROVINCIAS</title>
    </head>
    <body>
      <%
        if(request.getParameterMap().size() == 1) {
          out.println("Nº de parámetros en la petición HTML: " +request.getParameterMap().size());
      %>
      <form>
        <input type="hidden" name="ccaa" value="<%= request.getParameter("ccaa")%>"/>
        <label for="prov">Introduce provincias: </label>
        <input type="text "id="prov" name="prov" autofocus requiered/>
        <button>Guardar</button>
      </form>
      <%
        } else {
          request.setCharacterEncoding("UTF-8");


          //Preparamos la consulta insert
          String nombreProvincia = request.getParameter("prov");
          //Recordar que request.getParameter() SIEMPRE devuelve un String
          String codCCAA = request.getParameter("ccaa");

          //Redactamos consulta sql
          String sql ="INSERT INTO provincia(codCCAA, nomProv)" +
                              "VALUES (" +codCCAA +",'" +nombreProvincia +"') ;";


          //Conectamos con la base de datos
          Connection conexion = Conexion.getConnection("ciudades");
          Statement consulta = conexion.createStatement();

          //Ejecutamos la consulta
          consulta.execute(sql);

          //Cerramos la conexion
          conexion.close();

          //Redirigimos al Index
          response.sendRedirect("http://localhost:8080/provincias");
        }
      %>
    </body>
  </html>