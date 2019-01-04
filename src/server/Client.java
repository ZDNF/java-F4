package server;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import model.Management;
import model.Merchant;
import model.User;

public class Client {

	ObjectOutputStream oos;
	ObjectInputStream ois;
	final int USER_LOGIN = 1001;
	final int USER_REGISTER = 1002;	
	final int MANAGEMENT_LOGIN = 1003;
	final int MERCHANT_LOGIN = 1004;
	final int MERCHANT_REGISTER = 1005;
	final int PERSON_MASSAGE = 1006;
	final int UPLOAD = 1007;
	final int LOADFILE = 1008;
	final int PERSONGAME = 1009;
	final int MODIFY = 1010;
	final int MERCHANTGAME = 1011;
	final int ADDGAME = 1012;
	final int GUPLOAD = 1013;
	final int VIEWCOMMENTLIST = 1014;
	final int REPLY = 1015;
	final int NEWPRICE = 1016;
	final int BANGAME = 1017;
	final int MESSAGEGAME = 1018;
	final int VIEWMERCHANT = 1019;
	final int USERMASSAGE = 1020;
	final int ALLCOMMENTLIST = 1021;
	final int ANNOUNCEMENT = 1022;
	final int NEWANNOUNCEMENT = 1023;
	final int DELETEANNOUNCEMENT = 1024;
	final int DELETECOMMENTLIST = 1025;
	final int BANUSER = 1026;
	final int BANMERCHANT = 1027;
	final int ONEGAME = 1028;
	final int PERSONMESSAGE = 1029;
	final int BUYPERSON = 1030;
	final int COLLECTION = 1031;
	final int BUY = 1032;
	final int MERCHANTMONEY = 1033;
	final int UPMERMONEY = 1034;
	final int VIEWCOLLECTION = 1035;
	final int FIVESTAR = 1036;
	final int VIEW_FIVESTAR = 1037;
	final int PERSON = 1038;
	final int UPCOLLECTION = 1039;
	final int UPDOWNLOAD = 1040;
	Socket s;
	public Client() throws UnknownHostException, IOException{
		s = new Socket("10.51.161.139",5507);
		oos = new ObjectOutputStream(s.getOutputStream());
		ois = new ObjectInputStream(s.getInputStream());
	}
	
