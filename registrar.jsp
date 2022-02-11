<%--
  Created by IntelliJ IDEA.
  User: cecilia
  Date: 07/02/2022
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registrar Usuario</title>
</head>
<body>
<h1>Registrar Usuario</h1>
<form action="adminUsuario?action=registrar" method="post">
    <table border="1" align="center">
        <tr>
            <td><a>Nombres:</a></td>
            <td><input type="text" name="nombres"/></td>
        </tr>
        <tr>
            <td><a>Apellidos:</a></td>
            <td><input type="text" name="apellidos"/></td>
        </tr>
        <tr>
            <td><a>Nombre de usuario:</a></td>
            <td><input type="text" name="nombre_usuario"/></td>
        </tr>
        <tr>
            <td><a>Contraseña:</a></td>
            <td><input type="text" name="contraseña"/></td>
        </tr>
        <tr>
            <td><a>Mail:</a></td>
            <td><input type="text" name="mail"/></td>
        </tr>
        <tr>
            <td><a>Celular:</a></td>
            <td><input type="text" name="celular"/></td>
        </tr>

    </table>
    <br>
    <tr>
        <td><input type="submit" value="Agregar" name="agregar"></td>
    </tr>
</form>
</body>
</html>