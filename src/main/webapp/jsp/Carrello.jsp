<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="UTF-8">

<meta name="description" content="">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<!-- Title -->
<title>Michael Jackson Store</title>

<!-- Favicon -->
<link rel="icon" href="img/core-img/favicon.ico">

<!-- Stylesheet -->
<link rel="stylesheet" href="style.css">
</head>
<body>
	<%@include file="/jsp/jspf/Head.jspf"%>

	<!-- ##### Breadcumb Area Start ##### -->
	<section class="breadcumb-area bg-img bg-overlay"
		style="background-image: url(img/bg-img/eyes.jpg);">
		<div class="bradcumbContent">

			<h2>Carrello</h2>
		</div>
	</section>
	<table class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Foto</th>
				<th scope="col">Artista</th>
				<th scope="col">Descrizione</th>
				<th scope="col">Quantita</th>
				<th scope="col">Prezzo</th>
				<th scope="col">Totale</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="LC" items="${listcarrello}">
				<tr>
				<tr>
					<th scope="row"><img src=${LC.foto } alt="" width=60px
						height=60px></th>
					<td>${LC.nome}</td>
					<td>${LC.descrizione}</td>
					<td>${LC.quantita}</td>
					<td>${LC.prezzo}&#x20AC</td>
					<td>${LC.moltiplicazione}&#x20AC</td>
					<form:form autocomplete="off"
						action="eliminazione?idProdotto=${LC.id_prodotto}" method="post"
						modelAttribute="id">
						<form:input type="hidden" value="${LC.id_prodotto}"
							path="id_prodotto"></form:input>
						<form:input type="hidden" value="${sessionScope.utente.idUtente}"
							path="id_utente"></form:input>

						<td><button type="submit">
								<img src="img/core-img/icons8-cestino-pieno-64.png" width="30"
									height="30"></img>
							</button></td>
					</form:form>
				</tr>
			</c:forEach>

			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td>Spese spedizione</td>
				<td>5,00&#x20AC</td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td>Totale</td>
				<td>${spedizione}&#x20AC</td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td><a href="ordineConfermato"><button type="button"
							class="btn btn-secondary">Conferma ordine</button></a></td>
				<td><c:choose>

						<c:when test="${conta.size()==0}">
						<img src="img/core-img/verde.png" width="30" height="30"></img>
						</c:when>
						<c:otherwise>
						<img src="img/core-img/false.png" width="30" height="30"></img>
						</c:otherwise>
						</c:choose>
						</td>
			</tr>

		</tbody>
	</table>


	<%@include file="/jsp/jspf/Footer.jspf"%>
	<!-- ##### All Javascript Script ##### -->
	<!-- jQuery-2.2.4 js -->
	<script src="js/jquery/jquery-2.2.4.min.js"></script>
	<!-- Popper js -->
	<script src="js/bootstrap/popper.min.js"></script>
	<!-- Bootstrap js -->
	<script src="js/bootstrap/bootstrap.min.js"></script>
	<!-- All Plugins js -->
	<script src="js/plugins/plugins.js"></script>
	<!-- Active js -->
	<script src="js/active.js"></script>




</body>
</html>