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
    <title>Administrar Usuario</title>
</head>
<body>
<h1>Lista  Usuario</h1>
<table>
    <tr>
        <td><a href="adminUsuario?action=index" >Ir al menú</a> </td>
    </tr>
</table>

<table border="1" width="100%">
    <tr>
        <td>ID</td>
        <td>NOMBRES</td>
        <td>APELLIDOS</td>
        <td>NOMBRE USUARIO</td>
        <td>CONTRASEÑA</td>
        <td>MAIL</td>
        <td>CELULAR</td>
        <td colspan=2>ACCIONES</td>
    </tr>
    <c:forEach var="usuario" items="${lista}">
        <tr>
            <td><c:out value="${usuario.id}"/></td>
            <td><c:out value="${usuario.nombres}"/></td>
            <td><c:out value="${usuario.apellidos}"/></td>
            <td><c:out value="${usuario.nombre_usuario}"/></td>
            <td><c:out value="${usuario.contraseña}"/></td>
            <td><c:out value="${usuario.mail}"/></td>
            <td><c:out value="${usuario.celular}"/></td>
            <td><a href="adminUsuario?action=showedit&id=<c:out value="${usuario.id}" />">Editar</a></td>
            <td><a href="adminUsuario?action=eliminar&id=<c:out value="${usuario.id}"/>">Eliminar</a> </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
