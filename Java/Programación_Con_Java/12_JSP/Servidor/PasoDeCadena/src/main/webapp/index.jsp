<%-- index.jsp (proyecto PasoDeCadena) --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Paso de cadena</title>
  </head>
  <body>
    <h1>Pasando una cadena de caracteres</h1>
    <form method="get" action="frase.jsp">
      Introduzca el nombre de una fruta:
      <input type="text" name="cadenaComida">
      Introduzca el nombre de una bebida:
      <input type="text" name="cadenaBebida">
      <input type="submit" value="OK">
    </form>
  </body>
</html>
