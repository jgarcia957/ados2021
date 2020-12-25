<%-- 
    Document   : mostrararticulo
    Created on : 26-dic-2019, 10:21:08
    Author     : javi
--%>

<%@page import="modelo.Catalogo"%> 
<%@page import="modelo.Articulo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Articulo</title>
    </head>
    <body>
        <% 
            
            //Obtener datos del formulario
            String sId = request.getParameter("id");
            String sDesc = request.getParameter("descripcion");
            String sPrecio = request.getParameter("precio");
            String sStock = request.getParameter("stock");
            
            //Crear un articulo
            Articulo a = new Articulo();
            a.setId(Integer.parseInt(sId));
            a.setDescripcion(sDesc);
            a.setPrecio(Double.parseDouble(sPrecio));
            a.setStock(Integer.parseInt(sStock));
            
            //Añadirlo al catalogo
            Catalogo c = (Catalogo) request.getSession().getAttribute("catalogo");
            c.getArticulos().add(a);      
        %>
        <h1> Se ha añadido el articulo</h1>
        <form  action="catalogo.jsp">
            <input type="submit" value="Volver"/>
        </form>
    </body>
   
</html>
