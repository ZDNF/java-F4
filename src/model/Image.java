package model;

import java.sql.SQLException;

import server.DataConnect;

public class Image {
	int id;
	String game;
	String url;
	public Image(int id, String game, String url) {
		super();
		this.id = id;
		this.game = game;
		this.url = url;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public static boolean images(String id , String game , String url) throws SQLException, ClassNotFoundException{
		String sql = "update images set game = '"+game+"' , url = '"+url+"' where id = '"+id+"'";
		DataConnect.getStatement().executeUpdate(sql);
		return true;
	}
}
