<%-- 
    Document   : MostrarPremio.jsp
    Created on : 25-dic-2019, 11:23:22
    Author     : javi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar premio</title>
    </head>
    <body>
        <% 
            String numero = request.getParameter("numero");
            Double premio = (Double) (request.getAttribute("premio"));
        %>
        <% if(premio == 0) {%>
            <h1> El numero <%=numero%> no ha sido premiado </h1>
        <% } else { %>
             <h1> Enhorabuena!!! Has ganado  <%=premio%> euros </h1>
        <% } %>
        
        <form action="ComprobarLoteria.jsp" method="post">
            <input type="submit" value="Volver">
            
        </form>
    </body>
</html>
