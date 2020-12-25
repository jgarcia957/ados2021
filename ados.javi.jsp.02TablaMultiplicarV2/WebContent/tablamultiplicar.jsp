<%--
    Document   : tabla multiplicar
    Created on : 20-dic-2019, 21:17:56
    Author     : javi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tabla de multiplicar</h1>
        <form action ="tablamultiplicar.jsp" method="post">
            <input type="text" name="numero" value="1" />
            <input type="submit" value="Mostrar tabla" name="aceptar" />
    
        </form>
        </p>
        
        <%-- Comprobamso si el usuario ya ha introducido un valor
        y ha pulsado en el botón o si la pagina se acaba de cargar--%>
        <% if (request.getParameter("numero") != null){
            int num = Integer.parseInt(request.getParameter("numero"));
        %>
        <table border="1">
            <thead>
                <tr>
                    <th colspan="2">Tabla del <%=num%></th>
                </tr>
            </thead>
            <tbody>
                <% for (int i = 1; i<= 10; i++){%>
                <tr>
                    <td> <%= num %> por <%=i%> </td>
                    <td> <%= num * i %> </td>

                </tr>
                <% } %>
            </tbody>
        </table>
        <% } %>

</body>
</html>
 