package ThreadDemo3;

public class Test {
	public static void main(String[] args) {
		// 1.�����̶߳���
		Runnable myRunnable = new MyRunnable();
		Thread t = new Thread(myRunnable, "MyThread");
		// 2.�����߳�
		t.start(); 
	}
}
