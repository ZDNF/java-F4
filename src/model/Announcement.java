package model;

public class Announcement {
	private String aid;
	private String aimage;
	private String atext;
	private String time;
	public Announcement(String aid, String aimage, String atext, String time) {
		super();
		this.aid = aid;
		this.aimage = aimage;
		this.atext = atext;
		this.time = time;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Announcement(String aid, String aimage, String atext) {
		super();
		this.aid = aid;
		this.aimage = aimage;
		this.atext = atext;
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getAimage() {
		return aimage;
	}
	public void setAimage(String aimage) {
		this.aimage = aimage;
	}
	public String getAtext() {
		return atext;
	}
	public void setAtext(String atext) {
		this.atext = atext;
	}
}
