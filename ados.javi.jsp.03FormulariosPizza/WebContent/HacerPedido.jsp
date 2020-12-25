<%-- 
    Document   : 04FormularioRecogerDatos
    Created on : 23-dic-2019, 22:39:47
    Author     : javi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                font-size: 22px;
                font-family: Arial;
            }
            td.rotulo {
                background-color: #8A2908;
                text-align: center;
                align-items: center;
                
                color: #FFFFFF ;
                
                    
            }
        </style>
    </head>
    <body>
        <form name ="pedido" action="MostrarDatosPedido.jsp" method ="post">
            <table border="0" cellspacing="10" cellpadding="5" width="50%" bgcolor = "#FE9A2E">
                <thead>
                    <tr bgcolor = "#B45F04" >
                        <th colspan="4" >
                            <p align = "center"> 
                                <font face = "arial" size = "5" color = "#8A2908">
                                <b> - Pedido de pizza - </b>
                                </font>
                            </p>
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td class="rotulo"> Nombre</td>
                        <td colspan="2"><input type="text" name="nombre" value="" size ="60"/></td>
                    </tr>
                    <tr>
                        <td class="rotulo">Direccion</td>
                        <td colspan="2"><input type="text" name="direccion" value="" size ="60"/></td>
                    </tr>
                    <tr>
                        <td class="rotulo">Ingredientes</td>
                        <td class="rotulo">Tamaño</td>
                        <td class="rotulo">Extras</td>
                    </tr>
                    <tr>
                        <td>
                            <select multiple name="ingredientes" size="4">
                                <option>Queso</option>
                                <option>Pimiento</option>
                                <option>Cebolla</option>
                                <option>Chamipiñon</option>
                                <option>Anchoas</option>
                                <option>Chorizo</option>
                                <option>Atun</option>
                            </select>
                        </td>
                        <td>
                            <input type="radio" name="tamanyo" value="Pequeña" /> Pequeña <br>
                            <input type="radio" name="tamanyo" value="Mediana" checked="" /> Mediana <br>
                            <input type="radio" name="tamanyo" value="Grande" /> Grande <br>
                        </td>
                        <td>
                            <input type="checkbox" name="extradomicilio" value ="Entrega a domicilio"/>Entrega a domicilio <br> 
                            <input type="checkbox" name="extraqueso" value ="Doble de queso"/>Doble de queso <br>
                            <input type="checkbox" name="extraborde" value ="Bordes rellenos"/>Bordes rellenos<br>
                            
                        </td>
                    </tr>
                    <tr>
                        <td class = "rotulo" colspan= "3">                         
                            Instrucciones especiales 
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3">
                            <textarea name="instrucciones" rows="4" cols="80">
                            </textarea>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3" align="center">
                            <input type="submit" value="Enviar pedido" />
                            <input type="reset" value="Borrar formulario" />
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
