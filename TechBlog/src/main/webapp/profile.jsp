<%@page import="com.tech.blog.entities.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page import="com.tech.blog.dao.PostDao"%>
<%@page import="com.tech.blog.entities.Message"%>
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
	
	body{
		background: url(img/bg.jpg);
		background-size: cover;
		background-attachment: fixed;
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
	      <li class="nav-item active">
	        <a class="nav-link" href="#" data-toggle="modal" data-target="#new-post-modal"><span class="fa fa-plus-square"></span>  New Post</a>
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
        	<a class="nav-link" href="#!" data-toggle="modal" data-target="#profile-modal"><span class="fa fa-user-circle"></span><b> <%= user.getName() %></b></a>
     	</li>
    	
    	<li class="nav-item">
        	<a class="nav-link" href="LogoutServlet"><span class="fa fa-sign-in"></span>  Logout</a>
     	</li>
     	
    </ul>
  </div>
</nav>
	
	<!-- Navbar Ends --> 
	
	<%
		Message m = (Message) session.getAttribute("msg");
		if(m != null){
	%>
	<div class="alert <%= m.getCssClass() %> text-center" role="alert">
  		<%= m.getContent() %>
	</div>	
								
	<%		
		session.removeAttribute("msg");
		}
	%>

	<!-- Main Body -->

	<main>
		<div class="container">
			<div class="row mt-4">
				<!-- first col -->
				<div class="col-md-4">
				<!-- Categories -->
					<div class="list-group">
					  <a href="#" onclick="getPosts(0, this)" class=" c-link list-group-item list-group-item-action active">
					   All Posts
					  </a>
					  
					  <% 
					  	PostDao d = new PostDao(ConnectionProvider.getConnection());
					  	ArrayList<Category> list1 = d.getAllCategories();
					  	for(Category cc : list1){
					  %>
					  	<a href="#" onclick="getPosts(<%= cc.getCid() %>, this)" class=" c-link list-group-item list-group-item-action"><%= cc.getName() %></a>
					  <%
					  	}
					  %>
					</div>
				</div>
				<!-- Second col -->
				<div class="col-md-8">
				<!-- Posts -->
				
					<div class="conainer text-center" id="loader">
						<i class="fa fa-refresh fa-4x fa-spin"></i>
						<h3 class="mt-3">Loading....</h3>
					</div>
					<div class="container-fluid" id="post-container">
					
					</div>
				
				</div>
			</div>
			
		</div>
	
	</main>


	<!-- Main Body -->


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
		      		
		      		<div id="profile-details">
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
		      		
		      		<div id="profile-edit" style="display: none;">
		      			<h4 class="mt-2">Please Edit Carefully</h4>
		      			
		      			<form action="EditServlet" method="post" enctype="multipart/form-data">
		      				<table class="table">
		      					<tr>
		      						<td>ID :</td>
		      						<td><%= user.getUserId() %></td>
		      					</tr>
		      					<tr>
		      						<td>Email :</td>
		      						<td><input type="email" class="form-control" name="user_email" value="<%= user.getEmail() %>"/></td>
		      					</tr>
		      					<tr>
		      						<td>Name :</td>
		      						<td><input type="text" class="form-control" name="user_name" value="<%= user.getName() %>"/></td>
		      					</tr>
		      					<tr>
		      						<td>Password :</td>
		      						<td><input type="password" class="form-control" name="user_password" value="<%= user.getPassword() %>"/></td>
		      					</tr>
		      					<tr>
		      						<td>Gender :</td>
		      						<td><%= user.getGender().toUpperCase() %></td>
		      					</tr>
		      					<tr>
		      						<td>About :</td>
		      						<td>
		      							<textarea rows="3" class="form-control" name="user_about"><%= user.getAbout() %></textarea>
		      						</td>
		      					</tr>
		      					<tr>
		      						<td>Profile Picture:</td>
		      						<td>
		      							<input type="file" name="image" class="form-control" />
		      						</td>
		      					</tr>
		      				</table>
		      				
		      				<div class="container">
		      					<button type="submit" class="btn btn-outline-primary">Save</button>
		      				</div>
		      				
		      			</form>
		      			
		      		</div>
		      		
		      	</div>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
		        <button id="edit-profile-button" type="button" class="btn btn-primary">&nbsp;Edit&nbsp;</button>
		      </div>
		    </div>
		  </div>
		</div>
	
	<!-- End of Profile modal -->
	
	<!-- New post Modal -->
	

	<div class="modal fade bd-example-modal-lg" id="new-post-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
	  <div class="modal-dialog modal-lg" >
	    <div class="modal-content">
	    	 <div class="modal-header">
		        <h5 class="modal-title" id="exampleModalLongTitle">New Post</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
		        
		        <form id="new-post-form" action="NewPostServlet" method="post">
		        	
		        	<div class="form-group">
		        		<select class="form-control" name="cid">
		        			<option selected="selected" disabled="disabled">---Select Category---</option>
		        			
		        			<%
		        			PostDao postDao = new PostDao(ConnectionProvider.getConnection());
		        			ArrayList<Category> list = postDao.getAllCategories();
		        			
		        			for(Category c : list){
		        			%>
		        				<option value="<%= c.getCid() %>"><%= c.getName() %></option>
		        			<%
		        			}
		        			%>
		        		</select>
		        	</div>
		        	
		        	<div class="form-group">
		        		<input name="pTitle" type="text" placeholder="Enter Post Title" class="form-control"/>
		        	</div>
		        
		        	<div class="form-group">
		        		<textarea name="pContent" rows="6" class="form-control" placeholder="Enter your content here.."></textarea>
		        	</div>
		        	
		        	<div class="form-group">
		        		<textarea name="pCode" rows="6" class="form-control" placeholder="Enter your program here.. (if any) "></textarea>
		        	</div>
		        	
		        	<div class="form-group">
		        		<label>Select the display picture :</label><br>
		        		<input name="pic" type="file" class="form-control"/>
		        	</div>
		        	
		        	<div class="container text-center">
		        		<button type="submit" class="btn btn-outline-primary">Post</button>
		        	</div>
		        	
		        </form>
		        
		      </div>
		      
	    </div>
	  </div>
	</div>
	
	<!--End of New post Modal -->
	
	
	<!-- Javascript -->
	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>	
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
	<script type="text/javascript" src="js/js.js"></script>

	<script type="text/javascript">
		$(document).ready(function(){
			let editStatus = false;
			
			$('#edit-profile-button').click(function(){
				
				if(editStatus == false){
					$("#profile-details").hide();
					
					$("#profile-edit").show();
					
					editStatus = true;
					$(this).text("Back");
				}else{
					$("#profile-details").show();
					
					$("#profile-edit").hide();
					
					editStatus = false;
					$(this).text("Edit");
				}
			})
		});
		
	</script>
	
	<!-- New post JS -->
	
	<script type="text/javascript">
	
		$(document).ready(function(e){
			
			$("#new-post-form").on("submit",function(event){
				event.preventDefault();
				console.log("Submitted");
				let form = new FormData(this);
				
				//Now requesting to server
				$.ajax({
					url: "NewPostServlet",
					type: 'POST',
					data: form,
					success: function(data, textStatus, jqXHR){
						//success
						if(data.trim() == 'done'){
							swal("Good job!", "New Post Created Successfully!", "success");
						}else{
							swal("Error!!", "Something went wrong! Try again..", "error");
						}
						
					},
					error: function(jqXHR, textStatus, errorThrown){
						//error
					},
					processData: false,
					contentType: false
				})
			})
		})
	
	</script>
	
	<!-- New post JS End -->
	
	<!-- Loading posts ajax -->
	
	<script type="text/javascript">
	
		function getPosts(catId, temp){
			
			$("#loader").show();
			$("#post-container").hide();
			$(".c-link").removeClass('active');
			
			$.ajax({
				url: "load_posts.jsp",
				data: {cid: catId},
				success: function(data, textStatus, jqXHR){
					console.log(data);
					$("#loader").hide();
					$("#post-container").show();
					$("#post-container").html(data);
					$(temp).addClass('active');
				}
			})
		}
		
		$(document).ready(function(e){
			let allPostRef = $('.c-link')[0];
			getPosts(0,allPostRef);
		})
	
	</script>
	<!-- End of loading posts -->

</body>
</html>