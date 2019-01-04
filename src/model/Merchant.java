package model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import server.DataConnect;

import com.mysql.jdbc.ResultSetMetaData;

public class Merchant implements Serializable{
	private String mid;
	private String mername;
	private String memail;
	private String merpassword;
	private String mmomey;
	private String mstate;
	
	public Merchant(String mid, String mername, String memail,
			String merpassword, String mmomey, String mstate) {
		super();
		this.mid = mid;
		this.mername = mername;
		this.memail = memail;
		this.merpassword = merpassword;
		this.mmomey = mmomey;
		this.mstate = mstate;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMername() {
		return mername;
	}
	public void setMername(String mername) {
		this.mername = mername;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public String getMerpassword() {
		return merpassword;
	}
	public void setMerpassword(String merpassword) {
		this.merpassword = merpassword;
	}
	public String getMmomey() {
		return mmomey;
	}
	public void setMmomey(String mmomey) {
		this.mmomey = mmomey;
	}
	public String getMstate() {
		return mstate;
	}
	public void setMstate(String mstate) {
		this.mstate = mstate;
	}
	public static Merchant login(String mername,String merpw) throws SQLException, ClassNotFoundException{//登录
		Merchant m = null ;
		String sql = "select * from merchant where mername='"+mername+"' and merpassword ='"+merpw+"'";
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		if(rs.next())
			m = new Merchant(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
		return m;
	}
	public static void register(String mername,String meremail,String merpassword) throws SQLException, ClassNotFoundException{
		String sql = "insert into merchant ( mername , merpassword , memail , mmoney ) values ('"+mername+"','"+merpassword+"','"+meremail+"','0')";
		DataConnect.getStatement().executeUpdate(sql);
	}
	public static Object[][] view_game(String mername) throws SQLException, ClassNotFoundException{//查看游戏
		String sql = "select * from game where mername = '"+mername+"'";
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
	public static void  add_game(String gname , String  price , String gurl , String gtext ,  String gtime , String mername) throws SQLException, ClassNotFoundException{//添加游戏
		String sql = "insert into game ( gname , gprice , gurl , gtext , gtime , mername , downloads, collection) values ( '"+gname+"' , '"+price+"' , '"+gurl+"' , '"+gtext+"' , '"+gtime+"' , '"+mername+"' , '0' , '0')";
		DataConnect.getStatement().executeUpdate(sql);
	}
	public static Object[][] view_commentlist(String game) throws SQLException, ClassNotFoundException{//查看评论
		String sql = "select * from commentlist where game = '"+game+"'";
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
	public static void reply(String uname , String ctext , String game) throws SQLException, ClassNotFoundException{//回复评论
		String sql = "insert into commentlist ( uname , ctext , game ) values ('"+uname+"','"+ctext+"','"+game+"')";
		DataConnect.getStatement().executeUpdate(sql);
	}
	public static void  modify_price(String gprice , String gid) throws SQLException, ClassNotFoundException{//修改价格
		String sql = "update game set gprice = '"+gprice+"' where gid = '"+gid+"'";
		DataConnect.getStatement().executeUpdate(sql);
	}
	public static void  modify_state(String gid) throws SQLException, ClassNotFoundException{//修改价格
		String sql = "update game set gstate = '0' where gid = '"+gid+"'";
		DataConnect.getStatement().executeUpdate(sql);
	}
	protected String view_money(int uid) throws SQLException, ClassNotFoundException{//查看钱包
		String sql = "select * from userdetails where rid = 'uid'";
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		String string = "";
		while (rs.next()) {
			string += "[" + rs.getString("mmoney") + "]";
			string += "\n";
		}
		return string;
	}
}
