import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class SerchDemo extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException , ServletException
	{
	  PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor='cyan'>");
		out.println("<p>sonali mathwaniya</p>");
		out.println("</body>");
		out.println("</html>");
		
		
		
		
	}
	
	
}