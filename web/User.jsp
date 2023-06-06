<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>Zentro</title>

	<meta http-equiv="X-UA-Compatible" content="IE=Edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="keywords" content="">
	<meta name="description" content="">

	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/animate.min.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/nivo-lightbox.css">
	<link rel="stylesheet" href="css/nivo_themes/default/default.css">
	<link rel="stylesheet" href="css/style.css">
	<link href='https://fonts.googleapis.com/css?family=Roboto:400,500' rel='stylesheet' type='text/css'>
</head>
<body>

<section class="preloader">
	<div class="sk-spinner sk-spinner-pulse"></div>
</section>

<section class="navbar navbar-default navbar-fixed-top" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<button class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
				<span class="icon icon-bar"></span>
				<span class="icon icon-bar"></span>
				<span class="icon icon-bar"></span>
			</button>
                    <%
                String name = (String)session.getAttribute("names");
            %>
			<a href="#" class="navbar-brand"><%=name%></a>
		</div>
            <%
                Integer size = (Integer)session.getAttribute("size");
            %>
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				
                                <li><a href="cart.jsp" class="smoothScroll"><b>CART</b><br style="align-content: center">  <%=size%></a></li>
				
			</ul>
		</div>
	</div>
</section>



<!-- gallery section -->
<section id="gallery" class="parallax-section">
	<div class="container">
		<div class="row">
			<div class="col-md-offset-2 col-md-8 col-sm-12 text-center">
				<h1 class="heading">Food Gallery</h1>
				<hr>
			</div>
			<div class="col-md-4 col-sm-4 wow fadeInUp" data-wow-delay="0.3s">
				<a href="images/gallery-img1.webp" data-lightbox-gallery="zenda-gallery"><img src="images/gallery-img1.webp" alt="gallery img"></a>
				<div>
					<h3>FatKoeks</h3>
					<span>Immaculate Bites / Snowflake / Fried Dough</span>
				</div>
				<a href="images/gallery-img2.jpg" data-lightbox-gallery="zenda-gallery"><img src="images/gallery-img2.jpg" alt="gallery img"></a>
				<div>
					<h3>Sphahlo</h3>
					<span>Crispy seasoned Chips /  Russian, sliced and fried / slice of Cheese</span>
				</div>
			</div>
			<div class="col-md-4 col-sm-4 wow fadeInUp" data-wow-delay="0.6s">
				<a href="images/gallery-img3.avif" data-lightbox-gallery="zenda-gallery"><img src="images/gallery-img3.avif" alt="gallery img"></a>
				<div>
					<h3>Coffee</h3>
					<span>Black Coffee / Macchiato / Cappuccino</span>
				</div>
			</div>
			<div class="col-md-4 col-sm-4 wow fadeInUp" data-wow-delay="0.9s">
				<a href="images/gallery-img4.jpg" data-lightbox-gallery="zenda-gallery"><img src="images/gallery-img4.jpg" alt="gallery img"></a>
				<div>
					<h3>Chips</h3>
					<span>Small / Large / Medium / Extra Large</span>
				</div>
				<a href="images/gallery-img5.jpg" data-lightbox-gallery="zenda-gallery"><img src="images/gallery-img5.jpg" alt="gallery img"></a>
				<div>
					<h3>Dag Wood</h3>
					<span>Sandwich / Two slices / Russian</span>
				</div>
			</div>
		</div>
	</div>
</section>


<!-- menu section -->
<section id="menu" class="parallax-section">
	<div class="container">
		<div class="row">
			<div class="col-md-offset-2 col-md-8 col-sm-12 text-center">
				<h1 class="heading">Place your order below</h1>
				<hr>
			</div>
                    <div class="col-md-6 col-sm-6">
                        <a href="FatkoeksServlet.do" >
                            <h4>FatKoeks</h4>
				<h5>Immaculate Bites / Snowflake / Fried Dough</h5>
                        </a>
				
			</div>
			<div class="col-md-6 col-sm-6">
                            <a href="ChipsServlet.do" >
                                <h4>Chips</h4>
				<h5>Small / Large / Medium / Extra Large</h5>
                            </a>
				
			</div>
			<div class="col-md-6 col-sm-6">
                            <a href="CofeeServlet.do">
                                <h4>Coffee</h4>
				<h5>Black Coffee / Macchiato / Cappuccino</h5>
                            </a>
				
			</div>
			<div class="col-md-6 col-sm-6">
                            <a href="DagWoodServlet.do">
                                <h4>Dag Wood</h4>
				<h5>Sandwich / Two slices / Russian</h5>
                            </a>
				
			</div>
			<div class="col-md-6 col-sm-6">
                            <a href="SphahloServlet.do">
                                <h4>Sphahlo</h4>
				<h5>Crispy seasoned Chips /  Russian, sliced and fried / slice of Cheese</h5>
                            </a>
				
			</div>
			
		</div>
	</div>
</section>		









<!-- copyright section -->
<section id="copyright">
	<div class="container">
		<div class="row">
			<div class="col-md-12 col-sm-12">
				<h3>MORUTI</h3>
				<p>Copyright © MORUTI Restaurant and Cafe 
                

			</div>
		</div>
	</div>
</section>

<!-- JAVASCRIPT JS FILES -->	
<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.parallax.js"></script>
<script src="js/smoothscroll.js"></script>
<script src="js/nivo-lightbox.min.js"></script>
<script src="js/wow.min.js"></script>
<script src="js/custom.js"></script>

</body>
</html>
