<%-- 
    Document   : ComprobarLoteria
    Created on : 24-dic-2019, 18:28:24
    Author     : javi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compruebe su numero</title>
    </head>
    <body>
        <form action="comprobador" method="post">
            <h1> Compruebe su décimo de lotería </h1>
            Numero: <input type="text" name="numero" value="" size="10" />
            Importe jugado: <input type="text" name="cantidad" value="20" size="10" />
            <input type="submit" value = "Comprobar">
        </form>
    </body>
</html>
