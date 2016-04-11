<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Student Enrollment Detail Confirmation</title>
	<link href="<c:url value='/static/css/custom.css' />" rel="stylesheet"></link>
</head>
<body>
	<div class="success">
		Cadastro efetuado com sucesso.
		<br>
		<br>			
		O cliente  ${costumer.firstName}  ${costumer.lastName} com o email ${costumer.email}, foi inserido em nossa base.
		<br>
		
		Sua data de nascimento é:
		<fmt:formatDate value="${costumer.dateBorn}" pattern="dd/MM/yy" />	
		
		Seu genero é  ${costumer.sex}
		<c:if test="${costumer.sex} == 'M'}">
   			Masculino
		</c:if>	
		<c:if test="${costumer.sex} == 'F'}">
   			Feminio
		</c:if>	
		1
	</div>
</body>
</html>