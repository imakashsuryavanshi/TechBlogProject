/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.83
 * Generated at: 2024-03-29 15:26:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tech.blog.entities.Category;
import java.util.ArrayList;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.blog.dao.PostDao;
import com.tech.blog.entities.Message;
import com.tech.blog.entities.User;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.tech.blog.helper.ConnectionProvider");
    _jspx_imports_classes.add("com.tech.blog.dao.PostDao");
    _jspx_imports_classes.add("com.tech.blog.entities.Category");
    _jspx_imports_classes.add("com.tech.blog.entities.Message");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("com.tech.blog.entities.User");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error_page.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	User user = (User) session.getAttribute("currentUser");
	
	if(user == null){
		response.sendRedirect("login_page.jsp");
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>");
      out.print( user.getName() );
      out.write(" Profile - TechBlog</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<style>\r\n");
      out.write("	.banner-background{\r\n");
      out.write("		clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 94%, 71% 100%, 24% 93%, 0 100%, 0 0);\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- Navbar  --> \r\n");
      out.write("	\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-dark primary-background\">\r\n");
      out.write("	  <a class=\"navbar-brand\" href=\"index.jsp\"><span class=\"fa fa-simplybuilt\"></span>  Tech Blog</a>\r\n");
      out.write("	  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("	    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("	  </button>\r\n");
      out.write("	\r\n");
      out.write("	  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("	    <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("	      <li class=\"nav-item active\">\r\n");
      out.write("	        <a class=\"nav-link\" href=\"index.jsp\"><span class=\"fa fa-home\"></span>  Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("	      </li>\r\n");
      out.write("	      <li class=\"nav-item active\">\r\n");
      out.write("	        <a class=\"nav-link\" href=\"#\" data-toggle=\"modal\" data-target=\"#new-post-modal\"><span class=\"fa fa-plus-square\"></span>  New Post</a>\r\n");
      out.write("	      </li>\r\n");
      out.write("	      <li class=\"nav-item dropdown\">\r\n");
      out.write("	        <a class=\"nav-link dropdown-toggle text-light\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("	          <span class=\"fa fa-bars\"></span>  Categories\r\n");
      out.write("	        </a>\r\n");
      out.write("	        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("	          <a class=\"dropdown-item\" href=\"#\">Programming Language</a>\r\n");
      out.write("	          <a class=\"dropdown-item\" href=\"#\">Project Implementation</a>\r\n");
      out.write("	          <div class=\"dropdown-divider\"></div>\r\n");
      out.write("	          <a class=\"dropdown-item\" href=\"#\">Data Structures</a>\r\n");
      out.write("	        </div>\r\n");
      out.write("	      </li>\r\n");
      out.write("	       <li class=\"nav-item\">\r\n");
      out.write("	        <a class=\"nav-link\" href=\"#\"><span class=\"fa fa-address-book\"></span>  Contacts</a>\r\n");
      out.write("	      </li>\r\n");
      out.write("     \r\n");
      out.write("   	 </ul>\r\n");
      out.write("    \r\n");
      out.write("    <ul class=\"navbar-nav mr-right\">\r\n");
      out.write("    \r\n");
      out.write("    	<li class=\"nav-item\">\r\n");
      out.write("        	<a class=\"nav-link\" href=\"#!\" data-toggle=\"modal\" data-target=\"#profile-modal\"><span class=\"fa fa-user-circle\"></span> ");
      out.print( user.getName() );
      out.write("</a>\r\n");
      out.write("     	</li>\r\n");
      out.write("    	\r\n");
      out.write("    	<li class=\"nav-item\">\r\n");
      out.write("        	<a class=\"nav-link\" href=\"LogoutServlet\"><span class=\"fa fa-sign-in\"></span>  Logout</a>\r\n");
      out.write("     	</li>\r\n");
      out.write("     	\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("	\r\n");
      out.write("	<!-- Navbar Ends --> \r\n");
      out.write("	\r\n");
      out.write("	");

		Message m = (Message) session.getAttribute("msg");
		if(m != null){
	
      out.write("\r\n");
      out.write("	<div class=\"alert ");
      out.print( m.getCssClass() );
      out.write(" text-center\" role=\"alert\">\r\n");
      out.write("  		");
      out.print( m.getContent() );
      out.write("\r\n");
      out.write("	</div>	\r\n");
      out.write("								\r\n");
      out.write("	");
		
		session.removeAttribute("msg");
		}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Main Body -->\r\n");
      out.write("\r\n");
      out.write("	<main>\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row mt-4\">\r\n");
      out.write("				<!-- first col -->\r\n");
      out.write("				<div class=\"col-md-4\">\r\n");
      out.write("				<!-- Categories -->\r\n");
      out.write("					<div class=\"list-group\">\r\n");
      out.write("					  <a href=\"#\" onclick=\"getPosts(0, this)\" class=\" c-link list-group-item list-group-item-action active\">\r\n");
      out.write("					   All Posts\r\n");
      out.write("					  </a>\r\n");
      out.write("					  \r\n");
      out.write("					  ");
 
					  	PostDao d = new PostDao(ConnectionProvider.getConnection());
					  	ArrayList<Category> list1 = d.getAllCategories();
					  	for(Category cc : list1){
					  
      out.write("\r\n");
      out.write("					  	<a href=\"#\" onclick=\"getPosts(");
      out.print( cc.getCid() );
      out.write(", this)\" class=\" c-link list-group-item list-group-item-action\">");
      out.print( cc.getName() );
      out.write("</a>\r\n");
      out.write("					  ");

					  	}
					  
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- Second col -->\r\n");
      out.write("				<div class=\"col-md-8\">\r\n");
      out.write("				<!-- Posts -->\r\n");
      out.write("				\r\n");
      out.write("					<div class=\"conainer text-center\" id=\"loader\">\r\n");
      out.write("						<i class=\"fa fa-refresh fa-4x fa-spin\"></i>\r\n");
      out.write("						<h3 class=\"mt-3\">Loading....</h3>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"container-fluid\" id=\"post-container\">\r\n");
      out.write("					\r\n");
      out.write("					</div>\r\n");
      out.write("				\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("	\r\n");
      out.write("	</main>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Main Body -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Modal -->\r\n");
      out.write("		<div class=\"modal fade\" id=\"profile-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\">\r\n");
      out.write("		  <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\r\n");
      out.write("		    <div class=\"modal-content\">\r\n");
      out.write("		      <div class=\"modal-header primary-background text-white\">\r\n");
      out.write("		        <h5 class=\"modal-title\" id=\"exampleModalLongTitle\">TechBlog - Manage Profile</h5>\r\n");
      out.write("		        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("		          <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("		        </button>\r\n");
      out.write("		      </div>\r\n");
      out.write("		      <div class=\"modal-body\">\r\n");
      out.write("		      	<div class=\"container text-center\">\r\n");
      out.write("		      		<img alt=\"Profile image\" src=\"pics/");
      out.print( user.getProfile() );
      out.write("\" class=\"img-fluid\" style=\"border-radius:50%; max-width: 150px\"> \r\n");
      out.write("		      		<br>\r\n");
      out.write("		      		<h5 class=\"modal-title mt-3\" id=\"exampleModalLongTitle\">");
      out.print( user.getName() );
      out.write("</h5>\r\n");
      out.write("		      		<br>\r\n");
      out.write("		      		\r\n");
      out.write("		      		<div id=\"profile-details\">\r\n");
      out.write("		      		<!-- Table -->\r\n");
      out.write("		      			<table class=\"table\">\r\n");
      out.write("						  \r\n");
      out.write("						  <tbody>\r\n");
      out.write("						    <tr>\r\n");
      out.write("						      <th scope=\"row\">ID : </th>\r\n");
      out.write("						      <td>");
      out.print( user.getUserId() );
      out.write("</td>\r\n");
      out.write("						    </tr>\r\n");
      out.write("						    <tr>\r\n");
      out.write("						      <th scope=\"row\">Email :</th>\r\n");
      out.write("						      <td>");
      out.print( user.getEmail() );
      out.write("</td>\r\n");
      out.write("						    </tr>\r\n");
      out.write("						    <tr>\r\n");
      out.write("						      <th scope=\"row\">Gender :</th>\r\n");
      out.write("						      <td>");
      out.print( user.getGender() );
      out.write("</td>\r\n");
      out.write("						    </tr>\r\n");
      out.write("						    <tr>\r\n");
      out.write("						      <th scope=\"row\">About :</th>\r\n");
      out.write("						      <td>");
      out.print( user.getAbout() );
      out.write("</td>\r\n");
      out.write("						    </tr>\r\n");
      out.write("						    <tr>\r\n");
      out.write("						      <th scope=\"row\">Registered On :</th>\r\n");
      out.write("						      <td>");
      out.print( user.getDateTime().toString() );
      out.write("</td>\r\n");
      out.write("						    </tr>\r\n");
      out.write("						  </tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("		      		</div>\r\n");
      out.write("		      		\r\n");
      out.write("		      		<div id=\"profile-edit\" style=\"display: none;\">\r\n");
      out.write("		      			<h4 class=\"mt-2\">Please Edit Carefully</h4>\r\n");
      out.write("		      			\r\n");
      out.write("		      			<form action=\"EditServlet\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("		      				<table class=\"table\">\r\n");
      out.write("		      					<tr>\r\n");
      out.write("		      						<td>ID :</td>\r\n");
      out.write("		      						<td>");
      out.print( user.getUserId() );
      out.write("</td>\r\n");
      out.write("		      					</tr>\r\n");
      out.write("		      					<tr>\r\n");
      out.write("		      						<td>Email :</td>\r\n");
      out.write("		      						<td><input type=\"email\" class=\"form-control\" name=\"user_email\" value=\"");
      out.print( user.getEmail() );
      out.write("\"/></td>\r\n");
      out.write("		      					</tr>\r\n");
      out.write("		      					<tr>\r\n");
      out.write("		      						<td>Name :</td>\r\n");
      out.write("		      						<td><input type=\"text\" class=\"form-control\" name=\"user_name\" value=\"");
      out.print( user.getName() );
      out.write("\"/></td>\r\n");
      out.write("		      					</tr>\r\n");
      out.write("		      					<tr>\r\n");
      out.write("		      						<td>Password :</td>\r\n");
      out.write("		      						<td><input type=\"password\" class=\"form-control\" name=\"user_password\" value=\"");
      out.print( user.getPassword() );
      out.write("\"/></td>\r\n");
      out.write("		      					</tr>\r\n");
      out.write("		      					<tr>\r\n");
      out.write("		      						<td>Gender :</td>\r\n");
      out.write("		      						<td>");
      out.print( user.getGender().toUpperCase() );
      out.write("</td>\r\n");
      out.write("		      					</tr>\r\n");
      out.write("		      					<tr>\r\n");
      out.write("		      						<td>About :</td>\r\n");
      out.write("		      						<td>\r\n");
      out.write("		      							<textarea rows=\"3\" class=\"form-control\" name=\"user_about\">");
      out.print( user.getAbout() );
      out.write("</textarea>\r\n");
      out.write("		      						</td>\r\n");
      out.write("		      					</tr>\r\n");
      out.write("		      					<tr>\r\n");
      out.write("		      						<td>Profile Picture:</td>\r\n");
      out.write("		      						<td>\r\n");
      out.write("		      							<input type=\"file\" name=\"image\" class=\"form-control\" />\r\n");
      out.write("		      						</td>\r\n");
      out.write("		      					</tr>\r\n");
      out.write("		      				</table>\r\n");
      out.write("		      				\r\n");
      out.write("		      				<div class=\"container\">\r\n");
      out.write("		      					<button type=\"submit\" class=\"btn btn-outline-primary\">Save</button>\r\n");
      out.write("		      				</div>\r\n");
      out.write("		      				\r\n");
      out.write("		      			</form>\r\n");
      out.write("		      			\r\n");
      out.write("		      		</div>\r\n");
      out.write("		      		\r\n");
      out.write("		      	</div>\r\n");
      out.write("		      </div>\r\n");
      out.write("		      <div class=\"modal-footer\">\r\n");
      out.write("		        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("		        <button id=\"edit-profile-button\" type=\"button\" class=\"btn btn-primary\">&nbsp;Edit&nbsp;</button>\r\n");
      out.write("		      </div>\r\n");
      out.write("		    </div>\r\n");
      out.write("		  </div>\r\n");
      out.write("		</div>\r\n");
      out.write("	\r\n");
      out.write("	<!-- End of Profile modal -->\r\n");
      out.write("	\r\n");
      out.write("	<!-- New post Modal -->\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("	<div class=\"modal fade bd-example-modal-lg\" id=\"new-post-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myLargeModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("	  <div class=\"modal-dialog modal-lg\" >\r\n");
      out.write("	    <div class=\"modal-content\">\r\n");
      out.write("	    	 <div class=\"modal-header\">\r\n");
      out.write("		        <h5 class=\"modal-title\" id=\"exampleModalLongTitle\">New Post</h5>\r\n");
      out.write("		        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("		          <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("		        </button>\r\n");
      out.write("		      </div>\r\n");
      out.write("		      <div class=\"modal-body\">\r\n");
      out.write("		        \r\n");
      out.write("		        <form id=\"new-post-form\" action=\"NewPostServlet\" method=\"post\">\r\n");
      out.write("		        	\r\n");
      out.write("		        	<div class=\"form-group\">\r\n");
      out.write("		        		<select class=\"form-control\" name=\"cid\">\r\n");
      out.write("		        			<option selected=\"selected\" disabled=\"disabled\">---Select Category---</option>\r\n");
      out.write("		        			\r\n");
      out.write("		        			");

		        			PostDao postDao = new PostDao(ConnectionProvider.getConnection());
		        			ArrayList<Category> list = postDao.getAllCategories();
		        			
		        			for(Category c : list){
		        			
      out.write("\r\n");
      out.write("		        				<option value=\"");
      out.print( c.getCid() );
      out.write('"');
      out.write('>');
      out.print( c.getName() );
      out.write("</option>\r\n");
      out.write("		        			");

		        			}
		        			
      out.write("\r\n");
      out.write("		        		</select>\r\n");
      out.write("		        	</div>\r\n");
      out.write("		        	\r\n");
      out.write("		        	<div class=\"form-group\">\r\n");
      out.write("		        		<input name=\"pTitle\" type=\"text\" placeholder=\"Enter Post Title\" class=\"form-control\"/>\r\n");
      out.write("		        	</div>\r\n");
      out.write("		        \r\n");
      out.write("		        	<div class=\"form-group\">\r\n");
      out.write("		        		<textarea name=\"pContent\" rows=\"6\" class=\"form-control\" placeholder=\"Enter your content here..\"></textarea>\r\n");
      out.write("		        	</div>\r\n");
      out.write("		        	\r\n");
      out.write("		        	<div class=\"form-group\">\r\n");
      out.write("		        		<textarea name=\"pCode\" rows=\"6\" class=\"form-control\" placeholder=\"Enter your program here.. (if any) \"></textarea>\r\n");
      out.write("		        	</div>\r\n");
      out.write("		        	\r\n");
      out.write("		        	<div class=\"form-group\">\r\n");
      out.write("		        		<label>Select the display picture :</label><br>\r\n");
      out.write("		        		<input name=\"pic\" type=\"file\" class=\"form-control\"/>\r\n");
      out.write("		        	</div>\r\n");
      out.write("		        	\r\n");
      out.write("		        	<div class=\"container text-center\">\r\n");
      out.write("		        		<button type=\"submit\" class=\"btn btn-outline-primary\">Post</button>\r\n");
      out.write("		        	</div>\r\n");
      out.write("		        	\r\n");
      out.write("		        </form>\r\n");
      out.write("		        \r\n");
      out.write("		      </div>\r\n");
      out.write("		      \r\n");
      out.write("	    </div>\r\n");
      out.write("	  </div>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	<!--End of New post Modal -->\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<!-- Javascript -->\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.7.1.min.js\" integrity=\"sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=\" crossorigin=\"anonymous\"></script>	\r\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script src=\"https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		$(document).ready(function(){\r\n");
      out.write("			let editStatus = false;\r\n");
      out.write("			\r\n");
      out.write("			$('#edit-profile-button').click(function(){\r\n");
      out.write("				\r\n");
      out.write("				if(editStatus == false){\r\n");
      out.write("					$(\"#profile-details\").hide();\r\n");
      out.write("					\r\n");
      out.write("					$(\"#profile-edit\").show();\r\n");
      out.write("					\r\n");
      out.write("					editStatus = true;\r\n");
      out.write("					$(this).text(\"Back\");\r\n");
      out.write("				}else{\r\n");
      out.write("					$(\"#profile-details\").show();\r\n");
      out.write("					\r\n");
      out.write("					$(\"#profile-edit\").hide();\r\n");
      out.write("					\r\n");
      out.write("					editStatus = false;\r\n");
      out.write("					$(this).text(\"Edit\");\r\n");
      out.write("				}\r\n");
      out.write("			})\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("	<!-- New post JS -->\r\n");
      out.write("	\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("	\r\n");
      out.write("		$(document).ready(function(e){\r\n");
      out.write("			\r\n");
      out.write("			$(\"#new-post-form\").on(\"submit\",function(event){\r\n");
      out.write("				event.preventDefault();\r\n");
      out.write("				console.log(\"Submitted\");\r\n");
      out.write("				let form = new FormData(this);\r\n");
      out.write("				\r\n");
      out.write("				//Now requesting to server\r\n");
      out.write("				$.ajax({\r\n");
      out.write("					url: \"NewPostServlet\",\r\n");
      out.write("					type: 'POST',\r\n");
      out.write("					data: form,\r\n");
      out.write("					success: function(data, textStatus, jqXHR){\r\n");
      out.write("						//success\r\n");
      out.write("						if(data.trim() == 'done'){\r\n");
      out.write("							swal(\"Good job!\", \"New Post Created Successfully!\", \"success\");\r\n");
      out.write("						}else{\r\n");
      out.write("							swal(\"Error!!\", \"Something went wrong! Try again..\", \"error\");\r\n");
      out.write("						}\r\n");
      out.write("						\r\n");
      out.write("					},\r\n");
      out.write("					error: function(jqXHR, textStatus, errorThrown){\r\n");
      out.write("						//error\r\n");
      out.write("					},\r\n");
      out.write("					processData: false,\r\n");
      out.write("					contentType: false\r\n");
      out.write("				})\r\n");
      out.write("			})\r\n");
      out.write("		})\r\n");
      out.write("	\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("	<!-- New post JS End -->\r\n");
      out.write("	\r\n");
      out.write("	<!-- Loading posts ajax -->\r\n");
      out.write("	\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("	\r\n");
      out.write("		function getPosts(catId, temp){\r\n");
      out.write("			\r\n");
      out.write("			$(\"#loader\").show();\r\n");
      out.write("			$(\"#post-container\").hide();\r\n");
      out.write("			$(\".c-link\").removeClass('active');\r\n");
      out.write("			\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url: \"load_posts.jsp\",\r\n");
      out.write("				data: {cid: catId},\r\n");
      out.write("				success: function(data, textStatus, jqXHR){\r\n");
      out.write("					console.log(data);\r\n");
      out.write("					$(\"#loader\").hide();\r\n");
      out.write("					$(\"#post-container\").show();\r\n");
      out.write("					$(\"#post-container\").html(data);\r\n");
      out.write("					$(temp).addClass('active');\r\n");
      out.write("				}\r\n");
      out.write("			})\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		$(document).ready(function(e){\r\n");
      out.write("			let allPostRef = $('.c-link')[0];\r\n");
      out.write("			getPosts(0,allPostRef);\r\n");
      out.write("		})\r\n");
      out.write("	\r\n");
      out.write("	</script>\r\n");
      out.write("	<!-- End of loading posts -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
