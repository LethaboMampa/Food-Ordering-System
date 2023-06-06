<%@page import="za.ac.tut.entities.Chips"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>Zentro</title>

	<meta http-equiv="X-UA-Compatible" content="IE=Edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="keywords" content="">
	<meta name="description" content="">
        <style>
            .center {
  margin-left: auto;
  margin-right: auto;
}
        </style>
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
                String names = (String)session.getAttribute("names");
            %>
			<a href="#" class="navbar-brand">MORUTI</a>
		</div>
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="User.jsp" class="smoothScroll">HOME</a></li>
				
			</ul>
		</div>
	</div>
</section>




<!-- gallery section -->
<section id="gallery" class="parallax-section">
	<div class="container">
		<div class="row">
			<div class="col-md-offset-2 col-md-8 col-sm-12 text-center">
				<h1 class="heading">FEEDBACK</h1>
				<%
                                    Chips item = (Chips)request.getAttribute("chips");
                                    String name = item.getName();
                                    String type = item.getType();
                                %>
                                <h1><%=type%> is added to <%=name%> category</h1>
			</div>
                </div>
        </div>	
</<section>




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
