package cn.kgc.datedemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		// ��ǰ���ں�ʱ��
		Date date = new Date();
		System.out.println(date);
		// �����ں�ʱ��ĸ�ʽ��Ϊ����Ҫ��ĸ�ʽ����-��-�� ʱ���֣��롱��
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sdate = formater.format(date);
		System.out.println(sdate);
	}
}
