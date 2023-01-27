import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/raja")
public class King extends HttpServlet {
	public King() {
		System.out.println("learn untill u get.....");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget");

		String name = req.getParameter("king name");
		String region = req.getParameter("region");
		String noOfQueens = req.getParameter("NoOfQueens");
		String DOB = req.getParameter("DOB");
		String DOD = req.getParameter("DOD");

		System.out.println(name);
		System.out.println(region);
		System.out.println(noOfQueens);
		System.out.println(DOB);
		System.out.println(DOD);

		PrintWriter writer = resp.getWriter();
		writer.print("king name" + name + "is sent success");
		writer.print(region);
		writer.print(noOfQueens);
		writer.print(DOB);
		writer.print(DOD);
		resp.setContentType("text/text");
	}

}
