package cn.kgc.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		Student s1 = new Student(1, "����", "��");
		Student s2 = new Student(2, "Jack", "��");
		Student s3 = new Student(3, "С��", "Ů");
		Student s4 = new Student(8, "С��", "Ů");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		// ��������
		Collections.sort(list);
		for(Student stu : list){
			System.out.println(stu.getNumber() + "-" + stu.getName() + "-" + stu.getSex());
		}
		System.out.println("*******");
		
	}
}
