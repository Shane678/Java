package ThreadDemo7;
/**
 * ����join()
 * @author Shane
 *
 */
public class ThreadJoinDemo {
	public static void main(String[] args) {
		System.out.println("*******�߳�ǿ��ִ��*******");
		// 1.�����̶߳���
		Thread temp = new Thread(new MyRunnable(), "temp");
		temp.start();
		for (int i = 0; i < 20; i++) {
			// �����߳�ִ�е�i == 5ʱ����ͣ���̣߳������߳�tempִ�����֮�����߳���ִ�С�
			if (i == 5) {
				try {
					temp.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "���У�" + i);
		}
	}
}
