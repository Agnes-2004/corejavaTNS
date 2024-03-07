package day_2;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Coustomer c1=new Coustomer();
c1.setCid(111);
c1.setCname("sam");
c1.setAddress("pondy");
System.out.println("Customer id:"+c1.grtCid()+ "Customer name:"+c1.getCname()+ "Customer Address:"+c1.getAddress());
Coustomer c2=new Coustomer();
c2.setCid(66);
c2.setCname("jhon");
c2.setAddress("chennai");
System.out.println(c2);
	}

}
