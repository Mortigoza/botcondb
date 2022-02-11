<%--
  Created by IntelliJ IDEA.
  User: cecilia
  Date: 07/02/2022
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Actualizar Usuario</title>
</head>
<body>
<h1>Actualizar Usuario</h1>
<form action="adminUsuario?action=editar" method="post" >
    <table>
        <tr>
            <td><label>Id</label></td>
            <td><input type="text" name="id" value="<c:out value="${usuario.id}"></c:out>" ></td>
        </tr>
        <tr>
            <td><label>Nombres</label></td>
            <td><input type="text" name="nombres" value='<c:out value="${usuario.nombres}"></c:out>' ></td>
        </tr>
        <tr>
            <td><label>Apellidos</label></td>
            <td><input type="text" name="apellidos" value='<c:out value="${usuario.apellidos}"></c:out>' ></td>
        </tr>
        <tr>
            <td><label>Nombre de usuario</label></td>
            <td><input type="text" name="nombre de usuario" value='<c:out value="${usuario.nombre_usuario}"></c:out>' ></td>
        </tr>
        <tr>
            <td><label>Contraseña</label></td>
            <td><input type="text" name="contraseña" value='<c:out value="${usuario.contraseña }"></c:out>' ></td>
        </tr>

        <tr>
            <td><label>Mail</label></td>
            <td><input type="text" name="mail" value='<c:out value="${usuario.mail }"></c:out>' ></td>
        </tr>

        <tr>
            <td><label>Celular</label></td>
            <td><input type="text" name="celular" value='<c:out value="${usuario.celular }"></c:out>' ></td>
        </tr>
    </table>

    <input type="submit" name="registrar" value="Guardar">
</form>

</body>
</html>
