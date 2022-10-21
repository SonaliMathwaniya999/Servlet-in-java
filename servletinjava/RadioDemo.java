 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

 
public class RadioDemo extends HttpServlet {

     
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
         PrintWriter out = response.getWriter();
         String s1=request.getParameter("a");
         out.println("<html>");
		out.println("<head>");
                out.print("server page");
out.println("</head>");
out.println("<body>");
out.println("radio button value"+s1);
out.println("</body>");
                out.println("</html>");
		 

        
    }

     
}
