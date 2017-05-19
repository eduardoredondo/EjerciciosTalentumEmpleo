<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Viajes Favoritos</title>
</head>
<body>

	<div>
	<table>
	<tr>
	<th>Destino del Viaje</th>
	<th>Duracion del Viaje</th>
	<th>Precio por persona del viaje</th>
	<tr>
	
	<c:forEach items="${lista}" var="viaje">
	<tr>
		<td><a href="IntroducirFavorito?id=${viaje.id }">${viaje.nombre_destino}</a></td>
		<td><a href="IntroducirFavorito?id=${viaje.id }">${viaje.duracion_viaje} dias</a></td>
		<td><a href="IntroducirFavorito?id=${viaje.id }">${viaje.precio_persona} euros</a></td>
	
	<tr>
	</c:forEach>
	</table>
	</div>



</body>
</html>