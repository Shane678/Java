package ThreadDemo4;

public class MyRunnable implements Runnable {
	public void run(){
		System.out.println("�߳�t�������У�");
		try {
			Thread.sleep(500);
			System.out.println("�߳�t���ߣ���������״̬��");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�߳�t���жϣ�");
		}
	}
	
	public static void main(String[] args){
		Thread t = new Thread(new MyRunnable(), "t");
		System.out.println("�߳�t�����½�״̬��");
		t.start();
		System.out.println("�߳�t���ھ���״̬��");
	}
}
