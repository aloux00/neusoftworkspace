package orz.doublexi.mvcbyxml.projo;

public class ShuQian {
private int fenlei;
private String fenleistr;

private String mingcheng;
private String webaddress;
public int getFenlei() {
	return fenlei;
}
public void setFenlei(int fenlei) {
	this.fenlei = fenlei;
	switch(fenlei) {
	case 1:fenleistr="游戏";break;
	case 2:fenleistr="动漫";break;
	case 3:fenleistr="科技";break;
	case 4:fenleistr="学习";break;
	case 5:fenleistr="默认";break;
	}
}
public String getMingcheng() {
	return mingcheng;
}
public void setMingcheng(String mingcheng) {
	this.mingcheng = mingcheng;
}
public String getWebaddress() {
	return webaddress;
}
public void setWebaddress(String webaddress) {
	this.webaddress = webaddress;
}
public String getFenleistr() {
	return fenleistr;
}
}
