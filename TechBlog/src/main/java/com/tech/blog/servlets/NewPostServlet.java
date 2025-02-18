package com.tech.blog.servlets;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.tech.blog.dao.PostDao;
import com.tech.blog.entities.Post;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.blog.helper.Helper;

@WebServlet("/NewPostServlet")
@MultipartConfig
public class NewPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public NewPostServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		int cid = Integer.parseInt(request.getParameter("cid"));
		String pTitle = request.getParameter("pTitle");
		String pContent = request.getParameter("pContent");
		String pCode = request.getParameter("pCode");
		Part part = request.getPart("pic");
		
		//Getting user Id
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("currentUser");
		
		Post p = new Post(pTitle, pContent, pCode, part.getSubmittedFileName(), null, cid, user.getUserId());
		PostDao dao = new PostDao(ConnectionProvider.getConnection());
		
		if(dao.savePost(p)) {
			
//			String path = request.getRealPath("/")+"blog_pics"+File.separator+ part.getSubmittedFileName();
			String relativePath = "blog_pics" + File.separator + part.getSubmittedFileName();
			String path = request.getServletContext().getRealPath(relativePath);

			Helper.saveFile(part.getInputStream(), path);
			response.getWriter().println("done");
//			System.out.println(path);
		}else {
			response.getWriter().println("Error");
		}
	}
	

}
