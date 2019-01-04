package model;

public class Commentlist {
	private String uname;
	private String cid;
	private String ctext;
	public Commentlist(String uname, String cid, String ctext) {
		super();
		this.uname = uname;
		this.cid = cid;
		this.ctext = ctext;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCtext() {
		return ctext;
	}
	public void setCtext(String ctext) {
		this.ctext = ctext;
	}
}
