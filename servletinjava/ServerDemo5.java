import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ServerDemo5 extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)	throws IOException, ServletException
	{
		PrintWriter out= response.getWriter();
	
       String s1=request.getParameter("email");
       String s2=request.getParameter("pass");
       
        out.println("  <html>");
      out.println("<head>");


out.println("<link rel='stylesheet' type='text/css'   href='xyz.css'  />");
out.println("</head>");
out.println("<body>");


try{
	
	Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonalidb?useSSL=false","root","root");
Statement st=con.createStatement();
	
String q="select * from regis where email='"+s1+"'  and password='"+s2+"'";
ResultSet rs=st.executeQuery(q);
if(rs.next())
{
out.println("<h1 align='center'> welcome Home</h1>");
}	
	con.close();
	
}catch(Exception e)
{
	out.println(e);
	
}
   out.println("</body>");
	  
	  out.println("</html>");
	  }
	
	
	
}