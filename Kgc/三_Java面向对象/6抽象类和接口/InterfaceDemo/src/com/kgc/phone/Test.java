package com.kgc.phone;

public class Test {
	public static void main(String[] args) {
		CommonPhone common = new CommonPhone("���ᰮ����", "G520");
		common.call();
		common.sendMess();
		common.playVideo("���");
		common.showInfo();
		
		System.out.println("*******");
		
		SmartPhone smart = new SmartPhone("��Ϊ", "P30");
		smart.call();
		smart.sendMess();
		smart.playVideo("֪��");
		smart.netWork();
		smart.takePhotos();
		smart.showInfo();
	}

}
