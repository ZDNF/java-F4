package server;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;



import model.Management;
import model.Merchant;
import model.Merchant;
import model.User;

public class Server extends Thread{
	ObjectInputStream ois;
	ObjectOutputStream oos;
	Socket s;
	final int USER_LOGIN = 1001;//用户登录
	final int USER_REGISTER = 1002;//用户注册
	final int MANAGEMENT_LOGIN = 1003;//管理者登录
	final int MERCHANT_LOGIN = 1004;//商家登录
	final int MERCHANT_REGISTER = 1005;//商家注册
	final int PERSON_MASSAGE = 1006;//查看个人信息
	final int UPLOAD = 1007;//上传头像
	final int LOADFILE = 1008;//获取个人头像
	final int PERSONGAME = 1009;//查看已购游戏
	final int MODIFY = 1010;//修改个人信息
	final int MERCHANTGAME = 1011;//商家查看游戏
	final int ADDGAME = 1012;//商家添加游戏
	final int GUPLOAD = 1013;//上传游戏图片
	final int VIEWCOMMENTLIST = 1014;//指定查看评论
	final int REPLY = 1015;//回复评论
	final int NEWPRICE = 1016;//修改游戏价格
	final int BANGAME = 1017;//ban游戏
	final int MESSAGEGAME = 1018;//查看所有游戏
	final int VIEWMERCHANT = 1019;//查看商家
	final int USERMESSAGE = 1020;//查看用户信息
	final int ALLCOMMENTLIST = 1021;//查看所有评论
	final int ANNOUNCEMENT  = 1022;//查看公告
	final int NEWANNOUNCEMENT = 1023;//发布公告
	final int DELETEANNOUNCEMENT = 1024;//delete公告
	final int DELETECOMMENTLIST = 1025;//删除评论
	final int BANUSER = 1026;//ban用户
	final int BANMERCHANT = 1027;//ban商家
	final int ONEGAME = 1028;//查看单个游戏信息
	final int PERSONMESSAGE = 1029;//创建用户信息
	final int BUYPERSON = 1030;//购买游戏（个人）
	final int COLLECTION = 1031;//收藏游戏
	final int BUY = 1032;//购买游戏，用户余额更新
	final int MERCHANTMONEY = 1033;//查看商家小金库
	final int UPMERMONEY = 1034;//更新商家小金库
	final int VIEWCOLLECTION = 1035;//查看个人收藏
	final int FIVESTAR = 1036;//五星好评
	final int VIEW_FIVESTAR = 1037;//查看五星好评
	final int PERSON = 1038;//创建用户信息
	final int UPCOLLECTION = 1039;//更新收藏
	final int UPDOWNLOAD = 1040;//更新下载量
	public Server(Socket socket) {
		this.s = socket;

	}	
	public void run() {
			try {
				ois = new ObjectInputStream(s.getInputStream());
				oos = new ObjectOutputStream(s.getOutputStream());
			    int command = ois.readInt();
			    if (command == USER_LOGIN) {
			    	user_login();
				}
			    if (command == USER_REGISTER) {
				    user_register();
			    }
			    if (command == MANAGEMENT_LOGIN) {
				    management_login();
			    }
			    if (command == MERCHANT_LOGIN){
			    	merchant_login();
			    }
			    if (command == MERCHANT_REGISTER){
			    	merchant_register();
			    }
			    if (command == PERSON_MASSAGE){
			    	person_massage();
			    }
			    if (command == UPLOAD){
			    	upLoadFile();
			    }
			    if (command == LOADFILE){
			    	loadFile();
			    }
			    if (command == PERSONGAME){
			    	persongame();
			    }
			    if (command == MODIFY){
			    	modify();
			    }
			    if (command == MERCHANTGAME){
			    	merchantgame();
			    }
			    if (command == ADDGAME){
			    	addgame();
			    }
			    if (command == GUPLOAD){
			    	gupLoadFile();
			    }
			    if (command == VIEWCOMMENTLIST){
			    	view_commentlist();
			    }
			    if (command == REPLY){
			    	reply();
			    }
			    if (command == NEWPRICE){
			    	newprice();
			    }
			    if (command == BANGAME){
			    	bangame();
			    }
			    if (command == MESSAGEGAME){
			    	messagegame();
			    }
			    if (command == VIEWMERCHANT){
			    	view_merchant();
			    }
			    if (command == USERMESSAGE){
			    	usermessage();
			    }
			    if (command == ALLCOMMENTLIST){
			    	allcommentlist();
			    }
			    if (command == ANNOUNCEMENT){
			    	announcement();
			    }
			    if (command  == NEWANNOUNCEMENT){
			    	newannouncement();
			    }
			    if (command == DELETEANNOUNCEMENT){
			    	deleteannouncement();
			    }
			    if (command == DELETECOMMENTLIST){
			    	deletecommentlist();
			    }
			    if (command == BANUSER){
			    	banuser();
			    }
			    if (command == BANMERCHANT){
			    	banmerchant();
			    }
			    if (command == ONEGAME){
			    	onegame();
			    }
			    if (command == PERSONMESSAGE){
			    	person();
			    }
			    if (command == BUYPERSON){
			    	buyperson();
			    }
			    if (command == COLLECTION){
			    	collection();
			    }
			    if (command == BUY){
			    	buy();
			    }
			    if (command == MERCHANTMONEY){
			    	merchantmoney();
			    }
			    if (command == UPMERMONEY){
			    	upmermoney();
			    }
			    if (command == VIEWCOLLECTION){
			    	view_collection();
			    }
			    if (command == FIVESTAR){
			    	fivestar();
			    }
			    if (command == VIEW_FIVESTAR){
			    	view_fivestar();
			    }
			    if (command == PERSON){
			    	personmessage();
			    }
			    if (command == UPCOLLECTION){
			    	upcollection();
			    }
			    if (command == UPDOWNLOAD){
			    	updownload();
			    }
			    } catch (IOException e) {
				// TODO Auto-generated catch block
				    e.printStackTrace();
			} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	}
	public void user_login() throws IOException, SQLException, ClassNotFoundException{
		String uname = ois.readUTF();
		String upw = ois.readUTF();
		User u = User.login(uname, upw);
		oos.writeObject(u);
		oos.flush();		
	}
	public void user_register() throws IOException, ClassNotFoundException, SQLException{
		String username =ois.readUTF();
		String userpassword = ois.readUTF();
		String uemail = ois.readUTF();
		User.register(username, userpassword, uemail , "1" );
		oos.writeObject(User.login(username, userpassword));
		oos.flush();
		oos.close();
		ois.close();
		s.close();
	}
	public void management_login() throws IOException, SQLException, ClassNotFoundException{
		String adname = ois.readUTF();
		String adpassword = ois.readUTF();
		Management m = Management.login(adname, adpassword);
		oos.writeObject(m);
		oos.flush();
	}
	public void merchant_login() throws IOException, SQLException, ClassNotFoundException{
		String mername = ois.readUTF();
		String merpassword = ois.readUTF();
		Merchant m = Merchant.login(mername, merpassword);
		oos.writeObject(m);
		oos.flush();
	}
	public void merchant_register() throws SQLException, ClassNotFoundException, IOException{
		String mername = ois.readUTF();
		String meremail = ois.readUTF();
		String merpassword = ois.readUTF();
		Merchant.register(mername, meremail, merpassword);
		oos.writeObject(Merchant.login(mername, merpassword));
		oos.flush();
		oos.close();
		ois.close();
		s.close();	
	}
	public void person_massage() throws IOException, SQLException, ClassNotFoundException{
		String id = ois.readUTF();
		oos.writeObject(User.view_information(id));
		oos.flush();
	}
	public void loadFile() throws IOException, SQLException,ClassNotFoundException {
        String username = ois.readUTF();
        String[] message = User.view_information2(username);
        String fname = message[8];
        if(fname == null){
	       oos.writeInt(0);
	       oos.flush();
	       return;
        }
        oos.writeInt(1);
        oos.flush();

	    File f = new File("c:\\F4\\" + fname);
	    System.out.println(f.getAbsolutePath());
	    FileInputStream fis = new FileInputStream(f);

	    byte[] buf = new byte[1024];	
	    while ((fis.read(buf)) != -1) {
	    	oos.write(buf);
	    }	
	    s.shutdownOutput();
	}
	
