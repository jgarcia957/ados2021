<%-- 
    Document   : _04DeclaracionJSP
    Created on : 25-dic-2019, 12:37:55
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
        <%! int contador = 0; %>
        <h1>Hola! <%= ++contador%>  </h1>
    </body>
</html>
