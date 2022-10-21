import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ServerDemo3 extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)	throws IOException, ServletException
	{
		PrintWriter out= response.getWriter();
	
        String s1=request.getParameter("un");
        String s2=request.getParameter("up");
	    out.println("<html>");	
        out.println("<body bgcolor='red'>");
try
{
	
	Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonalidb?useSSL=false","root","root");
Statement st=con.createStatement();
String q="insert into login(uname,upass) values('"+s1+"','"+s2+"')";
st.executeUpdate(q);
//System.out.println("data insert");
con.close();
}catch(Exception e)
{
	System.out.println(e);
}
out.println("</body>");
out.println("</html>");
		out.close();
	}
	
	
	
}