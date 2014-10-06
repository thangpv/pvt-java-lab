package com.pvt.cookiesession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/show-session")
public class ShowSession extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession(true);
		synchronized (session) {
			String heading;
			Integer accessCount = (Integer) session.getAttribute("accesscountsession");
			if (accessCount == null) {
				accessCount = 0;
				heading = "Welcome, Newcomer";
			} else {
				heading = "Welcome Back";
				accessCount = accessCount + 1;
			}
			session.setAttribute("accesscountsession", accessCount);
			PrintWriter out = response.getWriter();
			out.println("<HTML>\n" + "<HEAD><TITLE>TITLE</TITLE></HEAD>\n"
					+ "<BODY BGCOLOR=\"#FDF5E6\">\n" + "<CENTER>\n"
					+ "<H1>HEADING</H1>\n"
					+ "<H2>Information on Your Session:</H2>\n"
					+ "<TABLE BORDER=1>\n" + "<TR BGCOLOR=\"#FFAD00\">\n"
					+ " <TH>Info Type<TH>" + session.getId() + "\n"
					+ " <TD>Number of Previous Accesses\n" + " <TD>"
					+ accessCount + "\n" + "</TABLE>\n"
					+ "</CENTER></BODY></HTML>");
		}
	}
}
