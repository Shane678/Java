package DeadLock;
/**
 * ģ������
 * @author Shane
 *
 */
public class Test {
	public static void main(String[] args) {
		Object bobby = new Object();
		Object duck = new Object();
		// ���������̹߳�ͬ����ͬһ����Դ�����ڵȴ��Է�����ɣ���ɳ����ͣ�ͣ���������������
		Thread tangtang = new Thread(new Tangtang(bobby, duck));
		Thread doudou = new Thread(new Doudou(bobby, duck));
		tangtang.start();
		doudou.start();
	}
}

class Tangtang implements Runnable{
	Object bobby; // �ű�
	Object duck; // ���Ѽ
	public Tangtang(Object bobby, Object duck) {
		super();
		this.bobby = bobby;
		this.duck = duck;
	}
	public void run() {
		synchronized(bobby) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (duck) {
				
			}
			System.out.println("���ǰѰűȸ������棡");
		}
	}
}

class Doudou implements Runnable{
	Object bobby; // �ű�
	Object duck; // ���Ѽ
	public Doudou(Object bobby, Object duck) {
		super();
		this.bobby = bobby;
		this.duck = duck;
	}
	public void run() {
		synchronized(duck) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (bobby) {
				
			}
			System.out.println("���������Ѽ�������棡");
		}
	}
	
}
