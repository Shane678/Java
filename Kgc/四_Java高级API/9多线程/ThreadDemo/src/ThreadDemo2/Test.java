package ThreadDemo2;

public class Test {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		/*t1.start(); // �����߳�
		t2.start();*/
		t1.run();
		t2.run(); // 1.ֻ�����߳���һ��ִ��·��  2.���ε���������run()����
	}
}
