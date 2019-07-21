package ThreadPoolDemo1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ʹ��newCachedThreadPool()���������̳߳�
 * @author Shane
 *
 */
public class Test {
	public static void main(String[] args) {
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		
		// ���̳߳���ִ��10��������������10�����񶼱�1���߳�ִ���ˣ�
		for (int i = 0; i < 10; i++) {
			cachedThreadPool.execute(new MyRunnable(i));
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyRunnable implements Runnable {
	int num;
	public MyRunnable(int num) {
		super();
		this.num = num;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName() + ":" + num);
	}
	
}