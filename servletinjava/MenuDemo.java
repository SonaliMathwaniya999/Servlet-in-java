import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class MenuDemo extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
	
	{
		PrintWriter out=response.getWriter();
		
		
		Cookie []ck=request.getCookies();
		if(ck!=null){
	
		out.println("<html>");
		out.println("<head>");


out.println("<link rel='stylesheet' type='text/css'   href='xyz.css'  />");
out.println("</head>");
		out.println("<body>");
		out.println("<div id='mymenu'>");
out.println("<ul>");
out.println("<li><a href='home.html'>Home</li>");
out.println("<li><a href='search.html'>search</a></li>");
out.println("<li><a href='insert.html'>insert</a></li>");
out.println("<li><a href='update.html'>update</a></li>");
out.println("<li><a href='Delete.html'>Delete</a></li>");
out.println("<li><a href='wel11'>showAll</a></li>");
out.println("<li>courses</li>");
out.println("<li>about</li>");
out.println("<li>contact</li>");
out.println("</ul>");
out.println("</div>");

out.println("welcome"+ck[0].getValue());	
		out.println("</body>");
		out.println("</html>");
	
		
	}
	else{
	
	response.sendRedirect("Login.html");
	
	}
	
	out.close();
	}
	
	
	
}
		