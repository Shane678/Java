package Demo5;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * �����Զ����̳߳�
 * @author Shane
 *
 */
public class Test {
	public static void main(String[] args) {
		// ����һ���Զ����̳߳�
		ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 7, 300, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(4));
		for (int i = 1; i < 12; i++) {
			executor.execute(new MyRunnable(i));
			System.out.println("�̳߳����߳�����" + executor.getPoolSize() + "�������еȴ�ִ�е���������" + executor.getQueue().size() + "���Ѿ�ִ�������������" + executor.getCompletedTaskCount());
		}
		executor.shutdown();
	}
}

class MyRunnable implements Runnable {
	int num; // �ڼ�������
	
	
	public MyRunnable(int num) {
		super();
		this.num = num;
	}

	public void run() {
		System.out.println("����ִ������" + num); 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("����" + num + "ִ����ϣ�");
	}
	
}
