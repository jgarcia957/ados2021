<%-- 
    Document   : iniciojuego
    Created on : 22-dic-2019, 11:57:47
    Author     : javi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido a 3 en raya</title>
        
    </head>
    <body>
        <h1>Vamos a jugar a 3 en raya</h1>
        <form action="jugar" method="post">
            <input type ="text" name="tamanyo" value ="3">
            <input type="submit" value="Jugar">
        </form>
    </body>
</html>
