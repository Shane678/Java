package cn.kgc.enumdemos;

// �����û���������֣�1-7�������ض�Ӧ���ڿ�����ʲô���顣
public class Test {
	public void doWhat(int day) {
		if (day < 1 || day > 7) {
			System.out.println("������1-7֮���������");
			return;
		} else {
			switch (day) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("�����գ�Ҫ�ú��ô��룡");
				break;
			case 6:
				System.out.println("������������ȥ������Ӱ��");
				break;
			case 7:
				System.out.println("������������˯��������");
				break;
			}
		}
	}

	public void doWhat2(Week day) {
		switch (day) {
		case MON:
		case TUE:
		case WED:
		case THU:
		case FRI:
			System.out.println("�����գ�Ҫ�ú��ô��룡");
			break;
		case SAT:
			System.out.println("������������ȥ������Ӱ��");
			break;
		case SUN:
			System.out.println("������������˯��������");
			break;
		}
	}

	public static void main(String[] args) {
		Test t = new Test();
//		t.doWhat(7);
		t.doWhat2(Week.SUN);
	}
}
