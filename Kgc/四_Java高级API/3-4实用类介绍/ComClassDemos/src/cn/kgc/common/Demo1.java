package cn.kgc.common;

public class Demo1 {
	public static void main(String[] args) {
		// ��װ�� --> ������������   ***Value()
		Integer i = new Integer(2);
		int j = i.intValue();
		System.out.println(j);
		
		Boolean b = new Boolean(true);
		boolean b1 = b.booleanValue();
		System.out.println(b1);
		
		// ������������ --> �ַ���   ��1��toString() ��2��+ ""   ������2���ܸ����ã�
		int num = 8;
		String strNum = Integer.toString(num);
		String strNum2 = num + "";
		System.out.println(strNum + "---" + strNum2);
		
		// �ַ��� --> ������������   parse***()   Character���ͳ���   ���ص���䣩
		String s = "27";
		int num2 = Integer.parseInt(s);
		boolean boolNum = Boolean.parseBoolean(s);
		boolean boolNum2 = Boolean.parseBoolean("true");
		System.out.println(num2 + "---" + boolNum + "---" + boolNum2);
	}
}
