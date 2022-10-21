import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ServerDemo12 extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
	
	{
		PrintWriter out=response.getWriter();
		
   		String s1=request.getParameter("r1");
		String s2=request.getParameter("r2");
		String s3=request.getParameter("r3");
		String s4=request.getParameter("r4");
		String s5=request.getParameter("r5");
		
		out.println("<html>");
		out.println("<body>");
		
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String db_url="jdbc:mysql://localhost:3306/sonalidb?useSSL=false";
			String uname="root";
			String upass="root";
			
			
		Connection con=DriverManager.getConnection(db_url,uname,upass);
		
		Statement st=con.createStatement();
		
		
		if((s1.equals(""))||(s2.equals(""))||(s3.equals(""))||(s4.equals(""))||(s5.equals("")))
		{
			out.println("insert complete detailes");
			
		}
		
		else
		{	
		
		
		String q="insert into student values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')";
		st.executeUpdate(q);
	    response.sendRedirect("wel11");
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