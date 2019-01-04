package server;

import java.sql.*;

public class DataConnect {

	private static Statement stat;
	private static void init() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/f4?"+ "user=root&password=123456&useUnicode=true&characterEncoding=UTF8");
		 //String url = "jdbc:mysql://127.0.0.1:3307/blbl?"+ "user=root&password=123456&useUnicode=true&characterEncoding=UTF8";
		stat = con.createStatement();
		
	}
	public static Statement getStatement() throws ClassNotFoundException, SQLException{
		if(stat==null)
			init();
		return stat;
	}
}
