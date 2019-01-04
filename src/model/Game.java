package model;

public class Game {
	private String gid;
	private String gname;
	private String gprice;
	private String gimage;
	private String gcommenlist;
	private int buynumber;
	private String gurl;
	private String gcollection;
	private String gtext;
	private int gstate;
	private String gtime;
	private String mername;
	public Game(String gid, String gname, String gprice, String gimage,
			String gcommenlist, int buynumber, String gurl, String gcollection,
			String gtext, int gstate, String gtime, String mername) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gprice = gprice;
		this.gimage = gimage;
		this.gcommenlist = gcommenlist;
		this.buynumber = buynumber;
		this.gurl = gurl;
		this.gcollection = gcollection;
		this.gtext = gtext;
		this.gstate = gstate;
		this.gtime = gtime;
		this.mername = mername;
	}
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGprice() {
		return gprice;
	}
	public void setGprice(String gprice) {
		this.gprice = gprice;
	}
	public String getGimage() {
		return gimage;
	}
	public void setGimage(String gimage) {
		this.gimage = gimage;
	}
	public String getGcommenlist() {
		return gcommenlist;
	}
	public void setGcommenlist(String gcommenlist) {
		this.gcommenlist = gcommenlist;
	}
	public int getBuynumber() {
		return buynumber;
	}
	public void setBuynumber(int buynumber) {
		this.buynumber = buynumber;
	}
	public String getGurl() {
		return gurl;
	}
	public void setGurl(String gurl) {
		this.gurl = gurl;
	}
	public String getGcollection() {
		return gcollection;
	}
	public void setGcollection(String gcollection) {
		this.gcollection = gcollection;
	}
	public String getGtext() {
		return gtext;
	}
	public void setGtext(String gtext) {
		this.gtext = gtext;
	}
	public int getGstate() {
		return gstate;
	}
	public void setGstate(int gstate) {
		this.gstate = gstate;
	}
	public String getGtime() {
		return gtime;
	}
	public void setGtime(String gtime) {
		this.gtime = gtime;
	}
	public String getMername() {
		return mername;
	}
	public void setMername(String mername) {
		this.mername = mername;
	}
}
