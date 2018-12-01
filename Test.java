package threadDemo1;

public class Test {

	public static void main(String[] args) {
		Info i=new Info();
		Product p=new Product(i);
		Customer c=new Customer(i);
		Thread p1 = new Thread(p);
		Thread c1 = new Thread(c);
		p1.start();
		c1.start();
	}
}
