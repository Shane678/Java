package cn.kgc.common;

import java.util.Scanner;

public class MathDemo {
	public static void main(String[] args) {
//		System.out.println((int)(Math.random() * 10)); // Math.random()�������[0,1)֮��ĸ�����
		
		// ��Ա����齱����Ա�Ű�λ�����ڼ����������ɵ�����ʱ�н�
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����λ���Ļ�Ա�ţ�");
		int num;
		if(input.hasNextInt()){
			num = input.nextInt();			
		}else{
			System.out.println("������������");
			return;
		}
		if(num < 1000 || num > 9999){
			System.out.println("������4λ������");
			return;
		}
		int baiwei = num / 100 % 10;
		int random = (int)(Math.random() * 10);
		System.out.println(random);
		if(baiwei == random){
			System.out.println("��ϲ�����н��ˣ�");
		}else{
			System.out.println("�ܱ�Ǹ����δ�н���");
		}
	}
}
