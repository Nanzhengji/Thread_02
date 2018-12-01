package threadDemo1;

public class Info {
	private String key="tom";
	private String value="大笨蛋";
	private boolean flag = false;//true放,false取
	public synchronized void set(String key,String value) {
		if(!flag) {
			try {
				super.wait();//flag为false时,不能放
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.setKey(key);//为true时放
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.setValue(value);
		flag=false;
		super.notify();//唤醒线程,可以取
	}
	
	public synchronized void get() {
		if(flag) {
			try {
				super.wait();//flag为true时不能取
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(this.getKey()+"  "+this.getValue());//为false时可以取
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		flag=true;//唤醒线程可以放
		super.notify();
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	
	
}
