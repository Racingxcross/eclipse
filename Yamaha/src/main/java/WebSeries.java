import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/funny")
public class WebSeries extends HttpServlet {
	public WebSeries() {
		System.out.println("running WebSeries...... ");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget..");

		String name = req.getParameter("series_name");
		String lang = req.getParameter("kannada");
		String episodes = req.getParameter("text");
		String ott = req.getParameter("ott");
		String budget = req.getParameter("budget");

		System.out.println(name);
		System.out.println(lang);
		System.out.println(episodes);
		System.out.println(ott);
		System.out.println(budget);

		PrintWriter writer = resp.getWriter();
		writer.print("series name" + name + "is sent success");
		writer.print(lang );
		writer.print(episodes);
		writer.print(ott);
		writer.print(budget);
		resp.setContentType("text/text");

	}
}
