package day_3;

public class Customer {
private int cid;
private String cname;
private String address;
public Customer() {
	this.cid=01;
	this.cname="Preethi";
	this.address="California";
}
public Customer(int cid ,String cname,String address) {
	this.cid=cid;
	this.cname=cname;
	this.address=address;
}
public void setCid(int cid)
{
	this.cid=cid;
}
public int grtCid()
{
	return cid;
}
public String getCname()
{
	return cname;
}
public void setCname(String cname) {
	this.cname=cname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address=address;
}
@Override
public String toString() {
	return "Customer [cid="+cid+",cname="+cname+",address="+address+"]";
}
}
