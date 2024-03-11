package day_3;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customer c1=new Customer();
c1.setCid(111);
c1.setCname("sam");
c1.setAddress("pondy");
System.out.println("Customer id:"+c1.grtCid()+ "Customer name:"+c1.getCname()+ "Customer Address:"+c1.getAddress());
Customer c2=new Customer();
c2.setCid(66);
c2.setCname("jhon");
c2.setAddress("chennai");
System.out.println(c2);
Customer c3=new Customer();
System.out.println(c3);
Customer c4=new Customer(11,"mick","goa");
System.out.println(c4);
	}

}
