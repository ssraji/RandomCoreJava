package com.raji.ems.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root1234");
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from mySchema.new_table");
			while (rs.next())
				System.out.println("Result = "+rs.getInt(1) + "  " + rs.getString(2) );
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
