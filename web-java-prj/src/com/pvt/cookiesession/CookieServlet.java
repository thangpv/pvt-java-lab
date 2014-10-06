package com.pvt.cookiesession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/repeat-visitor")
public class CookieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String title;

		boolean newbie = true;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if ((c.getName().equals("repeatVisitor"))
						&& (c.getValue().equals("yes"))) {
					newbie = false;
					break;
				}
			}
		}

		if (newbie) {
			Cookie returnVisitorCookie = new Cookie("repeatVisitor", "yes");
			returnVisitorCookie.setMaxAge(60 * 60 * 24 * 365);
			response.addCookie(returnVisitorCookie);
			title = "Welcome Aboard";
		} else {
			title = "Welcome Back";
		}

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(title);
	}
}
