package com.xworkz.location.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/adventure")
public class Location extends HttpServlet {
	public Location() {
		System.out.println("running location........");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget.....");

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String startpoint = req.getParameter("startpoint");
		String destination = req.getParameter("destination");
		String gender = req.getParameter("gender");

		System.out.println(name);
		System.out.println(email);
		System.out.println(startpoint);
		System.out.println(destination);
		System.out.println(gender);

		PrintWriter write = resp.getWriter();

		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");

		if (name.length() > 3) {
			write.print("<span style='color:green'/>");
			write.print(" Name is valid " + name);
		} else {
			write.print("<span style='color:red'/>");
			write.print("Name is not vallid");
		}

		write.print("<br>");

		if (email.length() > 5) {
			write.print("<span style='color:green'/>");
			write.print(" Email is valid " + email);
		} else {
			write.print("<span style='color:red'/>");
			write.print("Email is not vallid");
		}

		write.print("<br>");

		if (startpoint.length() > 5) {
			write.print("<span style='color:green'/>");
			write.print(" Starting point is valid " + startpoint);
		} else {
			write.print("<span style='color:red'/>");
			write.print("Starting point is not vallid");
		}

		write.print("<br>");

		if (destination.length() > 5) {
			write.print("<span style='color:green'/>");
			write.print(" Destination is valid " + destination);
		} else {
			write.print("<span style='color:red'/>");
			write.print("Destination  is not valid");
		}

		write.print("<br>");
		write.print("<a href=\"Contact.html\">Go back to Contact details</a>");
		write.print("<a href=\"index.html\">Back to home page</a>");
		write.print("</h1>");

		write.print("</body>");
		write.print("</html>");
		resp.setContentType("text/html");

	}
}
