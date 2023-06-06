<%-- 
    Document   : Fatkoeks.jsp
    Created on : 21 May 2023, 3:01:40 AM
    Author     : Student
--%>

<%@page import="za.ac.tut.entities.Coffee"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            .grid-container {
  display: inline-grid;
  gap: 50px;
  grid-template-columns: auto auto auto;
  background-color: grey;
  padding: 10px;
}

.grid-item {
  background-color: rgba(255, 255, 255, 0.8);
  border: 1px solid rgba(0, 0, 0, 0.8);
  padding: 20px;
  font-size: 30px;
  text-align: center;
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
                String names = (String)session.getAttribute("name");
            %>
			<a href="#" class="navbar-brand"><%=names%></a>
		</div>
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="User.jsp" class="smoothScroll">HOME</a></li>
				
			</ul>
		</div>
	</div>
</section>



<section id="gallery" class="parallax-section">
	<div class="container">
		<div class="row">
			<div class="col-md-offset-2 col-md-8 col-sm-12 text-center">
				<h1 class="heading">Coffee</h1>
				<hr>
			</div>
			
</section>
 <%
            List<Coffee> items = (List<Coffee>)session.getAttribute("list");
            
              for(int i=0;i<items.size();i++)
              {
                  
                 String name = items.get(i).getName();
                 String type = items.get(i).getType();
                 Double price = items.get(i).getPrice();
                 Integer quantity = items.get(i).getQuantity();
        %>
<!-- gallery section -->

<div class="grid-container">
    <div class="grid-item">Type :<%=type%><br>Price :R<%=price%><br>Available :<%=quantity%></a></div>
 
</div>
 <%
                            }
                        %>
		
                        <h1 style="text-align: center">Place an order</h1>
                        <div class="grid-order">
    
    <div class="grid-item" >
        <form action="AddCardSession.do" method="POST">
            <tr>
                    <td>Type :</td>
                    <td><select name="type"><%for(int i=0;i<items.size();i++){
            String type = items.get(i).getType();%>
    <option><%=type%></option><%
    }
%></select></td>
            </tr>
            <tr>
                     <td>Quantity : </td>  
                    <td><input type="number" name="quantity"/></td>    
            </tr>
             <tr>
                     <td></td>  
                    <td><input type="submit" value="ADD TO CARD"/></td>    
            </tr>
            
</form>
    </div>
    
</div>






<!-- footer section -->
<footer class="parallax-section">
	<div class="container">
		<div class="row">
			<div class="col-md-4 col-sm-4 wow fadeInUp" data-wow-delay="0.6s">
				<h2 class="heading">Contact Info.</h2>
				<div class="ph">
					<p><i class="fa fa-phone"></i> Phone</p>
					<h4>090-080-0760</h4>
				</div>
				<div class="address">
					<p><i class="fa fa-map-marker"></i> Our Location</p>
					<h4>120 Duis aute irure, California, USA</h4>
				</div>
			</div>
			<div class="col-md-4 col-sm-4 wow fadeInUp" data-wow-delay="0.6s">
				<h2 class="heading">Open Hours</h2>
					<p>Sunday <span>10:30 AM - 10:00 PM</span></p>
					<p>Mon-Fri <span>9:00 AM - 8:00 PM</span></p>
					<p>Saturday <span>11:30 AM - 10:00 PM</span></p>
			</div>
			<div class="col-md-4 col-sm-4 wow fadeInUp" data-wow-delay="0.6s">
				<h2 class="heading">Follow Us</h2>
				<ul class="social-icon">
					<li><a href="#" class="fa fa-facebook wow bounceIn" data-wow-delay="0.3s"></a></li>
					<li><a href="#" class="fa fa-twitter wow bounceIn" data-wow-delay="0.6s"></a></li>
					<li><a href="#" class="fa fa-behance wow bounceIn" data-wow-delay="0.9s"></a></li>
					<li><a href="#" class="fa fa-dribbble wow bounceIn" data-wow-delay="0.9s"></a></li>
					<li><a href="#" class="fa fa-github wow bounceIn" data-wow-delay="0.9s"></a></li>
				</ul>
			</div>
		</div>
	</div>
</footer>


<!-- copyright section -->
<section id="copyright">
	<div class="container">
		<div class="row">
			<div class="col-md-12 col-sm-12">
				<h3>ZENTRO</h3>
				<p>Copyright © Zentro Restaurant and Cafe 
                

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
