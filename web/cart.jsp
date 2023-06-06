<%@page import="za.ac.tut.entities.Card"%>
<%@page import="java.util.List"%>
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
                String names = (String)session.getAttribute("names");
            %>
			<a href="#" class="navbar-brand"><%=names%></a>
		</div>
            <%
                Integer size = (Integer)session.getAttribute("size");
                List<Card> item = (List<Card>)session.getAttribute("card");
            %>
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				
                                <li><a href="#team" class="smoothScroll"><b>CART</b><br style="align-content: center">  <%=size%></a></li>
				
			</ul>
		</div>
	</div>
</section>



<!-- gallery section -->
<section id="gallery" class="parallax-section">
	<div class="container">
		<div class="row">
			<div class="col-md-offset-2 col-md-8 col-sm-12 text-center">
				<h1 class="heading">Food Cart</h1>
				<hr>
			</div>
                        <%
                            Double Total =0.0;
                            for (int i = 0; i < item.size(); i++) {
                            String type = item.get(i).getType();
                            Integer Quantity = item.get(i).getQuantity();
                            Double price = item.get(i).getPrice();
                            Total+=price;
                            
                            
    %>

			<div class="col-md-4 col-sm-4 wow fadeInUp" data-wow-delay="0.3s" border="1">
                            <div>
                                    <h3>Type:<%=type%></h3>
                                    <h3>Quantity:<%=Quantity%></h3>
                                    <h3>Price: R<%=price%></h3>
					
                                </div>
                                    
			</div>
			
			
                                <%
                                    }
%>

   

			</div>
		</div>
	</div>
</section>


<!-- menu section -->
<section id="menu" class="parallax-section">
	<div class="container">
		<div class="row">
			<div class="col-md-offset-2 col-md-8 col-sm-12 text-center">
				<h1 class="heading"> TOTAL DUE AMOUNT : R<%=Total%></h1>
				<hr>
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
