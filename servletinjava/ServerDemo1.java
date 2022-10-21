import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServerDemo1 extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	throws IOException, ServletException
	{
		PrintWriter out= response.getWriter();
		out.println("<html>");
         out.println("<head>");
out.println("<title> Tech tutorial</title>");
out.println("</head>");
out.println("<body bgcolor='red'>");
out.println("<table cellpadding='10' border='1'>");
out.println("<tr>");
out.println("<th>uname</th>");
out.println("<th>upass</th>");
out.println("<th>ucont</th>");
out.println("<th>date of birth</th>");

out.println("</tr>");

out.println("<tr>");
out.println("<td>sonali</td>");
out.println("<td>123</td>");
out.println("<td>45212</td>");
out.println("<td>12-12-2015</td>");
out.println("</tr>");

out.println("<tr>");
out.println("<td>sunny</td>");
out.println("<td>1111</td>");
out.println("<td>456</td>");
out.println("<td>12-12-2015</td>");
out.println("</tr>");

out.println("<tr>");
out.println("<td>usha</td>");
out.println("<td>565</td>");
out.println("<td>546555</td>");
out.println("<td>12-12-2015</td>");
out.println("</tr>");

out.println("<tr>");
out.println("<td>bha</td>");
out.println("<td>546</td>");
out.println("<td>456564</td>");
out.println("<td>12-12-2015</td>");
out.println("</tr>");


out.println("</table>");
out.println("</body>");
out.println("</html>");
		
	}
	
	
	
}