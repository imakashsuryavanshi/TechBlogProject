<%@page import="com.tech.blog.entities.User" %>
<%@page errorPage="error_page.jsp" %>
<%
User user = (User) session.getAttribute("currentUser");

if(user == null){
	response.sendRedirect("login_page.jsp");
}
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><%= user.getName() %> Profile - TechBlog</title>
</head>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
	.banner-background{
		clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 94%, 71% 100%, 24% 93%, 0 100%, 0 0);
	}
</style>
<body>
	<!-- Navbar  --> 
	
	<nav class="navbar navbar-expand-lg navbar-dark primary-background">
  <a class="navbar-brand" href="index.jsp"><span class="fa fa-simplybuilt"></span>  Tech Blog</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp"><span class="fa fa-home"></span>  Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle text-light" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          <span class="fa fa-bars"></span>  Categories
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Programming Language</a>
          <a class="dropdown-item" href="#">Project Implementation</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Data Structures</a>
        </div>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="#"><span class="fa fa-address-book"></span>  Contacts</a>
      </li>
      
    </ul>
    
    <ul class="navbar-nav mr-right">
    
    	<li class="nav-item">
        	<a class="nav-link" href="#!" data-toggle="modal" data-target="#profile-modal"><span class="fa fa-user-circle"></span> <%= user.getName() %></a>
     	</li>
    	
    	<li class="nav-item">
        	<a class="nav-link" href="LogoutServlet"><span class="fa fa-sign-in"></span>  Logout</a>
     	</li>
    </ul>
  </div>
</nav>
	
	<!-- Navbar Ends --> 

	<!-- Modal -->
		<div class="modal fade" id="profile-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
		  <div class="modal-dialog modal-dialog-centered" role="document">
		    <div class="modal-content">
		      <div class="modal-header primary-background text-white">
		        <h5 class="modal-title" id="exampleModalLongTitle">TechBlog - Manage Profile</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
		      	<div class="container text-center">
		      		<img alt="Profile image" src="pics/<%= user.getProfile() %>" class="img-fluid" style="border-radius:50%; max-width: 150px"> 
		      		<br>
		      		<h5 class="modal-title mt-3" id="exampleModalLongTitle"><%= user.getName() %></h5>
		      		<br>
		      		<!-- Table -->
		      			<table class="table">
						  
						  <tbody>
						    <tr>
						      <th scope="row">ID : </th>
						      <td><%= user.getUserId() %></td>
						    </tr>
						    <tr>
						      <th scope="row">Email :</th>
						      <td><%= user.getEmail() %></td>
						    </tr>
						    <tr>
						      <th scope="row">Gender :</th>
						      <td><%= user.getGender() %></td>
						    </tr>
						    <tr>
						      <th scope="row">About :</th>
						      <td><%= user.getAbout() %></td>
						    </tr>
						    <tr>
						      <th scope="row">Registered On :</th>
						      <td><%= user.getDateTime().toString() %></td>
						    </tr>
						  </tbody>
						</table>
		      		
		      	</div>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
		        <button type="button" class="btn btn-primary">&nbsp;EDIT&nbsp;</button>
		      </div>
		    </div>
		  </div>
		</div>
	
	<!-- End of Profile modal -->
	
	
	
	<!-- Javascript -->
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>	
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<script type="text/javascript"></script>
</body>
</html>