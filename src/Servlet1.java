

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serv1")
public class Servlet1 extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("username");
		String pass = request.getParameter("pass");
		out.print("Hello "+name);
		out.print("<br>");
		out.print("<br>");
		out.print("Your password is : "+pass);
		

		Cookie ck = new Cookie("uname", name);
		response.addCookie(ck);
		Cookie ck1 = new Cookie("upass", pass);
		response.addCookie(ck1);
		

out.print("<form action='serv2'>");


out.print("<input type='submit' value = 'Go'>");
out.print("</form>");
}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
