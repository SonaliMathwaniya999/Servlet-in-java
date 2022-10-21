import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServerDemo2 extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	throws IOException, ServletException
	{
		PrintWriter out= response.getWriter();
		out.println("<html>");
        String s1=request.getParameter("un");
        String s2=request.getParameter("up");
		
out.println("<body bgcolor='red'>");
out.println("<p>wlcome    "+s1+"</p>");
out.println("<p>hello   "+s2+"</p>");
out.println("</body>");
out.println("</html>");
		
	}
	
	
	
}