package cn.kgc.randomdemo;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		// ���� ÿ�ζ���һ��
		// ��ͬ�����ӹ����Random�������ɵ�������ǲ�ͬ�ģ�ʹ�ò�ͬ�����ӿ���ͨ��Random()��Random(ʱ��ĺ���)�����ɣ�
		Random random = new Random();
		Random random2 = new Random();
		System.out.println(random.nextInt(10));
		System.out.println(random2.nextInt(10));
		// ��ͬ�����ӹ����Random�������ɵ��������һ����
		Random random3 = new Random(27);
		Random random4 = new Random(27);
		System.out.println(random3.nextInt(10));
		System.out.println(random4.nextInt(10));
		/*for(int i = 0; i < 10; i++){
			//��intΪ��
			// �����������������һ��int���͵�������-2^31~2^31-1��
			System.out.println(random.nextInt());
			// ���������������һ����Χ��[0,������)֮�������
			System.out.println(random.nextInt(10));
		}*/
	}
}
