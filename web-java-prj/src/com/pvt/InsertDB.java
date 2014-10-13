package com.pvt;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pvt.javabean.Employee;



/**
 * Servlet implementation class InsertDB
 */
@WebServlet("/InsertDB")
public class InsertDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	String name, pass, pass1, phone, email;
	Connection connection;
	Statement statement;
	ResultSet re;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertDB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
		name =request.getParameter("user");
		pass =request.getParameter("pass");
		pass1 =request.getParameter("repass");
		phone =request.getParameter("phone");
		email =request.getParameter("email");
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mygset","root","Abcd@1234");

		
		Statement statement = connection.createStatement();
		String s="INSERT INTO employee (name,pass,phone,email)values(?,?,?,?) ";
		PreparedStatement preparedStatement = connection.prepareStatement(s);
		
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, pass);
		//preparedStatement.setString(3, pass1);
		preparedStatement.setString(3, phone);
		preparedStatement.setString(4, email);
		
		
		
		preparedStatement.executeUpdate();
		
		
		statement= connection.createStatement();
		String query = "SELECT id, name, phone,email FROM employee ";
		ResultSet resultSet = statement.executeQuery(query);
		
		List<Employee> employees = new ArrayList<>();
		
		while (resultSet.next()) {
			employees.add(new Employee(
					resultSet.getInt("id"),
					resultSet.getString("name"),
					resultSet.getString("name"),
					resultSet.getString("phone"),
					resultSet.getString("email")));
			
		}
		
		request.setAttribute("employees", employees);
		RequestDispatcher dispatcher =
			      request.getRequestDispatcher("/WEB-INF/results/employeelist.jsp");
			    dispatcher.forward(request, response);
		
		
		connection.close();
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
