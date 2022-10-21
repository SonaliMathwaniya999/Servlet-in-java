import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ServerDemo16 extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
	
	{
		PrintWriter out=response.getWriter();
		
		String s1=request.getParameter("n1");
		String s2=request.getParameter("n2");
		String s3=request.getParameter("n3");
		String s4=request.getParameter("n4");
		String s5=request.getParameter("n5");
		
		
		

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
		
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String db_url="jdbc:mysql://localhost:3306/sonalidb?useSSL=false";
			String uname="root";
			String upass="root";
			
			
			Connection con=DriverManager.getConnection(db_url,uname,upass);
		
		Statement st=con.createStatement();
		
		

		
		
		String q=" update student set sname='"+s2+"',physics='"+s3+"',chemistry='"+s4+"',maths='"+s5+"' where Rollno='"+s1+"'";
		  st.executeUpdate(q);
	 response.sendRedirect("wel11");  	
		con.close();
		
		}catch(Exception e)
		{
			out.println(e);
			
		}
		
		
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}
	
	
	
}
		