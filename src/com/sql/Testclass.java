package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Testclass {

	public static void main(String[] args) {
		
		Connection con =null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","CAPUTDRACONIS");
			String sql="select * from facebook";
			PreparedStatement ps= con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

			while(rs.next())
			{
				String uname = rs.getString("username");
				String pname= rs.getString("password");
				System.out.println(uname);
				System.out.println(pname);

			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
				
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
				
		}
		
		}
}

	

