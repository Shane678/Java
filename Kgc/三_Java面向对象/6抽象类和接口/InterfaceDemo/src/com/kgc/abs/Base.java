package com.kgc.abs;

//����
public abstract class Base { // һ���ļ���ֻ����һ��public�࣬�������public������ֱ�����ļ���һ����
	public Base() {
		System.out.println("������޲ι��췽��");
	}
	
	public static void main(String[] args) { // main����Ҫд�ڹ���������
		Base b = new Sub(); // ��������ָ���������
	}
}

// ����
class Sub extends Base { // һ���ļ�������ж����ͨ��class��
	public Sub() {
		System.out.println("������޲ι��췽��"); // ִ���м̳й�ϵ�Ĺ��췽��ʱ������ִ�и���Ĺ��췽������ִ������Ĺ��췽����
	}
}