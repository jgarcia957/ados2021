<%-- 
    Document   : _03ScripletMesAleatorio
    Created on : 23-dic-2019, 21:47:58
    Author     : javi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Scriplet mes aleatorio</title>
    </head>
    <body>
        <h1>Mes generado al azar mediante scriplet</h1>
        Un scriplet es código java que se entrelaza con el html
        <h2>
        <%
            int mes = (int) (1 + Math.random() * 12);
            if (mes == 1) {
        %>
            enero 
        <%   } else if (mes == 2) { %>
            febrero
        <%   } else if (mes == 3) { %>
            marzo
        <%   } else if (mes == 4) { %>
            abril
        <%   } else if (mes == 5) { %>
            mayo
        <%   } else if (mes == 6) { %>
            junio
        <%   } else if (mes == 7) { %>
            julio
        <%   } else if (mes == 8) {%>
            agosto
        <%   } else if (mes == 9) { %>
            septiembre
        <%   } else if (mes == 10) { %>
            octubre
        <%   } else if (mes == 11) { %>
            noviembre
        <%   } else if (mes == 12) { %>
            diciembre
        <%   } %>
        
        </h2>
        
        


    </body>
</html>
