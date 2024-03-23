<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tech Blog</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
	.banner-background{
		clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 94%, 71% 100%, 24% 93%, 0 100%, 0 0);
	}
</style>
</head>
<body>
	<%-- navbar  --%>
	<%@include file="navbar.jsp" %>
	
	<%-- Banner --%>
	<div class="container-fluid p-0 m-0">
		<div class="jumbotron banner-background">
			<div class="container">
			
				<h3 class="display-3">Welcome to TechBlog</h3>
				
				<p>Welcome to tech blog, world of technology
				Technology is the application of conceptual knowledge for achieving practical goals, especially in a reproducible way.The word technology can also mean the products resulting from such efforts.
				</p>
				<p>
				Technological advancements have led to significant changes in society. 
				The earliest known technology is the stone tool, used during prehistoric times, 
				followed by the control of fire, which contributed to the growth of the human brain.
				</p>
				
				<a href="register_page.jsp" class="btn btn-outline-dark primary-background btn-lg text-white"><span class="fa fa-sign-in"></span>   Start ! its Free</a> &nbsp;&nbsp;
				<a href="login_page.jsp" class="btn btn-outline-dark primary-background btn-lg text-white"><span class="fa fa-user-circle fa-spin"></span>  Login</a>
				
				
			</div>

		</div>
		
	</div>
	
	<!-- Section -->
	
	<div class="container">
		
		<div class="row mb-4">
		
			<div class="col-md-4">
				<div class="card">
				
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn primary-background text-white">Read more..</a>
					</div>
					
				</div>
			</div>
			<div class="col-md-4">
				<div class="card">
				
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn primary-background text-white">Read more..</a>
					</div>
					
				</div>
			</div>
			<div class="col-md-4">
				<div class="card">
				
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn primary-background text-white">Read more..</a>
					</div>
					
				</div>
			</div>
		
		</div>
		
		<!-- Row 2 -->
		
		<div class="row">
		
			<div class="col-md-4">
				<div class="card">
				
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn primary-background text-white">Read more..</a>
					</div>
					
				</div>
			</div>
			<div class="col-md-4">
				<div class="card">
				
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn primary-background text-white">Read more..</a>
					</div>
					
				</div>
			</div>
			<div class="col-md-4">
				<div class="card">
				
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn primary-background text-white">Read more..</a>
					</div>
					
				</div>
			</div>
		
		</div>
	

	</div>
	
	<br><br>
	
	
	
	
	
	<!-- Javascript -->
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>	
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<script type="text/javascript"></script>
</body>
</html>