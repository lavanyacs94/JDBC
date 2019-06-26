package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Map;

public class twitter {
	
	public static  Map<String,Employee> getData()
	{
		Map<String,Employee> emp= new Hashtable<>();
		Connection con=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","CAPUTDRACONIS");
			String sql="select * from twitter";
			PreparedStatement ps= con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

			while(rs.next())
			{
				
				
				Employee e = new Employee();
				String uname = rs.getString("username");
				String pname= rs.getString("password");
				e.setuname(uname);
				e.setpname(pname);


			
		}}
			catch (SQLException | ClassNotFoundException e) {
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
return emp;
}
}