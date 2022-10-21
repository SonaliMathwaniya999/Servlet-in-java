import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ServerDemo4 extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)	throws IOException, ServletException
	{
		PrintWriter out= response.getWriter();
	
       String s1=request.getParameter("fn");
       String s2=request.getParameter("ln");
       String s3=request.getParameter("en");
       String s4=request.getParameter("zn");
       String s5=request.getParameter("pn");
       String s6=request.getParameter("pas1");
       String s7=request.getParameter("pas2");
       
	   
      out.println("  <html>");
      out.println("<head>");


out.println("<link rel='stylesheet' type='text/css'   href='xyz.css'  />");
out.println("</head>");
out.println("<body>");

try{
	
	Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonalidb?useSSL=false","root","root");
Statement st=con.createStatement();
	
	if((s1.equals(""))||(s2.equals(""))||(s3.equals(""))||(s4.equals(""))||(s5.equals(""))||(s6.equals(""))||(s7.equals("")))
	{
		out.println("<h1>please insert complerte details</h1>");
	}
	else{
		
		String q="insert into regis values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"')";
st.executeUpdate(q);


out.println("<form >");
out.println("<div id='mymenu'>");
out.println("<ul>");
out.println("<li><a href='home.html'>Home</a></li>");
out.println("<li><a href='Login.html'>LogIn</a></li>");
out.println("<li><a href='regis.html'>Registration</a></li>");
out.println("<li><a href=''>About</a></li>");
out.println("<li><a href=''>contact</a></li>");
out.println("</ul>");
out.println("</div>");


out.println("<div id='data'>");
out.println("<center>");
out.println("<table  cellpadding='25px'>");

out.println("<tr>");
out.println("<td> Enter email</td>");
out.println("<td> <input type='text' id='t1' placeholder='Enter email..' name='email'></td>");
out.println("</tr>");



out.println("<tr>");
out.println("<td> Enter pass</td>");
out.println("<td> <input type='password' id='t2' placeholder='Enter Pass..' name='pass'></td>");
out.println("</tr>");

out.println("<tr>");
out.println("<th colspan='2'> <input type='submit' class='B' value='LogIn'></td>");
out.println("</tr>");


out.println("</table>");
out.println("</center>");
out.println("</div>");
out.println("</form>");

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