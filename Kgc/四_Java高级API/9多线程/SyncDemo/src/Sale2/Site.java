package Sale2;
/**
 * ģ����վ
 * @author Shane
 *
 */
public class Site implements Runnable {
	private int count = 10; // ��¼ʣ��Ʊ��
	private int num = 0; // ��¼��ǰ�����ڼ���Ʊ
	private boolean flag = false; // ��¼Ʊ�Ƿ�����
	public void run() {
		// ѭ��  ��ʣ��Ʊ��Ϊ0ʱ����
		while (!flag) {
			sale(); // ����ͬ������
		}
	}
	
	// ͬ����������Ʊ 
	public synchronized void sale() {
		if (count <= 0) {
			return;
		}
		// 1.�޸����ݣ�ʣ��Ʊ���������ڼ���Ʊ��
		count--;
		num++;
		try {
			Thread.sleep(500); // ͨ���߳�����ģ�������ӳ�
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 2.��ʾ��Ϣ�������û������ڼ���Ʊ
		System.out.println(Thread.currentThread().getName() + "������" + num + "��Ʊ��ʣ��" + count + "��Ʊ��");

	}
	
}
