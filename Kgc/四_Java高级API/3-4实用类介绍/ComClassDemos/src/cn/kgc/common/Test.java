package cn.kgc.common;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		int i = 9;
		System.out.println(i);
		
		List list = new ArrayList();
		list.add(i); // ������Լ�����Ϊ�����������͵ı���i��why???   ����Ϊjdk5�Ժ������Զ�װ����䣬�����i�Զ�װ������Integer������Number���ͣ�����Object���� ���������ˡ�
	}
}
