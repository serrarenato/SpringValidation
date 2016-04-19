<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirmação</title>
<link href="<c:url value='/static/css/bootstrap.css' />"
	rel="stylesheet"></link>
</head>
<body>
	<div class="container">
		<div class="well col-md-6">
			<h1>Cadastro efetuado com sucesso.</h1>
			<br> <br>
			<p>O cliente ${costumer.firstName} ${costumer.lastName} com o
				email ${costumer.email}, foi inserido em nossa base.</p>
			<br>
			<p>
				Sua data de nascimento é:

				<fmt:formatDate value="${costumer.dateBorn}" pattern="dd/MM/yy" />
				.
			</p>
			<p>
				Seu genero é
				<c:if test="${costumer.sex == 'M'}">
   			Masculino
				</c:if>
				<c:if test="${costumer.sex == 'F'}">
   			Feminio
				</c:if>
			</p>

		</div>
	</div>
</body>
</html>