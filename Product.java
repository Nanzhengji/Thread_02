package threadDemo1;

public class Product implements Runnable {
	private Info info=null;
	public Product(Info info) {
		this.info = info;
	}
	@Override
	public void run() {
		boolean flag = false;
		for(int i=0;i<50;i++) {
			if(flag) {
				this.info.set("lily", "美如花");
				flag=false;
			}else {
				info.set("tom","大笨蛋");
				flag=true;
			}
		}
	}
}
