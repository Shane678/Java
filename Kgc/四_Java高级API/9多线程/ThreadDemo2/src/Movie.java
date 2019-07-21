/**
 * ��Ӱ��
 * @author Shane
 *
 */
public class Movie {
	private String name;
	private String info;
	private boolean flag = true; // ���ñ�־λ���������������������������ѡ�
	public String getName() {
		return name;
	}
	public String getInfo() {
		return info;
	}
	
	// ͬ������
	public synchronized void set(String name, String info){
		if (!flag) { // ����־λΪfalse
			try {
				super.wait(); // �õ�ǰ�̣߳��������̣߳��ȴ���Ҳ�������������߳̽�����ȥ��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.name = name; // ����־λΪtrue����������������Ϣ��
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.info = info;
		flag = false; // ���ñ�־λ�������������ѡ�
		super.notify(); // ���������ߵ��߳�
	}
	
	public synchronized void get(){
		if (flag) { // ����־λΪtrue
			try {
				super.wait(); // �õ�ǰ�̣߳��������̣߳��ȴ���Ҳ������������������֮���������������ѡ�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(this.getName() + "-" + this.getInfo());
		flag = true; // ������������֮�����ñ�־λ����������������
		super.notify(); // ���������ߵ��߳�
	}
}
