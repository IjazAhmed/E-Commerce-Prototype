package two;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Three extends HttpServlet{
		private String message;
		
		public void init () throws ServletException{
			message= "Welcome to My Store TTP";
		}
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
			response.setContentType("text/html");
			
			PrintWriter out= response.getWriter();
			out.println("<h1>"+message+"</h1>");
			out.flush();
			
		}
		public void destroy() {
			
		}

}


