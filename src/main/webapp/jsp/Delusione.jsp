<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
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
    <section class="breadcumb-area bg-img bg-overlay" style="background-image: url(img/bg-img/eyes.jpg);">
        <div class="bradcumbContent">
           
            <h2>Albums</h2>
        </div>
    </section>
    <!-- ##### Breadcumb Area End ##### -->

    <!-- ##### Album Catagory Area Start ##### -->
    <section class="album-catagory section-padding-100-0">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="browse-by-catagories catagory-menu d-flex flex-wrap align-items-center mb-70">    
                    </div>
                </div>
            </div>

            <div class="row oneMusic-albums">
          
               <!--
                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item a k z">
                    <div class="single-album">
                        <img src="img/bg-img/220px-J5-abc.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>ABC</h5>
                            </a>
                            <p>Jackson 5</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item w l number">
                    <div class="single-album">
                        <img src="img/bg-img/220px-J5-third-album.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Third Album</h5>
                            </a>
                            <p>Jackson 5</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item d m">
                    <div class="single-album">
                        <img src="img/bg-img/220px-J5-skywriter.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Skywriter</h5>
                            </a>
                            <p>Jackson 5</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item t n">
                    <div class="single-album">
                        <img src="img/bg-img/J5-dancing-machine-lp.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5> Dancing Machine</h5>
                            </a>
                            <p>Jackson 5</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item b o">
                    <div class="single-album">
                        <img src="img/bg-img/J5-moving-violation.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Moving Violation</h5>
                            </a>
                            <p>Jackson 5</p>
                        </div>
                    </div>
                </div>
                  
            <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item b j y">
                    <div class="single-album">
                        <img src="img/bg-img/MI0003785577.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Boogie</h5>
                            </a>
                            <p>Jackson 5</p>
                        </div>
                    </div>
                </div>
               <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item t c p">
                    <div class="single-album">
                        <img src="img/bg-img/The_Jacksons_(The_Jacksons_album_-_cover_art).jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>The Jacksons</h5>
                            </a>
                            <p>Jacksons</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item s e q">
                    <div class="single-album">
                        <img src="img/bg-img/Jacksons-going-places.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Goin'Places</h5>
                            </a>
                            <p>Jacksons</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item w f r">
                    <div class="single-album">
                        <img src="img/bg-img/220px-Jacksons-destiny.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Destiny</h5>
                            </a>
                            <p>Jacksons</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item t g u">
                    <div class="single-album">
                        <img src="img/bg-img/Jacksons-triumph.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Triumph</h5>
                            </a>
                            <p>Jacksons</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item d h v">
                    <div class="single-album">
                        <img src="img/bg-img/220px-Jacksons-victory.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Victory</h5>
                            </a>
                            <p>Jacksons</p>
                        </div>
                    </div>
                </div>
                

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item t i x">
                    <div class="single-album">
                        <img src="img/bg-img/Jacksons-2300-jackson-street.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>2300 Jackson</h5>
                            </a>
                            <p>Jacksons</p>
                        </div>
                    </div>
                </div>
                
                  <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item t c p">
                    <div class="single-album">
                        <img src="img/bg-img/michael-jackson-off-the-wall.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Off the wall</h5>
                            </a>
                            <p>Michael Jackson</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item s e q">
                    <div class="single-album">
                        <img src="img/bg-img/81m2C4XYjML._SY355_.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Thriller</h5>
                            </a>
                            <p>Michael Jackson</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item w f r">
                    <div class="single-album">
                        <img src="img/bg-img/51DNWE2Nb+L.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Bad</h5>
                            </a>
                            <p>Michael Jackson</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item t g u">
                    <div class="single-album">
                        <img src="img/bg-img/220px-Michaeljacksondangerous.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Dangerous</h5>
                            </a>
                            <p>Michael Jackson</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item d h v">
                    <div class="single-album">
                        <img src="img/bg-img/220px-MJ-HIStory.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>HIStory</h5>
                            </a>
                            <p>Michael Jackson</p>
                        </div>
                    </div>
                </div>
                
                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item t i x">
                    <div class="single-album">
                        <img src="img/bg-img/220px-Mjinvincible.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Invincible</h5>
                            </a>
                            <p>Michael Jackson</p>
                        </div>
                    </div>
                </div>
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
                    <div class="single-song-area mb-30 d-flex flex-wrap align-items-end">
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
                    <div class="single-song-area mb-30 d-flex flex-wrap align-items-end">
                        <div class="song-thumbnail">
                            <img src="img/bg-img/220px-MJ-HIStory.jpg" alt="">
                        </div>
                        <div class="song-play-area">
                            <div class="song-name">
                                <p>02.Childhood</p>
                            </div>
                            <audio preload="auto" controls>
                                <source src="audio/M.Jackson-Childhood Theme From Free Willy.mp3">
                            </audio>
                        </div>
                    </div>
                </div>

                <!-- Single Song Area -->
                <div class="col-12"> 
                    <div class="single-song-area mb-30 d-flex flex-wrap align-items-end">
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
                    <div class="single-song-area mb-30 d-flex flex-wrap align-items-end">
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
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
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
    <section class="breadcumb-area bg-img bg-overlay" style="background-image: url(img/bg-img/eyes.jpg);">
        <div class="bradcumbContent">
           
            <h2>Albums</h2>
        </div>
    </section>
    <!-- ##### Breadcumb Area End ##### -->

    <!-- ##### Album Catagory Area Start ##### -->
    <section class="album-catagory section-padding-100-0">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="browse-by-catagories catagory-menu d-flex flex-wrap align-items-center mb-70">    
                    </div>
                </div>
            </div>

            <div class="row oneMusic-albums">
          
               <!--
                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item a k z">
                    <div class="single-album">
                        <img src="img/bg-img/220px-J5-abc.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>ABC</h5>
                            </a>
                            <p>Jackson 5</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item w l number">
                    <div class="single-album">
                        <img src="img/bg-img/220px-J5-third-album.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Third Album</h5>
                            </a>
                            <p>Jackson 5</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item d m">
                    <div class="single-album">
                        <img src="img/bg-img/220px-J5-skywriter.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Skywriter</h5>
                            </a>
                            <p>Jackson 5</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item t n">
                    <div class="single-album">
                        <img src="img/bg-img/J5-dancing-machine-lp.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5> Dancing Machine</h5>
                            </a>
                            <p>Jackson 5</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item b o">
                    <div class="single-album">
                        <img src="img/bg-img/J5-moving-violation.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Moving Violation</h5>
                            </a>
                            <p>Jackson 5</p>
                        </div>
                    </div>
                </div>
                  
            <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item b j y">
                    <div class="single-album">
                        <img src="img/bg-img/MI0003785577.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Boogie</h5>
                            </a>
                            <p>Jackson 5</p>
                        </div>
                    </div>
                </div>
               <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item t c p">
                    <div class="single-album">
                        <img src="img/bg-img/The_Jacksons_(The_Jacksons_album_-_cover_art).jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>The Jacksons</h5>
                            </a>
                            <p>Jacksons</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item s e q">
                    <div class="single-album">
                        <img src="img/bg-img/Jacksons-going-places.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Goin'Places</h5>
                            </a>
                            <p>Jacksons</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item w f r">
                    <div class="single-album">
                        <img src="img/bg-img/220px-Jacksons-destiny.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Destiny</h5>
                            </a>
                            <p>Jacksons</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item t g u">
                    <div class="single-album">
                        <img src="img/bg-img/Jacksons-triumph.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Triumph</h5>
                            </a>
                            <p>Jacksons</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item d h v">
                    <div class="single-album">
                        <img src="img/bg-img/220px-Jacksons-victory.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Victory</h5>
                            </a>
                            <p>Jacksons</p>
                        </div>
                    </div>
                </div>
                

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item t i x">
                    <div class="single-album">
                        <img src="img/bg-img/Jacksons-2300-jackson-street.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>2300 Jackson</h5>
                            </a>
                            <p>Jacksons</p>
                        </div>
                    </div>
                </div>
                
                  <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item t c p">
                    <div class="single-album">
                        <img src="img/bg-img/michael-jackson-off-the-wall.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Off the wall</h5>
                            </a>
                            <p>Michael Jackson</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item s e q">
                    <div class="single-album">
                        <img src="img/bg-img/81m2C4XYjML._SY355_.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Thriller</h5>
                            </a>
                            <p>Michael Jackson</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item w f r">
                    <div class="single-album">
                        <img src="img/bg-img/51DNWE2Nb+L.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Bad</h5>
                            </a>
                            <p>Michael Jackson</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item t g u">
                    <div class="single-album">
                        <img src="img/bg-img/220px-Michaeljacksondangerous.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Dangerous</h5>
                            </a>
                            <p>Michael Jackson</p>
                        </div>
                    </div>
                </div>

                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item d h v">
                    <div class="single-album">
                        <img src="img/bg-img/220px-MJ-HIStory.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>HIStory</h5>
                            </a>
                            <p>Michael Jackson</p>
                        </div>
                    </div>
                </div>
                
                <!-- Single Album -->
                <div class="col-12 col-sm-4 col-md-3 col-lg-2 single-album-item t i x">
                    <div class="single-album">
                        <img src="img/bg-img/220px-Mjinvincible.jpg" alt="">
                        <div class="album-info">
                            <a href="#">
                                <h5>Invincible</h5>
                            </a>
                            <p>Michael Jackson</p>
                        </div>
                    </div>
                </div>
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
                    <div class="single-song-area mb-30 d-flex flex-wrap align-items-end">
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
                    <div class="single-song-area mb-30 d-flex flex-wrap align-items-end">
                        <div class="song-thumbnail">
                            <img src="img/bg-img/220px-MJ-HIStory.jpg" alt="">
                        </div>
                        <div class="song-play-area">
                            <div class="song-name">
                                <p>02.Childhood</p>
                            </div>
                            <audio preload="auto" controls>
                                <source src="audio/M.Jackson-Childhood Theme From Free Willy.mp3">
                            </audio>
                        </div>
                    </div>
                </div>

                <!-- Single Song Area -->
                <div class="col-12"> 
                    <div class="single-song-area mb-30 d-flex flex-wrap align-items-end">
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
                    <div class="single-song-area mb-30 d-flex flex-wrap align-items-end">
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