<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Favoritos</title>
</head>
<body>

	<div>
	
	Viajes Favoritos
	
	</div>
	
	<div>
	
	<table>
	<tr>
	<th>Destino del Viaje</th>
	<th>Duracion del Viaje</th>
	<th>Precio por persona del viaje</th>
	</tr>
	
	<c:forEach items="{Favoritos}" var="viaje">
		<tr>
		
			<td>${viaje.nombre_destino}</td>
			<td>${viaje.duracion_viaje} dias</td>
			<td>${viaje.precio_persona} euros</td>
		</tr>
		
	</c:forEach>
	
	</table>
	
	</div>




</body>
</html>