	public User user_login(String uname,String upw) throws IOException, ClassNotFoundException{
		oos.writeInt(USER_LOGIN);
		oos.flush();
		oos.writeUTF(uname);
		oos.flush();
		oos.writeUTF(upw);
		oos.flush();
		return (User) ois.readObject();
	}
	public User user_register(String username,String userpassword,String useremail) throws IOException, ClassNotFoundException{
		oos.writeInt(USER_REGISTER);
		oos.flush();
		oos.writeUTF(username);
		oos.flush();
		oos.writeUTF(userpassword);
		oos.flush();
		oos.writeUTF(useremail);
		oos.flush();
		return (User) ois.readObject();
	}
	public Management management_login(String adname,String adpassword) throws IOException, ClassNotFoundException{
		oos.writeInt(MANAGEMENT_LOGIN);
		oos.flush();
		oos.writeUTF(adname);
		oos.flush();
		oos.writeUTF(adpassword);
		oos.flush();
		return (Management) ois.readObject();
	}
	public Merchant merchant_login(String mername,String merpassword) throws IOException, ClassNotFoundException{
		oos.writeInt(MERCHANT_LOGIN);
		oos.flush();
		oos.writeUTF(mername);
		oos.flush();
		oos.writeUTF(merpassword);
		oos.flush();
		return  (Merchant) ois.readObject();
	}
	public Merchant merchant_register(String mername,String meremail,String merpassword) throws IOException, ClassNotFoundException{
		oos.writeInt(MERCHANT_REGISTER);
		oos.flush();
		oos.writeUTF(mername);
		oos.flush();
		oos.writeUTF(merpassword);
		oos.flush();
		oos.writeUTF(meremail);
		oos.flush();
		return (Merchant) ois.readObject();
	}
	public String[] person_massage(String id) throws IOException, ClassNotFoundException{
		oos.writeInt(PERSON_MASSAGE);
		oos.flush();
		oos.writeUTF(id);
		oos.flush();
		return (String[]) ois.readObject();
	}
	public void loadFile(String username, File f) throws IOException {
		oos.writeInt(LOADFILE);
		oos.flush();
		oos.writeUTF(username);
		oos.flush();
		int n = ois.readInt();
		if (n == 1) {
			FileOutputStream fos = new FileOutputStream(f);
			
			byte[] buf = new byte[1024];
			int len = 0;
			while ((len = ois.read(buf)) != -1) {
				fos.write(buf, 0, len);
			}

			fos.close();
		}
	}
	public void uploadFile(String username, File f) throws IOException {
		oos.writeInt(UPLOAD);
		oos.flush();
		oos.writeUTF(username);
		oos.flush();
		FileInputStream fis = new FileInputStream(f);
		byte[] buf = new byte[1024];
		int len = 0;
		while ((len = fis.read(buf)) != -1) {
			oos.write(buf, 0, len);
		}
		s.shutdownOutput();
	}
	public Object persongame(String uid) throws IOException, ClassNotFoundException{
		oos.writeInt(PERSONGAME);
		oos.flush();
		oos.writeUTF(uid);
		oos.flush();
		return  ois.readObject();
	}
	public void modify(String rid, String realname, String countrie , String priovince ,String city) throws IOException{
		oos.writeInt(MODIFY);
		oos.flush();
		oos.writeUTF(rid);
		oos.flush();
		oos.writeUTF(realname);
		oos.flush();
		oos.writeUTF(countrie);
		oos.flush();
		oos.writeUTF(priovince);
		oos.flush();
		oos.writeUTF(city);
		oos.flush();
	}
	public Object merchantgame(String mername) throws IOException, ClassNotFoundException{
		oos.writeInt(MERCHANTGAME);
		oos.flush();
		oos.writeUTF(mername);
		oos.flush();
		return (Object) ois.readObject();
	}
	public void addgame(String gname , String  price , String gurl , String gtext ,  String gtime , String mername) throws IOException{
		oos.writeInt(ADDGAME);
		oos.flush();
		oos.writeUTF(gname);
		oos.flush();
		oos.writeUTF(price);
		oos.flush();
		oos.writeUTF(gurl);
		oos.flush();
		oos.writeUTF(gtext);
		oos.flush();
		oos.writeUTF(gtime);
		oos.flush();
		oos.writeUTF(mername);
		oos.flush();
	}
	public void guploadFile(String username, File f) throws IOException {
		oos.writeInt(GUPLOAD);
		oos.flush();
		oos.writeUTF(username);
		oos.flush();
		FileInputStream fis = new FileInputStream(f);
		byte[] buf = new byte[1024];
		int len = 0;
		while ((len = fis.read(buf)) != -1) {
			oos.write(buf, 0, len);
		}
		s.shutdownOutput();
	}
	public Object view_commentlist(String game) throws IOException, ClassNotFoundException{
		oos.writeInt(VIEWCOMMENTLIST);
		oos.flush();
		oos.writeUTF(game);
		oos.flush();
		return (Object) ois.readObject();
	}
	public void reply(String uname , String ctext , String game) throws IOException, ClassNotFoundException{
		oos.writeInt(REPLY);
		oos.flush();
		oos.writeUTF(uname);
		oos.flush();
		oos.writeUTF(ctext);
		oos.flush();
		oos.writeUTF(game);
		oos.flush();
	}
	public void newprice(String id,String price) throws IOException{
		oos.writeInt(NEWPRICE);
		oos.flush();
		oos.writeUTF(id);
		oos.flush();
		oos.writeUTF(price);
		oos.flush();
	}
	public void bangame(String id) throws IOException{
		oos.writeInt(BANGAME);
		oos.flush();
		oos.writeUTF(id);
		oos.flush();	
	}
	public String[][] messagegame() throws IOException, ClassNotFoundException{
		oos.writeInt(MESSAGEGAME);
		oos.flush();
		return (String[][]) ois.readObject();
	}
	public Object[][] view_merchant() throws IOException, ClassNotFoundException{
		oos.writeInt(VIEWMERCHANT);
		oos.flush();
		return (Object[][]) ois.readObject();
	}
	public Object[][] usermessage() throws IOException, ClassNotFoundException{
		oos.writeInt(USERMASSAGE);
		oos.flush();
		return (Object[][]) ois.readObject();
	}
	public Object[][] allcommentlist() throws IOException, ClassNotFoundException{
		oos.writeInt(ALLCOMMENTLIST);
		oos.flush();
		return (Object[][]) ois.readObject();
	}
	public Object[][] announcement() throws IOException, ClassNotFoundException{
		oos.writeInt(ANNOUNCEMENT);
		oos.flush();
		return (Object[][]) ois.readObject();
	}
	public void newannouncement(String text, String data) throws IOException{
		oos.writeInt(NEWANNOUNCEMENT);
		oos.flush();
		oos.writeUTF(text);
		oos.flush();
		oos.writeUTF(data);
		oos.flush();
	}
	public void deleteannouncement(String id) throws IOException{
		oos.writeInt(DELETEANNOUNCEMENT);
		oos.flush();
		oos.writeUTF(id);
		oos.flush();
	}
	public void deletecommentlist(String id) throws IOException{
		oos.writeInt(DELETECOMMENTLIST);
		oos.flush();
		oos.writeUTF(id);
		oos.flush();
	}
	public void banuser(String id, String banwhy) throws IOException{
		oos.writeInt(BANUSER);
		oos.flush();
		oos.writeUTF(id);
		oos.flush();
		oos.writeUTF(banwhy);
		oos.flush();
	}
	public void banmerchant(String id) throws IOException{
		oos.writeInt(BANMERCHANT);
		oos.flush();
		oos.writeUTF(id);
		oos.flush();
	}
	public String[] onegame(String gname) throws IOException, ClassNotFoundException{
		oos.writeInt(ONEGAME);
		oos.flush();
		oos.writeUTF(gname);
		oos.flush();
		return (String[]) ois.readObject();
	}
	public void personmessage(String id, String username, String uemail, String realname, String countrie , String umoney, String priovince , String city) throws IOException{
		oos.writeInt(PERSONMESSAGE);
		oos.flush();
		oos.writeUTF(id);
		oos.flush();
		oos.writeUTF(username);
		oos.flush();
		oos.writeUTF(uemail);
		oos.flush();
		oos.writeUTF(realname);
		oos.flush();
		oos.writeUTF(countrie);
		oos.flush();
		oos.writeUTF(umoney);
		System.out.println("clinet");
		oos.flush();
		oos.writeUTF(priovince);
		oos.flush();
	}
	public void person(String id, String username, String uemail, String realname, String countrie , String umoney, String priovince , String city) throws IOException{
		oos.writeInt(PERSON);
		oos.flush();
		oos.writeUTF(id);
		oos.flush();
		oos.writeUTF(username);
		oos.flush();
		oos.writeUTF(uemail);
		oos.flush();
		oos.writeUTF(realname);
		oos.flush();
		oos.writeUTF(countrie);
		oos.flush();
		oos.writeUTF(umoney);
		oos.flush();
		oos.writeUTF(priovince);
		oos.flush();
		oos.writeUTF(city);
		oos.flush();
	}
	public void buyperson(String id,String uname, String game, String time) throws IOException{
		oos.writeInt(BUYPERSON);
		oos.flush();
		oos.writeUTF(id);
		oos.flush();
		oos.writeUTF(uname);
		oos.flush();
		oos.writeUTF(game);
		oos.flush();
		oos.writeUTF(time);
		oos.flush();
	}
	public void collection(String id,String uname,String game) throws IOException{
		oos.writeInt(COLLECTION);
		oos.flush();
		oos.writeUTF(id);
		oos.flush();
		oos.writeUTF(uname);
		oos.flush();
		oos.writeUTF(game);
		oos.flush();
	}
	public void buy(String id,String money) throws IOException{
		oos.writeInt(BUY);
		oos.flush();
		oos.writeUTF(id);
		oos.flush();
		oos.writeUTF(money);
		oos.flush();
	}
	public String[] merchantmoney(String mername) throws IOException, ClassNotFoundException{
		oos.writeInt(MERCHANTMONEY);
		oos.flush();
		oos.writeUTF(mername);
		oos.flush();
		return (String[]) ois.readObject();
	}
	public void upmermoney(String mername,String money) throws IOException{
		oos.writeInt(UPMERMONEY);
		oos.flush();
		oos.writeUTF(mername);
		oos.flush();
		oos.writeUTF(money);
		oos.flush();
	}
	public String[][] view_collection(String id) throws IOException, ClassNotFoundException{
		oos.writeInt(VIEWCOLLECTION);
		oos.flush();
		oos.writeUTF(id);
		oos.flush();
		return (String[][]) ois.readObject();
	}
	public void fivestar(String id, String username, String fivestar, String game) throws IOException{
		oos.writeInt(FIVESTAR);
		oos.flush();
		oos.writeUTF(id);
		oos.flush();
		oos.writeUTF(username);
		oos.flush();
		oos.writeUTF(fivestar);
		oos.flush();
		oos.writeUTF(game);
		oos.flush();
	}
	public String[][] view_fivestar(String gamename) throws IOException, ClassNotFoundException{
		oos.writeInt(VIEW_FIVESTAR);
		oos.flush();
		oos.writeUTF(gamename);
		oos.flush();
		return (String[][]) ois.readObject();
	}
	public void upcollection(String game,String collection) throws IOException{
		oos.writeInt(UPCOLLECTION);
		oos.flush();
		oos.writeUTF(game);
		oos.flush();
		oos.writeUTF(collection);
		oos.flush();
	}
	public void updownload(String game,String download) throws IOException{
		oos.writeInt(UPDOWNLOAD);
		oos.flush();
		oos.writeUTF(game);
		oos.flush();
		oos.writeUTF(download);
		oos.flush();
	}
}
