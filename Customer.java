package threadDemo1;

public class Customer implements Runnable {
	private Info info=null;
	public Customer(Info info) {
		this.info = info;
	}

	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.info.get();//取
		}

	}

}
