package ThreadDemo1;
/**
 * ��ȡ���������߳�����
 * @author Shane
 *
 */
public class Test {
	public static void main(String[] args) {
		// 1.��ȡ���̶߳���
		Thread t = Thread.currentThread();
		System.out.println("��ǰ���߳��ǣ�" + t.getName());
		t.setName("MyJavaThread");
		System.out.println("�������ƺ󣬵�ǰ���߳��ǣ�" + t.getName());
	}
}
