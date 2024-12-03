import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Profile")
public class Profile extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Profile</title>");

		out.println("</head]>");
		out.println("<body bgcolor='pink'>");
		out.printf("<h3>First Name    : Pranjal</h3>");
		out.printf("<h3>Last Name     : Deshmukh</h3>");
		out.printf("<h3>Qualification : PG-DAC</h3>");
		out.printf("<h3>College       : Sunbeam Institute, Karad</h3>");
		out.printf("<h3>Birth Date   : 30/05/2001</h3>");

		out.println("</body>");
		out.println("</html>");

	}

}
