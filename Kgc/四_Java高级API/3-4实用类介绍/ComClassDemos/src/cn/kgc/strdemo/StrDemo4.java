package cn.kgc.strdemo;

import java.util.Scanner;

// �ַ�����ȡ��indexOf()  lastIndexOf()  substring(begin)  substring(begin, end) 
public class StrDemo4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("---��ӭ������ҵ�ύϵͳ---");
		System.out.print("������Java�ļ�����");
		String name = input.next();
		System.out.print("������������䣺");
		String email = input.next();
		
		// ����ļ�����������.javaΪ��׺
		boolean fileFlag = false;
		int index = name.indexOf(".");
		if(index != -1 && index != 0 && name.substring(index).equals(".java")){
			// �ļ�����ȷ
			fileFlag = true;
		}else{
			System.out.println("�ļ�����Ч��");
		}
		
		// ������䣺@  .
		boolean emailFlag = false;
		int index1 = email.indexOf('@');
		int index2 = email.indexOf('.');
		if(index1 != -1 && index2 != -1 && index1 < index2){
			// �����ʽ��ȷ
			emailFlag = true;
		}else{
			System.out.println("��������Ч��");
		}
		
		if(fileFlag && emailFlag){
			System.out.println("��ҵ�ύ�ɹ���");
		}else{
			System.out.println("��ҵ�ύʧ�ܣ�");
		}
	}
}
