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
        <form action ="mostrartabla.jsp" method="post">
            <input type="text" name="numero" value="1" />
            <input type="submit" value="Mostrar tabla" name="aceptar" />
        </form>
    </body>
</html>
