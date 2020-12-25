<%-- 
    Document   : catalogo
    Created on : 26-dic-2019, 9:22:30
    Author     : javi
--%>

<%@page import="modelo.Articulo"%> 
<%@page import="modelo.Catalogo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Descripcion</th>
                    <th>Precio</th>
                    <th>Stock</th>
                </tr>
            </thead>
            <tbody>
                <% 
                    //Crear catalogo si aun no esta creado
                    Catalogo catalogo = (Catalogo) request.getSession().getAttribute("catalogo");
                    if(catalogo == null){
                        catalogo = new Catalogo();
                        request.getSession().setAttribute("catalogo", catalogo);
                    }
                    
                    for (Articulo a : catalogo.getArticulos()) {
                %>
                <tr>
                    <td><%=a.getId()%></td>
                    <td><%=a.getDescripcion()%></td>
                    <td><%=a.getPrecio()%></td>
                    <td><%=a.getStock()%></td>
                </tr>
                <% }%>
            </tbody>
        </table>  
        <form action ="edicionarticulo.jsp" method="post">
            <input type="submit" value ="Añadir articulo">
        </form>
    </body>
</html>
