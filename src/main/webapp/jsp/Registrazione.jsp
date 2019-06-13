<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@include file="/jsp/jspf/Head.jspf"%>

	<!-- ##### Breadcumb Area Start ##### -->
	<section class="breadcumb-area bg-img bg-overlay"
		style="background-image: url(img/bg-img/eyes.jpg);">
		<div class="bradcumbContent">

			<h2>Registrazione</h2>
		</div>
	</section>
	<!-- ##### Breadcumb Area End ##### -->

	<!-- ##### Registration Area Start ##### -->
	<section class="login-area section-padding-100">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-12 col-lg-8">
					<div class="login-content">
						<h3>Benvenuto</h3>
						<!-- Login Form -->
						<div class="login-form">
							<form:form autocomplete="off" action="regNuovoUtente"
								method="post" modelAttribute="utente">
								<div class="form-group">
									<label for="exampleInputEmail1">Nome</label>
									<form:errors path="nome"></form:errors>
									<form:input type="text" class="form-control" placeholder="Nome"
										path="nome"></form:input>
								</div>
								<div class="form-group">
									<label for="exampleInputEmail1">Cognome</label>
									<form:errors path="cognome"></form:errors>
									<form:input type="text" class="form-control"
										placeholder="Cognome" path="cognome"></form:input>
								</div>
								<div class="form-group">
									<label for="exampleInputEmail1">E-mail</label>
									<form:errors path="email"></form:errors>
									<form:input type="text" class="form-control"
										placeholder="E-mail" path="email"></form:input>
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1">Password</label>
									<form:errors path="password"></form:errors>
									<form:input type="password" class="form-control"
										placeholder="Password" path="password"></form:input>
								</div>
								<button type="submit" class="btn oneMusic-btn mt-30">Registrati!</button>
							</form:form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- ##### Registration Area End ##### -->

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