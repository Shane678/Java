package cn.kgc.strdemo;

import java.util.Scanner;

public class Register {
	public static void main(String[] args) {
		// �ַ������÷�����length() ע����������length���Ե�����
		// equals()���Ƚ������ַ��������Ƿ���ͬ
/*		Scanner input = new Scanner(System.in);
		System.out.print("�������û�����");
		String userName = input.next();
		System.out.print("���������룺");
		String pwd = input.next();
		
		if(pwd.length() < 6){
			System.out.println("��¼���벻��6λ�����������룡");
		}else{
			if(userName.equals("Qi") && pwd.equals("123456")){
				System.out.println("��¼�ɹ���");
			}else{
				System.out.println("�û������������");
			}
		}
*/		
		
		// ���������⣺��1��equals()��== ��2�������˼����ַ�������
		// String��д��equals()������˱Ƚ������ַ��������ݣ���String��==��Ȼ�ǱȽ������ַ����Ƿ�Ϊͬһ����
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1 == s2); // true
		// ������1������
		
		String s3 = "hello";
		String s4 = new String("hello");
		System.out.println(s3.equals(s4)); // true
		System.out.println(s3 == s4); // false
		// ������2������
		
		String s9 = "hello";
		String s10 = new String("Hello");
		System.out.println(s9.equals(s10)); // false
		System.out.println(s9 == s10); // false
		// ������3������
		
		String s5 = new String("hello");
		String s6 = new String("hello");
		System.out.println(s5.equals(s6)); // true
		System.out.println(s5 == s6); // false
		// ������3������
		
		String s7 = new String("hello");
		String s8 = new String("HELLO");
		System.out.println(s7.equals(s8)); // false
		System.out.println(s7 == s8); // false
		// ������4������
		
	}
}
