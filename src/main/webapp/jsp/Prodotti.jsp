<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel=stylesheet type="text/css" href="css/Arrow.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">


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

			<h2>Albums</h2>
		</div>
	</section>
	<!-- ##### Breadcumb Area End ##### -->

	<!-- ##### Album Catagory Area Start ##### -->


	<section class="album-catagory section-padding-0-0">
		<div class="container">
			<div class="row">
				<div class="col-12">
					<div
						class="browse-by-catagories catagory-menu d-flex flex-wrap align-items-center mb-70">
					</div>
				</div>
			</div>
			<a href="impaginazione?Pagina=<<"><img
				src="img/core-img/arrowheads-pointing-to-the-left.png" width="30"
				height="30" style="margin-bottom: 10px"></img></a> <a
				href="impaginazione?Pagina=<"><img
				src="img/core-img/left-arrow.png" width="30" height="30"
				style="margin-bottom: 10px"></img></a> <a href="impaginazione?Pagina=>"><img
				src="img/core-img/right-arrow.png" width="30" height="30"
				style="margin-bottom: 10px"></img></a> <a href="impaginazione?Pagina=>>"><img
				src="img/core-img/forward-button.png" width="30" height="30"
				style="margin-bottom: 10px"></img></a>
			<div class="row oneMusic-albums">

				<c:forEach var="P" items="${prodottodto}">
					<tr>


						<!-- Single Album -->
						<div
							class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item t c p">
							<div class="single-album">
								<a href="acquista?idProdotto=${P.idProdotto}"><button
										type="button" class="btn btn-outline-dark"
										style="width: 160px">Acquista</button></a> <img
									src=${P.foto
									} alt="">

								<div class="album-info">
									<a href="#">
										<h5>${P.descrizione}</h5>
									</a>
									<p>${P.nome}</p>
									<p>${P.categoria.categoria}</p>
									<p>${P.prezzo}&#x20AC</p>

								</div>
							</div>
						</div>
				</c:forEach>

			</div>
		</div>
	</section>




	<!-- ##### Album Catagory Area End ##### -->

	<!-- ##### Song Area Start ##### -->
	<div class="one-music-songs-area mb-70">
		<div class="container">
			<div class="row">

				<!-- Single Song Area -->
				<div class="col-12">
					<div
						class="single-song-area mb-30 d-flex flex-wrap align-items-end">
						<div class="song-thumbnail">
							<img src="img/bg-img/220px-Michaeljacksondangerous.jpg" alt="">
						</div>
						<div class="song-play-area">
							<div class="song-name">
								<p>01.Who is it</p>
							</div>
							<audio preload="auto" controls>
								<source src="audio/M.Jackson - Who Is It.mp3">
							</audio>
						</div>
					</div>
				</div>

				<!-- Single Song Area -->
				<div class="col-12">
					<div
						class="single-song-area mb-30 d-flex flex-wrap align-items-end">
						<div class="song-thumbnail">
							<img src="img/bg-img/220px-MJ-HIStory.jpg" alt="">
						</div>
						<div class="song-play-area">
							<div class="song-name">
								<p>02.Childhood</p>
							</div>
							<audio preload="auto" controls>
								<source
									src="audio/M.Jackson-Childhood Theme From Free Willy.mp3">
							</audio>
						</div>
					</div>
				</div>

				<!-- Single Song Area -->
				<div class="col-12">
					<div
						class="single-song-area mb-30 d-flex flex-wrap align-items-end">
						<div class="song-thumbnail">
							<img src="img/bg-img/michael-jackson-off-the-wall.jpg" alt="">
						</div>
						<div class="song-play-area">
							<div class="song-name">
								<p>03.Don't Stop 'til You Get Enough</p>
							</div>
							<audio preload="auto" controls>
								<source src="audio/M.Jackson-Don't stop til you get enoug.mp3">
							</audio>
						</div>
					</div>
				</div>

				<!-- Single Song Area -->
				<div class="col-12">
					<div
						class="single-song-area mb-30 d-flex flex-wrap align-items-end">
						<div class="song-thumbnail">
							<img src="img/bg-img/51DNWE2Nb+L.jpg" alt="">
						</div>
						<div class="song-play-area">
							<div class="song-name">
								<p>04.Bad</p>
							</div>
							<audio preload="auto" controls>
								<source src="audio/M.Jackson-Bad.mp3">
							</audio>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>
	<!-- ##### Song Area End ##### -->



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