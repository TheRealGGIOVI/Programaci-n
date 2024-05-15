<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modules.Conexion"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>

<%
    
  //Conectamos con la BBDD
  Connection conexion = Conexion.getConnection("ciudades");
  Statement consulta = conexion.createStatement();
  out.println("BORRANDO PROVINCIA CON CLAVE PRIMARIA codProv = " +request.getParameter("cod"));

  //El método executeQuery devuelve un objeto de la clase ResultSet, por lo que
  //únicamente se utilizará para consultas de tipo SELECT

  //El método excecute devuelve TRUE|FALSE, por lo que lo utilizaremos preferentemente 
  //tan solo par alas consultas de tipo INSERT, DELETE Y UPDATE 

  consulta.execute("DELETE FROM provincia WHERE codProv = " +request.getParameter("cod") +" ;");

  //Cerramos la conexión
  connexion.close();

  //Redirigimos a alguna página JSP a nivel servidor

  response.setStatus(response.SC_FOUND);    //Establece estado de respuesta HTTP "302 found"
  response.setHeader("Location", "http://localhost:8080/provincias" ); //Establecer la cabecera Location en la respuesta HTTP con la URL a la que

  //Forma 2: Realizamos una dirección HTTP al navegador del cliente de forma más simplificada
  response.sendRedirect("http://localhost:8080/provincias");

%>