package cn.kgc.datedemo;

import java.util.Calendar;

public class DateDemo2 {
	public static void main(String[] args){
		// ���ں�ʱ��
		Calendar t = Calendar.getInstance(); // Calendar����һ�������࣬û��new����Ҫͨ������һ����̬����getInstance()��ȡһ��Calendar����
		System.out.println(t.get(Calendar.YEAR) + "-" + (t.get(Calendar.MONTH) + 1) + "-" + t.get(Calendar.DAY_OF_MONTH));
		System.out.println("����������" + (t.get(Calendar.DAY_OF_WEEK) - 1));
	}
}
