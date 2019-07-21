package ThreadPoolDemo3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ʹ��newFixedThreadPool()���������̳߳�
 * @author Shane
 *
 */
public class Test {
	public static void main(String[] args) {
		// newFixedThreadPool(int nThreads)����ָ���̳߳����������ɵ��߳���
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		
		// ���̳߳���ִ��10������
		for (int i = 0; i < 10; i++) {
			fixedThreadPool.execute(new MyRunnable(i));
			// ����ͨ����������ʱ��������������߳�ִ�У�û�����ߺ�ִ��ʱ���̣����и�����̲߳������������һ���߳�ִ����һ���������󻹿���ִ����һ�����������Ϳ��Բ����ٴ����µ��߳��ˡ�
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