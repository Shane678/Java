package ThreadDemo2;

/**
 * �̳�Thread��ķ�ʽ�����߳�
 * 
 * @author Shane
 * 
 */
public class MyThread extends Thread {
	// ��дrun()����
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}
}
