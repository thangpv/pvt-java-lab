package com.pvt.cookiesession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/client-access-counts")
public class ClientAccessCounts extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String countString = CookieUtilities.getCookieValue(request,
				"accessCount", "1");
		int count = 1;
		try {
			count = Integer.parseInt(countString);
		} catch (NumberFormatException nfe) {
		}
		LongLivedCookie c = new LongLivedCookie("accessCount",
				String.valueOf(count + 1));
		response.addCookie(c);
		response.getWriter().println("<HTML>\n" + "<HEAD><TITLE>TITLE</TITLE></HEAD>\n" + "<BODY BGCOLOR=\"#FDF5E6\">\n"
				+ "<CENTER>\n" + "<H1>COOKIE COUNTS</H1>\n"
				+ "<H2>This is visit number " + count
				+ " by this browser.</H2>\n" + "</CENTER></BODY></HTML>");
	}
}