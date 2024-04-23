<%-- incrementa5.jsp (proyecto Incrementa5) --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head>
<body>
  <%
    double resultado;
    resultado = Double.parseDouble(request.getParameter("numeroIntro")) + 5;
    String cadena = String.format("%s + 5 = %.2f", request.getParameter("numeroIntro"), resultado);
    out.print(cadena);
  %>
</body>
</html>