package Maaş;

public class Employee {
protected String adi,soyadi ;
protected int tc ;
protected Employee(String adi, String soyadi, int tC) {
	super();
	this.adi = adi;
	this.soyadi = soyadi;
	tc = tC;
}
protected String getAdi() {
	return adi;
}
protected void setAdi(String adi) {
	this.adi = adi;
}
protected String getSoyadi() {
	return soyadi;
}
protected void setSoyadi(String soyadi) {
	this.soyadi = soyadi;
}
protected int getTC() {
	return tc;
}
protected void setTC(int tC) {
	tc = tC;
}
protected void write() {
	System.out.println(getAdi()+" "+getSoyadi()+" "+getTC());
	
	
}
}
