package model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.ResultSetMetaData;

import server.DataConnect;

public class Management implements Serializable{
	private String admin;
	private String adpassword;
	public Management(String admin, String adpassword) {
		super();
		this.admin = admin;
		this.adpassword = adpassword;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getAdpassword() {
		return adpassword;
	}
	public void setAdpassword(String adpassword) {
		this.adpassword = adpassword;
	}
	public static Management login(String admin,String adpassword) throws SQLException, ClassNotFoundException{//登录
		Management m = null ;
		String sql = "select * from management where admin='"+admin+"' and adpassword ='"+adpassword+"'";
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		if(rs.next())
			m = new Management(rs.getString(1),rs.getString(2));
		return m;
	}
	public static Object[][] view_announcement() throws SQLException, ClassNotFoundException{//查看公告
		String sql = "select * from announcement";
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		Object[][] data;
		rs.last();
		int rows = rs.getRow();
		data = new Object[rows][];
		ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();
		int columnCount = md.getColumnCount();//列数
		rs.first();
		Object[] row = new Object[columnCount];
		for(int i=0; i<columnCount; i++) {
			row[i] = rs.getString(i+1);
			}
		data[0] = row;
		int k = 1;
		while(rs.next()){
			Object[] row1 = new Object[columnCount];
			for(int i=0; i<columnCount; i++) {
				row1[i] = rs.getString(i+1);
		}
			data[k] = row1;
			k++;
		}
		return data;
	}
	public static Object[][] view_commentlist() throws SQLException, ClassNotFoundException{//查看评论
		String sql = "select * from commentlist";
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		Object[][] data;
		rs.last();
		int rows = rs.getRow();
		data = new Object[rows][];
		ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();
		int columnCount = md.getColumnCount();//列数
		rs.first();
		Object[] row = new Object[columnCount];
		for(int i=0; i<columnCount; i++) {
			row[i] = rs.getString(i+1);
			}
		data[0] = row;
		int k = 1;
		while(rs.next()){
			Object[] row1 = new Object[columnCount];
			for(int i=0; i<columnCount; i++) {
				row1[i] = rs.getString(i+1);
		}
			data[k] = row1;
			k++;
		}
		return data;
	}
	public static Object[][] view_user() throws SQLException, ClassNotFoundException{//查看用户
		String sql = "select * from user";
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		Object[][] data;
		rs.last();
		int rows = rs.getRow();
		data = new Object[rows][];
		ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();
		int columnCount = md.getColumnCount();//列数
		rs.first();
		Object[] row = new Object[columnCount];
		for(int i=0; i<columnCount; i++) {
			row[i] = rs.getString(i+1);
			}
		data[0] = row;
		int k = 1;
		while(rs.next()){
			Object[] row1 = new Object[columnCount];
			for(int i=0; i<columnCount; i++) {
				row1[i] = rs.getString(i+1);
		}
			data[k] = row1;
			k++;
		}
		return data;
	}
	public static Object[][] view_merchant() throws SQLException, ClassNotFoundException{//查看商家
		String sql = "select * from merchant";
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		Object[][] data;
		rs.last();
		int rows = rs.getRow();
		data = new Object[rows][];
		ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();
		int columnCount = md.getColumnCount();//列数
		rs.first();
		Object[] row = new Object[columnCount];
		for(int i=0; i<columnCount; i++) {
			row[i] = rs.getString(i+1);
			}
		data[0] = row;
		int k = 1;
		while(rs.next()){
			Object[] row1 = new Object[columnCount];
			for(int i=0; i<columnCount; i++) {
				row1[i] = rs.getString(i+1);
		}
			data[k] = row1;
			k++;
		}
		return data;
	}
	public static Object[][] view_game() throws SQLException, ClassNotFoundException{//查看游戏
		String sql = "select * from game";
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		Object[][] data;
		rs.last();
		int rows = rs.getRow();
		data = new Object[rows][];
		ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();
		int columnCount = md.getColumnCount();//列数
		rs.first();
		Object[] row = new Object[columnCount];
		for(int i=0; i<columnCount; i++) {
			row[i] = rs.getString(i+1);
			}
		data[0] = row;
		int k = 1;
		while(rs.next()){
			Object[] row1 = new Object[columnCount];
			for(int i=0; i<columnCount; i++) {
				row1[i] = rs.getString(i+1);
		}
			data[k] = row1;
			k++;
		}
		return data;
	}
	public static void  release(String atext , String time) throws SQLException, ClassNotFoundException{//发布公告
		String sql = "insert into announcement ( atext ,time ) values ('"+atext+"' ,'"+time+"')";
		DataConnect.getStatement().executeUpdate(sql);
	}
	public static void delete_announcement(String aid) throws SQLException, ClassNotFoundException{//删除公告
		String sql = "delete from announcement where aid = '"+aid+"'";
		DataConnect.getStatement().executeUpdate(sql);
	}
	public static void delete_commentlist(String cid) throws SQLException, ClassNotFoundException{//删除评论
		String sql = "delete from commentlist where cid = '"+cid+"'";
		DataConnect.getStatement().executeUpdate(sql);
	}
	public static void delete_user(String id ,String banwhy) throws SQLException, ClassNotFoundException{//禁止用户
		String sql = "update user set state = 0 , banwhy = '"+banwhy+"' where id = '"+id+"'";
		DataConnect.getStatement().executeUpdate(sql);
	}
	public static boolean delete_merchant(String mid) throws SQLException, ClassNotFoundException{//禁止商家
		String sql = "update merchant set mstate = 0 where mid = '"+mid+"'";
		DataConnect.getStatement().executeUpdate(sql);
		return true;
	}
	public static boolean delete_game(String gid) throws SQLException, ClassNotFoundException{//禁止游戏
		String sql = "update game set gstate = 0 where gid = '"+gid+"'";
		DataConnect.getStatement().executeUpdate(sql);
		return true;
	}
	protected String view_buynumber() throws SQLException, ClassNotFoundException{//查看游戏下载量
		String sql = "select * from buygame";
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		String string = "";
		while (rs.next()) {
			string += "[" + rs.getString("uname") + "]" + rs.getString("game");
			string += "\n";
		}
		return string;
	}
}
