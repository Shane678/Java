package cn.kgc.strdemo;

import java.util.Scanner;

public class Register {
	public static void main(String[] args) {
		// �ַ������÷�����length() ע����������length���Ե�����
		Scanner input = new Scanner(System.in);
		System.out.print("�������û�����");
		String userName = input.next();
		System.out.print("���������룺");
		String pwd = input.next();
		
		if(pwd.length() < 6){
			System.out.println("ע�����벻��6λ�����������룡");
		}else{
			System.out.println("ע��ɹ���");
		}
		
	}
}
