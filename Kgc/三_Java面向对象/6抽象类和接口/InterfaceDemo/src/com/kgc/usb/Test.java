package com.kgc.usb;

public class Test {
	public static void main(String[] args) {
		Usb fan = new UsbFan(); // ����һ���ӿ����͵ı�����UsbΪ�ӿڣ�UsbFan()Ϊ�ӿڵ�ʵ���࣬�������Ϊ��������ָ���������
		fan.service(); // ��̬   ��̬�󶨣�����ݾ����������ʲô���ͣ�ȥ���ö�Ӧ����д�Ժ�ķ����������ǵ��ø���ķ�����
		
		Usb disk = new UsbDisk();
		disk.service();
	}
}
