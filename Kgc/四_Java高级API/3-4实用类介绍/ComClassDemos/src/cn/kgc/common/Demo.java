package cn.kgc.common;

public class Demo {
	public static void main(String[] args) {
		// ��װ��Ĺ��췽������1���ѻ����������ͱ�Ϊ��װ�ࣨ2�����ַ�����Ϊ��װ��
		// ���а�װ�඼�еĹ��췽��������֮��Ӧ�Ļ�������������Ϊ����
		int i = 3;
		Integer i1 = new Integer(i);
		double d = 7.8;
		Double d1 = new Double(d);
		Boolean b1 = new Boolean(true);
		Character c1 = new Character('a');
		
		System.out.println(i1 + "\t" + d1 + "\t" + b1 + "\t" + c1);
		
		// ����Character֮��İ�װ�඼�еĹ��췽�������ַ�����Ϊ����
		Integer i2 = new Integer("2");
		Double d2 = new Double("2.7");
//		Boolean b2 = new Boolean("true");
//		Boolean b2 = new Boolean("TrUe");
		Boolean b2 = new Boolean("love");
//		Character c2 = new Character("a"); // �������
		
		System.out.print(i2 + "\t" + d2 + "\t" + b2);
	}
}
