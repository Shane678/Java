package ThreadDemo8;

public class MyRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "���У�" + i);
			// ��i == 3ʱ���߳����ã���ǰ�߳̽�CPU��Դ�ó�
			if (i == 3) {
				Thread.yield(); // yield()�Ǿ�̬��������˿���ֱ�������������á�
				System.out.print("�߳����ã�");
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
