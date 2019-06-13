<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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

	<section class="breadcumb-area bg-img bg-overlay"
		style="background-image: url(img/bg-img/eyes.jpg);">
		<div class="bradcumbContent">

			<h2>News</h2>
		</div>
	</section>
	<!-- ##### Breadcumb Area End ##### -->

	<!-- ##### Events Area Start ##### -->
	<section class="events-area section-padding-100">
		<div class="container">
			<div class="row">

				<!-- Single Event Area -->
				<div class="col-12 col-md-6 col-lg-4">
					<div class="single-event-area mb-30">
						<div class="event-thumbnail">
							<img src="img/bg-img/51Wm8TQGLfL._SY450_.jpg" alt="">
						</div>
						<div class="event-text">
							<h4>Michael Jackson Legacy Day</h4>
							<div class="event-meta-data">
								<a href="#" class="event-place">Edenlandia</a> <a href="#"
									class="event-date">29 Agosto 2019</a>
							</div>
						</div>
					</div>
				</div>

				<!-- Single Event Area -->
				<div class="col-12 col-md-6 col-lg-4">
					<div class="single-event-area mb-30">
						<div class="event-thumbnail">
							<img src="img/bg-img/IMG-20140730-00268.jpg" alt="">
						</div>
						<div class="event-text">
							<h4>Birthday MJ</h4>
							<div class="event-meta-data">
								<a href="#" class="event-place">O2 Arena</a> <a href="#"
									class="event-date">25 Giugno 2019</a>
							</div>
						</div>
					</div>
				</div>

				<!-- Single Event Area -->
				<div class="col-12 col-md-6 col-lg-4">
					<div class="single-event-area mb-30">
						<div class="event-thumbnail">
							<img src="img/bg-img/1425b6851cebc3c8b71ae5439eb227be.jpg" alt="">
						</div>
						<div class="event-text">
							<h4>MJ Anniversary</h4>
							<div class="event-meta-data">
								<a href="#" class="event-place">Stadio Flaminio</a> <a href="#"
									class="event-date">25 Giugno 2019</a>
							</div>
						</div>
					</div>
				</div>

			</div>


		</div>
	</section>
	<!-- ##### Events Area End ##### -->

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