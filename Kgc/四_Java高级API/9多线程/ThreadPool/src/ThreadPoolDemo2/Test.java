package ThreadPoolDemo2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Shane
 *
 */
public class Test {
	public static void main(String[] args) {
		// newSingleThreadExecutor()��������һ�����̳߳�
		ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
		
		// ���̳߳���ִ��10������
		for (int i = 0; i < 10; i++) {
			singleThreadPool.execute(new MyRunnable(i));
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