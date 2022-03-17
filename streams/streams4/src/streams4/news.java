package streams4;

public class news {
int newsid;
String postedbyuser;
String commonbyuser;
String comment;
public news(int newsid,String postedbyuser,String commonbyuser,String comment) {
	this.newsid=newsid;
	this.commonbyuser=commonbyuser;
	this.postedbyuser=postedbyuser;
	this.comment=comment;
}
public int getnewsid() {
	return newsid;
}
public String getpostedbyuser() {
	return postedbyuser;
}
public String getcomment() {
	return comment;
}
public String toString() {
	return "news[newsid="+newsid+",postedbyuser="+postedbyuser+",commentbyuser="+commonbyuser+",comment="+comment+"]";
}
}
