package Maaş;

public class HourlEmployee extends Employee {
 protected double hour,wage;

protected HourlEmployee(String adi, String soyadi, int tC, double hour, double wage) {
	super(adi, soyadi, tC);
	this.hour = hour;
	this.wage = wage;
}

protected double getHour() {
	return hour;
}

protected void setHour(double hour) {
	this.hour = hour;
}

protected double getWage() {
	return wage;
}

protected void setWage(double wage) {
	this.wage = wage;
}
 protected void  write() {
	 super.write();
	 System.out.println("aylık kazancı :"+AylikKazanc());
 }

protected int AylikKazanc() {
	double k ;
	k = ((hour*wage));
	return (int) k ;
}}