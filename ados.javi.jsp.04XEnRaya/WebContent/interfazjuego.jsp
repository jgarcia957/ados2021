<%-- 
    Document   : interfazjuego
    Created on : 22-dic-2019, 12:33:38
    Author     : javi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Juego3Raya"%>

<jsp:useBean id="juego" scope="session" class="modelo.Juego3Raya" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type='text/javascript'>
            function cellClick(f, c) {
                document.getElementById("txtfila").value = f;
                document.getElementById("txtcol").value = c;
                document.getElementById("formjugar").submit();
            }

        </script>
        <style>
            table {
                border-collapse: collapse;
            }

            td {
                border: 1px solid black;
            }
            td, th{
                width: 50px;
                height: 50px;
                text-align: center;
                vertical-align: center;
            }
            td:hover {background-color: #f5f5f5;}
            td.seleccionada { background-color: #a9a9a9 }
        </style>
    </head>
    <body>

        <%
            Juego3Raya jg = (Juego3Raya) (request.getSession().getAttribute("juego"));
            int[][] tablero = jg.getTablero();
            int jugador = jg.getJugadorActual();
            int ganador = jg.getJugadorGanador();

        %>

        <h1>Juego del <%= tablero.length%> en raya </h1>
        <% if (ganador != 0) {%>
           <h2> Fin de la partida. Ha ganado el jugador <%=ganador%> </h2>
        <%} else {%>
           <h2> Es el turno del jugador <%=jugador%> </h2>
        <% } %>

        <table>
            <tr> <th></th>
                    <%for (int i = 0; i < tablero.length; i++) { //Encabezados de columna %>
                <th> <%= i + 1%> </th>
                    <% }%>
            </tr>
            <%for (int i = 0; i < tablero.length; i++) { //Encabezado de fila %>
            <tr><th> <%=i + 1%> </th>
                    <%for (int j = 0; j < tablero.length; j++) { //Encabezados de columna 
                            String simbolo = "";
                            boolean seleccionada = jg.getFilaOrigen() == i && jg.getColOrigen() == j;

                            if (tablero[i][j] == 1) {
                                simbolo = "X";
                            } else if (tablero[i][j] == 2) {
                                simbolo = "O";
                            }

                    %>
                    <% if (seleccionada) {%>
                <td class = "seleccionada" onclick= "cellClick(<%=i%>,<%=j%>);"> <%=simbolo%></td>
                <% } else {%>
                <td onclick= "cellClick(<%=i%>,<%=j%>);"> <%=simbolo%> </td>
                <%}%>
                <% }%>
            </tr>
            <% }%>
        </table>
        <form action = "jugar" method="post" id = "formjugar">
            <input type ="hidden" name="filaseleccionada" value="1" id="txtfila">
            <input type ="hidden" name="columnaseleccionada" value = "1" id="txtcol">
        </form>
    </body>
</html>
