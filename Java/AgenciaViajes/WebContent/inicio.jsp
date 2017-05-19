<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agencia de Viajes</title>
</head>
<body>


	<p>Agencia de Viajes</p>
	
	<div>
	Numero de usuarios en la web:
	
	${applicationScope.promocion.numeroUsuarios}
	
	</div>

	<div>
	Viaje en Promocion:
	
	Destino:
	${applicationScope.promocion.nombre_destino}
	
	Duracion;
	${applicationScope.promocion.duracion_destino} dias
	
	Precio:
	${applicationScope.promocion.precio_persona} euros
	
	</div>
	
	<div>
	<table>
	<tr>
	<td><a href="listar.jsp">Lista de Viajes</a></td>
	<tr>
	<tr>
	<td><a href="formularioBuscar.jsp">Buscar Viaje</a></td>
	<tr>
	</table>
	
	
	</div>

</body>
</html>