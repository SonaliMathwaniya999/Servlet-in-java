import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ServerDemo11 extends HttpServlet
{
	public void doGet(HttpServletRequest request, 
	HttpServletResponse response)throws IOException, ServletException
	
	{
		PrintWriter out=response.getWriter();
		
	
		out.println("<html>");
		out.println("<head>");


out.println("<link rel='stylesheet' type='text/css'   href='xyz.css'  />");
out.println("</head>");
		out.println("<body>");
out.println("<div id='mymenu'>");
out.println("<ul>");
out.println("<li><a href='home.html'>Home</a></li>");
out.println("<li><a href='search.html'>search</a></li>");
out.println("<li><a href='insert.html'>insert</li>");
out.println("<li>update</li>");
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
			
		String q="select * from student ";
		
		ResultSet rs=st.executeQuery(q);
		
		out.println("<center>");
				out.println("<table border='1' cellpadding='12'>");	
			while(rs.next())
			{
				out.println("<tr>");
				out.println("<td>"+rs.getString(1)+"</td>");
				out.println("<td>"+rs.getString(2)+"</td>");
				out.println("<td>"+rs.getString(3)+"</td>");
				out.println("<td>"+rs.getString(4)+"</td>");
				out.println("<td>"+rs.getString(5)+"</td>");
				out.println("</tr>");
			}
			
				out.println("</table>");
				out.println("</center>");
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