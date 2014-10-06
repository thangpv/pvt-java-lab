package com.pvt.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/personlist")
public class PersonListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		try {
			// Register JDBC driver
	         Class.forName("com.mysql.jdbc.Driver");

	         // Open a connection
	        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mygset","root","Abcd@1234");

			Statement statement = connection.createStatement();

			String query = "SELECT id, name, country FROM person ";
			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				resp.getWriter().printf("Name: %s, Country: %s%n",
						resultSet.getString("name"),
						resultSet.getString("country"));
			}
			
			String insertSql = "insert into person (name, country) values (?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
			
			preparedStatement.setString(1, "Name1");
			preparedStatement.setString(2, "Country1");
			
			preparedStatement.executeUpdate();

			connection.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
