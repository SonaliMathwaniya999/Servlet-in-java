import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class LogOutDemo extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
	
	{
		PrintWriter out=response.getWriter();
		
		
		Cookie ck =new Cookie("un","");
			ck.setMaxAge(0);
			response.addCookie(ck);
			response.sendRedirect("Login.html");
	
	out.close();
	}
	
	
	
}
		