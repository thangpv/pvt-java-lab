package com.pvt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThreeParamServlet
 */
@WebServlet("/three-params")
public class ThreeParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThreeParamServlet() {
    	
    	
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		
		writer.println("First param = " + request.getParameter("param1"));
		writer.println("Second param = " + request.getParameter("param2"));
		writer.println("Third param = " + request.getParameter("param3"));
		
		writer.println("4th param = " + request.getParameter("param4"));
		writer.println("5th param = " + request.getParameter("param5"));
		
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter writer = response.getWriter();
		
		writer.println("First param = " + request.getParameter("param1"));
		writer.println("Second param = " + request.getParameter("param2"));
		writer.println("Third param = " + request.getParameter("param3"));
		
		writer.println("4th param = " + request.getParameter("param4"));
		writer.println("5th param = " + request.getParameter("param5"));
	}

}