	public void upLoadFile() throws IOException, SQLException,ClassNotFoundException {
		String username = ois.readUTF();
		File f = new File("c:\\F4\\" + username + ".jpg");
		FileOutputStream fos = new FileOutputStream(f);
		byte[] buf = new byte[1024];
		while ((ois.read(buf)) != -1) {	
			fos.write(buf);
		}
		fos.close();
		User.head_picture(username, f.getName());
	}
	public void persongame() throws SQLException, ClassNotFoundException, IOException{
		String uid = ois.readUTF();
		Object[][] data = User.view_game(uid);
		oos.writeObject(data);
		oos.flush();
		oos.close();
		ois.close();
		s.close();
	}
	public void modify() throws IOException, SQLException, ClassNotFoundException{
		String rid = ois.readUTF();
		String realname = ois.readUTF();
		String countrie = ois.readUTF();
		String priovince = ois.readUTF();
		String city = ois.readUTF();
		User.modify(rid, realname, countrie, priovince, city);
		oos.flush();
		oos.close();
		ois.close();
		s.close();
	}
	public void merchantgame() throws IOException, SQLException, ClassNotFoundException{
		String mername = ois.readUTF();
		Object[][] data = Merchant.view_game(mername);
		oos.writeObject(data);
		oos.flush();
		ois.close();
	}
	public void addgame() throws IOException, SQLException, ClassNotFoundException{
		String gname = ois.readUTF();
		String price = ois.readUTF();
		String gurl = ois.readUTF();
		String gtext = ois.readUTF();
		String gtime = ois.readUTF();
		String mername = ois.readUTF();
		Merchant.add_game(gname, price , gurl, gtext, gtime, mername);
		ois.close();
		oos.flush();
	}
	String gimage = null;
	public void gupLoadFile() throws IOException, SQLException,ClassNotFoundException {
		String username = ois.readUTF();
		File f = new File("C:\\Users\\VX50IU9830\\Desktop\\gameimage\\" + username + ".jpg");
		FileOutputStream fos = new FileOutputStream(f);
		byte[] buf = new byte[1024];
		while ((ois.read(buf)) != -1) {	
			fos.write(buf);
		}
		fos.close();
		gimage = f.getName();
	}
	public void view_commentlist() throws SQLException, ClassNotFoundException, IOException{
		String game = ois.readUTF();
		Object[][] data = Merchant.view_commentlist(game);
		oos.writeObject(data);
		oos.flush();
	}
	public void reply() throws SQLException, ClassNotFoundException, IOException{
		String uname = ois.readUTF();
	    String ctext = ois.readUTF();
	    String game = ois.readUTF();
	    Merchant.reply(uname, ctext, game);
	    ois.close();
		oos.flush();
	}
	public void newprice() throws IOException, SQLException, ClassNotFoundException{
		String id = ois.readUTF();
		String price = ois.readUTF();
		Merchant.modify_price(price, id);
		ois.close();
	    oos.flush();
	}
	public void bangame() throws IOException, SQLException, ClassNotFoundException{
		String id = ois.readUTF();
		Merchant.modify_state(id);
		ois.close();
	    oos.flush();
	}
	public void messagegame() throws IOException, SQLException, ClassNotFoundException{
		String[][] data = User.view_game();
		oos.writeObject(data);
		oos.flush();
		oos.close();
		ois.close();
		s.close();
	}
	public void view_merchant() throws IOException, SQLException, ClassNotFoundException{
		Object[][] data = Management.view_merchant();
		oos.writeObject(data);
		oos.flush();
		oos.close();
		ois.close();
		s.close();
	}
	public void usermessage() throws IOException, SQLException, ClassNotFoundException{
		Object[][] data = Management.view_user();
		oos.writeObject(data);
		oos.flush();
		oos.close();
		ois.close();
		s.close();
	}
	public void allcommentlist() throws IOException, SQLException, ClassNotFoundException{
		Object[][] data = Management.view_commentlist();
		oos.writeObject(data);
		oos.flush();
		oos.close();
		ois.close();
		s.close();
	}
	public void announcement() throws SQLException, ClassNotFoundException, IOException{
		Object[][] data = Management.view_announcement();
		oos.writeObject(data);
		oos.flush();
		oos.close();
		ois.close();
		s.close();
	}
	public void newannouncement() throws IOException, SQLException, ClassNotFoundException{
		String atext = ois.readUTF();
		String data = ois.readUTF();
		Management.release(atext, data);
		ois.close();
	}
	public void deleteannouncement() throws IOException, SQLException, ClassNotFoundException{
		String id = ois.readUTF();
		Management.delete_announcement(id);
		ois.close();
	}
	public void deletecommentlist() throws IOException, SQLException, ClassNotFoundException{
		String id = ois.readUTF();
		Management.delete_commentlist(id);
		ois.close();
	}
	public void banuser() throws IOException, SQLException, ClassNotFoundException{
		String id = ois.readUTF();
		String banwhy = ois.readUTF();
		Management.delete_user(id,banwhy);
		ois.close();
	}
	public void banmerchant() throws IOException, SQLException, ClassNotFoundException{
		String id = ois.readUTF();
		Management.delete_merchant(id);
		ois.close();
	}
	public void onegame() throws IOException, SQLException, ClassNotFoundException{
		String gname = ois.readUTF();
		oos.writeObject(User.onegame(gname));
		oos.flush();
	}
	public void person() throws IOException, SQLException, ClassNotFoundException{
		String id = ois.readUTF();
		String username = ois.readUTF();
		String uemail = ois.readUTF();;
		String realname = ois.readUTF();
		String countrie = ois.readUTF();
		String umoney = ois.readUTF();
		String priovince = ois.readUTF();
		String city = ois.readUTF();
		User.personmessage(id, username, uemail, realname, countrie, umoney, priovince, city);
		ois.close();
	}
	public void personmessage() throws IOException, SQLException, ClassNotFoundException{
		String id = ois.readUTF();
		String username = ois.readUTF();
		String uemail = ois.readUTF();
		String realname = ois.readUTF();
		String countrie = ois.readUTF();
		String umoney  = ois.readUTF();
		String priovince = ois.readUTF();
		String city = ois.readUTF();
		//System.out.println(id);
		User.personmessage(id, username, uemail, realname, countrie, umoney, priovince, city);
		ois.close();
	}
	public void buyperson() throws IOException, SQLException, ClassNotFoundException{
		String id = ois.readUTF();
		String uname = ois.readUTF();
		String game = ois.readUTF();
		String time = ois.readUTF();
		User.buyperson(id, uname, game, time);
		ois.close();
	}
	public void collection() throws SQLException, ClassNotFoundException, IOException{
		String id = ois.readUTF();
		String uname = ois.readUTF();
		String game = ois.readUTF();
		User.collection(id, uname, game);
		ois.close();
	}
	public void buy() throws SQLException, ClassNotFoundException, IOException{
		String id = ois.readUTF();
		String money = ois.readUTF();
		User.buy(id, money);
		ois.close();
	}
	public void merchantmoney() throws IOException, SQLException, ClassNotFoundException{
		String mername = ois.readUTF();
		oos.writeObject(User.merchantmoney(mername));
		oos.flush();
		oos.close();
		ois.close();
	}
	public void upmermoney() throws SQLException, ClassNotFoundException, IOException{
		String mername = ois.readUTF();
		String money = ois.readUTF();
		User.upmerprice(mername, money);
		ois.close();
	}
	public void view_collection() throws IOException, SQLException, ClassNotFoundException{
		String id = ois.readUTF();
		oos.writeObject(User.view_collection(id));
		oos.flush();
		oos.close();
		ois.close();
	}
	public void fivestar() throws IOException, SQLException, ClassNotFoundException{
		String id = ois.readUTF();
	    String username = ois.readUTF();
	    String fivestar = ois.readUTF();
	    String game = ois.readUTF();
	    User.fivexing(id, username, fivestar, game);
	    ois.close();
	}
	public void view_fivestar() throws IOException, SQLException, ClassNotFoundException{
		String gamename = ois.readUTF();
		oos.writeObject(User.fivestar(gamename));
		oos.flush();
		oos.close();
		ois.close();
	}
	public void upcollection() throws IOException, SQLException, ClassNotFoundException{
		String game = ois.readUTF();
		String collection = ois.readUTF();
		User.upcollection(game, collection);
		ois.close();
	}
	public void updownload() throws SQLException, ClassNotFoundException, IOException{
		String game = ois.readUTF();
		String download = ois.readUTF();
		User.updownload(game, download);
		ois.close();
	}
}