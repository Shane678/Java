package cn.kgc.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("animal");
		list.add("pea");
		list.add("beautiful");
		list.add("zero");
		list.add("young");
		list.add("love");
		list.add("slim");
		
		// ��ӡ��������е����ֵ����Сֵ
		String strMax = (String)Collections.max(list);
		String strMin = (String)Collections.min(list);
		System.out.println(strMax + "-" + strMin);
		System.out.println("*******");
		
		// ��������
		Collections.sort(list);
		for(String str : list){
			System.out.println(str);
		}
		System.out.println("*******");
		
		// ����
		System.out.println(Collections.binarySearch(list, "love"));
		System.out.println("*******");
		
		// ��ת����Ԫ��
		Collections.reverse(list);
		for(String str : list){
			System.out.println(str);			
		}
		
	}
}
