<%-- 
    Document   : edicionarticulo
    Created on : 26-dic-2019, 9:53:37
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
        <form action="anyadirarticulo.jsp" method="post">
            <table border="1">
                <tbody>
                    <tr>
                        <td>Identificador</td>
                        <td><input type="text" name="id"></td>
                    </tr>
                    <tr>
                        <td>Descripcion</td>
                        <td><input type="text" name="descripcion"></td>
                    </tr>
                    <tr>
                        <td>Precio</td>
                        <td><input type="text" name="precio"></td>
                    </tr>
                    <tr>
                        <td>Stock</td>
                        <td><input type="text" name="stock"></td>
                    </tr>
                </tbody>
            </table>
            <input type="submit" value="Aceptar">
        </form>
    </body>
</html>
