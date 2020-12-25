<%-- 
    Document   : _04MostrarInformacionRecogida
    Created on : 23-dic-2019, 22:51:04
    Author     : javi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            h3{
                color: blue
            }
        </style>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos del pedido</h1>

        <h2>Nombre del cliente</h2>
        <h3><%=request.getParameter("nombre")%> </h3>
               
        <h2>Dirección del cliente</h2>
        <h3><%=request.getParameter("direccion")%> </h3>
        
        <h2>Ingredientes</h2>
        <h3>
        <%
            String[] ingredientes = request.getParameterValues("ingredientes");
            if(ingredientes != null){
                for(String ingrediente: ingredientes){
        %>
                
                    <%= ingrediente %><br>
        <%      } 
            }
        %>
        </h3>
        <h2>Tamaño</h2>
        <h3><%=request.getParameter("tamanyo")%> </h3>
        
        <h2>Extras</h2>
        <h3>
        <%
            String extraqueso = request.getParameter("extraqueso");
            String extradomicilio = request.getParameter("extradomicilio");
            String extraborde = request.getParameter("extraborde");
           
        %>
        
            <% if (extraqueso != null){%> <%= extraqueso%> <br> <% }%>
            <% if (extradomicilio != null){%> <%= extradomicilio%> <br><% }%>
            <% if (extraborde != null){%> <%=extraborde%> <br><% }%>
        
       
        
         </h3>
         <h2>Instrucciones</h2>
        <h3><%=request.getParameter("instrucciones")%> </h3>
        
    </body>
</html>
