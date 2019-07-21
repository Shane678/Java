package ThreadPoolDemo4;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * ʹ��newScheduledThreadPool()���������̳߳�
 * @author Shane
 *
 */
public class Test {
	public static void main(String[] args) {
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(3);
		System.out.println("*******��ʼִ��*******");
		scheduledThreadPool.scheduleAtFixedRate(new MyRunnable(), 5, 2, TimeUnit.SECONDS);
	}
}

class MyRunnable implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName() + "��ʱ5sִ�У�ÿ2sִ��һ�Σ�");
	}
	
}