import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
	public void service(HttpServletRequest req,
		HttpServletResponse res)
			throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		out.println("<HTML>");
		out.println("<BODY>");
		out.println("<H3>Hello World!</H3>");
		out.println("</BODY>");
		out.println("</HTML>");
	}
}
