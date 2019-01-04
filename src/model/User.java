package model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.ResultSetMetaData;

import server.DataConnect;

public class User implements Serializable{
	private String id;
	private String username;
	private String userpassword;
	private String uemail;
	private int state;
	private String banwhy;
	public User(String id, String username, String userpassword, String uemail,
			int state, String banwhy) {
		super();
		this.id = id;
		this.username = username;
		this.userpassword = userpassword;
		this.uemail = uemail;
		this.state = state;
		this.banwhy = banwhy;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBanwhy() {
		return banwhy;
	}
	public void setBanwhy(String banwhy) {
		this.banwhy = banwhy;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String usernaem) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public static User login(String username , String userpassword) throws SQLException, ClassNotFoundException{//登录
		User u = null;
		String sql = "select * from user where username='"+username+"' and userpassword ='"+userpassword+"'";
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		if(rs.next()){
			u = new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6));	
		}
		return u;
	}
	public static void register(String username , String userpassword , String uemail , String state) throws SQLException, ClassNotFoundException{//注册
		String sql = "insert into user ( username , userpassword , uemail , state ) values ('"+username+"','"+userpassword+"','"+uemail+"' , '"+state+"' )";
		DataConnect.getStatement().executeUpdate(sql);
	}
	public static String[] view_information(String uid) throws SQLException, ClassNotFoundException{//查看个人信息
		String sql = "select * from userdetails where rid = '"+uid+"'";
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();
		int columnCount = md.getColumnCount();//列数
		String[] massage = new String[columnCount];
		while (rs.next()) {
			for(int i=0; i<columnCount; i++){
				massage[i] = rs.getString(i+1);
			}
		}
		return massage;
	}
	public static void head_picture(String username , String fname) throws SQLException, ClassNotFoundException{//上传头像
		String sql = "update userdetails set userimage = '"+fname+"' where username = '"+username+"'";	
		DataConnect.getStatement().executeUpdate(sql);
	}
	public static String[] view_information2(String username) throws SQLException, ClassNotFoundException{//查看个人信息
		String sql = "select * from userdetails where username = '"+username+"'";
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();
		int columnCount = md.getColumnCount();//列数
		String[] massage = new String[columnCount];
		while (rs.next()) {
			for(int i=0; i<columnCount; i++){
				massage[i] = rs.getString(i+1);
			}
		}
		return massage;
	}
	/*public static String loadFile(String username) throws SQLException, ClassNotFoundException{//获取个人头像
		String sql = "select * from userdetails where username='"+username+"'";
        ResultSet rs = DataConnect.getStatement().executeQuery(sql);
        String fname = null;
        if (rs.next()) {
	       fname = rs.getString(9);
        }
        return fname;
	}*/
	public static Object[][] view_game(String uid) throws SQLException, ClassNotFoundException{//查看已购买游戏
		String sql = "select * from buygame where uid = '"+uid+"'";
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
	/*public static String getHead(String id) throws SQLException, ClassNotFoundException{
		String sql = "select * from userdetails where rid = '"+id+"'";
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		String Head = "";
		while(rs.next()){
			Head = rs.getString(9);
		}	
		return Head;
	}*/
	public static void modify(String rid, String realname, String countrie , String priovince ,String city) throws SQLException, ClassNotFoundException{//修改个人信息
		String sql = "update userdetails set realname = '"+realname+"' ,countrie = '"+countrie+"' ,priovince = '"+priovince+"' ,city = '"+city+"' where rid = '"+rid+"'";
		DataConnect.getStatement().executeUpdate(sql);
	}
	public static String[][] view_game() throws SQLException, ClassNotFoundException{//查看游戏
		String sql = "select * from game";
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		String[][] data;
		rs.last();
		int rows = rs.getRow();
		data = new String[rows][];
		ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();
		int columnCount = md.getColumnCount();//列数
		rs.first();
		String[] row = new String[columnCount];
		for(int i=0; i<columnCount; i++) {
			row[i] = rs.getString(i+1);
			}
		data[0] = row;
		int k = 1;
		while(rs.next()){
			String[] row1 = new String[columnCount];
			for(int i=0; i<columnCount; i++) {
				row1[i] = rs.getString(i+1);
		}
			data[k] = row1;
			k++;
		}
		return data;
	}
	public static String[] onegame(String gname) throws SQLException, ClassNotFoundException{//查看单个游戏信息
		String sql = "select * from game where gname = '"+gname+"'";
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();
		int columnCount = md.getColumnCount();//列数
		String[] massage = new String[columnCount];
		while (rs.next()) {
			for(int i=0; i<columnCount; i++){
				massage[i] = rs.getString(i+1);
			}
		}
		return massage;
	}
	public static void personmessage(String id, String username, String uemail, String realname, String countrie , String umoney, String priovince , String city) throws SQLException, ClassNotFoundException{//更新个人信息
		String sql = "insert into userdetails ( rid, username, uemail, realname, countrie , umoney, priovince ,city ) values ('"+id+"','"+username+"','"+uemail+"','"+realname+"','"+countrie+"','"+umoney+"','"+priovince+"','"+city+"')";
		DataConnect.getStatement().executeUpdate(sql);
	}
	public static void buyperson(String id,String uname, String game, String time) throws SQLException, ClassNotFoundException{//购买游戏
		String sql = "insert into buygame ( uid , uname , game , time) values ('"+id+"','"+uname+"','"+game+"','"+time+"')";
		DataConnect.getStatement().executeUpdate(sql);
	}
	public static void collection(String uid , String uname , String game) throws SQLException, ClassNotFoundException{//收藏
		String sql = "insert into gcollection ( uid , uname , game ) values ( '"+uid+"' , '"+uname+"' , '"+game+"' )";
		DataConnect.getStatement().executeUpdate(sql);
	}
	public static void buy(String rid,String money) throws SQLException, ClassNotFoundException{//更新余额
		String sql = "update userdetails set umoney = '"+money+"'  where rid = '"+rid+"'";
		DataConnect.getStatement().executeUpdate(sql);
	}
	public static String[] merchantmoney(String mername) throws SQLException, ClassNotFoundException{//查看商家小金库
		String sql = "select * from merchant where mername = '"+mername+"'";
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();
		int columnCount = md.getColumnCount();//列数
		String[] massage = new String[columnCount];
		while (rs.next()) {
			for(int i=0; i<columnCount; i++){
				massage[i] = rs.getString(i+1);
			}
		}
		return massage;
	}
	public static void upmerprice(String mername,String money) throws SQLException, ClassNotFoundException{//更新商家小金库
		String sql = "update merchant set mmoney = '"+money+"'  where mername = '"+mername+"'";
		DataConnect.getStatement().executeUpdate(sql);
	}
	public static String[][] view_collection(String id) throws SQLException, ClassNotFoundException{//查看收藏度
		String sql = "select * from gcollection where uid = '"+id+"'";
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		String[][] data;
		rs.last();
		int rows = rs.getRow();
		data = new String[rows][];
		ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();
		int columnCount = md.getColumnCount();//列数
		rs.first();
		String[] row = new String[columnCount];
		for(int i=0; i<columnCount; i++) {
			row[i] = rs.getString(i+1);
			}
		data[0] = row;
		int k = 1;
		while(rs.next()){
			String[] row1 = new String[columnCount];
			for(int i=0; i<columnCount; i++) {
				row1[i] = rs.getString(i+1);
		}
			data[k] = row1;
			k++;
		}
		return data;
	}
	public static void fivexing(String id, String username, String fivestar, String game) throws SQLException, ClassNotFoundException{//五星好评
		String sql = "insert into fivestar ( id , username , fivestar , game ) values ( '"+id+"' , '"+username+"' , '"+fivestar+"' ,  '"+game+"' )";
		DataConnect.getStatement().executeUpdate(sql);
	}
	public static String[][] fivestar(String gamename) throws SQLException, ClassNotFoundException{//五星好评
		String sql = "select * from fivestar where game = '"+gamename+"'";
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		String[][] data;
		rs.last();
		int rows = rs.getRow();
		data = new String[rows][];
		ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();
		int columnCount = md.getColumnCount();//列数
		rs.first();
		String[] row = new String[columnCount];
		for(int i=0; i<columnCount; i++) {
			row[i] = rs.getString(i+1);
			}
		data[0] = row;
		int k = 1;
		while(rs.next()){
			String[] row1 = new String[columnCount];
			for(int i=0; i<columnCount; i++) {
				row1[i] = rs.getString(i+1);
		}
			data[k] = row1;
			k++;
		}
		return data;
	}
	public static void upcollection(String game,String collection) throws SQLException, ClassNotFoundException{
		String sql = "update game set collection = '"+collection+"'  where gname = '"+game+"'";
		DataConnect.getStatement().executeUpdate(sql);
	}
	public static void updownload(String game,String download) throws SQLException, ClassNotFoundException{
		String sql = "update game set downloads = '"+download+"'  where gname = '"+game+"'";
		DataConnect.getStatement().executeUpdate(sql);
	}
}