package cn.jbit.stu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Map<String, Student> students = new HashMap<String, Student>();
		Student s1 = new Student("����", "��");
		Student s2 = new Student("����", "��");
		Student s3 = new Student("����", "Ů");
		// ��-ֵ�ԣ�ѧԱ��Ӣ������-ѧԱ
		// Map��put������ֵ�������κ�Object���͡�
		students.put("Jack", s1);
		students.put("Tom", s2);
		students.put("Kitty", s3);
		
		// �����ض�key��ȡ��Ӧvalue
		System.out.print("��������ҪѰ��ѧԱ��Ӣ�����֣�");
		Scanner input = new Scanner(System.in);
		String key = input.next();
		if(students.containsKey(key)){
			Student stu = students.get(key);
			System.out.print("��Ҫ�ҵ�ѧԱ�ǣ�" + stu.getName() + "-" + stu.getSex());
		}else{
			System.out.println("�Բ���û����ҪѰ�ҵ�ѧԱ��");
		}
		
	}
}
