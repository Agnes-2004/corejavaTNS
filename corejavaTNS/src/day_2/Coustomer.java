package day_2;

public class Coustomer {
private int cid;
private String cname;
private String address;
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
