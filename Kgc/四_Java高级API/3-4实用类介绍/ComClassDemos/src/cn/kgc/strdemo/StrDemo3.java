package cn.kgc.strdemo;

// �ַ�����ȡ��indexOf()  lastIndexOf()  substring(begin)  substring(begin, end) 
public class StrDemo3 {
	public static void main(String[] args) {
		String s = "I love Peppa! ok";
		System.out.println(s.indexOf('o')); // 3
		System.out.println(s.lastIndexOf("o")); // 14
		System.out.println(s.indexOf("q")); // -1
		
		System.out.println(s.substring(7)); // ��ȡʱ��������ʼλ�á�
		System.out.println(s.substring(7, 11)); // ��ȡʱ��������ʼλ�ã�����������λ�á�����ʼλ��~����λ��-1��
	}
}
