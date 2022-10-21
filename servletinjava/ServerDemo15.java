import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ServerDemo15 extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
	
	{
		PrintWriter out=response.getWriter();
		
		String s1=request.getParameter("d1");
		
		
		

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
		
		

		
		
		String q=" select * from student where Rollno='"+s1+"'";
		ResultSet rs=st.executeQuery(q);
	    
		// String q1="select * from student where Rollno='"+s1+"'";
		// ResultSet rs=st.executeUpdate(q1);
		
		          out.println("<center>");
		          out.println("<form action='wel16'>");
				  
				 out.println("<table border='1' cellpadding='12'>");	
		if(rs.next())
		{
			out.println("<tr>");
			out.println("<th>Rollno</th>");
			out.println("<th><input type='text' id='t1'  value='"+rs.getString(1)+"'  name='n1'></th>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<th>name</th>");
			out.println("<th><input type='text' id='t1'  value='"+rs.getString(2)+"' name='n2'></th>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<th>physics</th>");
			out.println("<th><input type='text' id='t1'  value='"+rs.getString(3)+"'  name='n3'></th>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<th>chemistry</th>");
			out.println("<th><input type='text' id='t1'  value='"+rs.getString(4)+"'  name='n4'></th>");
			out.println("</tr>");
			
			
			out.println("<tr>");
			out.println("<th>maths</th>");
			out.println("<th><input type='text' id='t1' value='"+rs.getString(5)+"'  name='n5'></th>");
			out.println("</tr>");
			
			
			out.println("<tr>");
			out.println("<th colspan='2'><input type='submit' class='B' value='update'></th>");
			out.println("</tr>");
			
			
		}
		
				out.println("</table>");
				out.println("</form>");
				
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
		