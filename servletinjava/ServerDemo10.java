import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ServerDemo10 extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
	
	{
		PrintWriter out=response.getWriter();
		
		String s1=request.getParameter("email");
		String s2=request.getParameter("pass");
		out.println("<html>");
		out.println("<body>");
		
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String db_url="jdbc:mysql://localhost:3306/sonalidb?useSSL=false";
			String uname="root";
			String upass="root";
			
			
		Connection con=DriverManager.getConnection(db_url,uname,upass);
		
		Statement st=con.createStatement();
			
		String q="select * from regis where email='"+s1+"' and  password='"+s2+"'";
		
		ResultSet rs=st.executeQuery(q);
		
		if((s1.equals(""))&&(s2.equals("")))
		{
			out.println("<p>insert complete deatils</p>");
			
		}
		
		else
		{	
	     if(rs.next())
		{
			Cookie ck =new Cookie("un",s1);
			ck.setMaxAge(60*60*24);
			response.addCookie(ck);
			response.sendRedirect("menu.html");
		}
		else{
			
			response.sendRedirect("Login.html");
			out.println("<p>invalid username ans password</p>");
		}
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