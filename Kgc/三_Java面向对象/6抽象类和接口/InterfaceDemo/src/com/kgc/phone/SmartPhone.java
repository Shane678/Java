package com.kgc.phone;

public class SmartPhone extends HandSet implements TakePhoto, Networking, Playing {

	public SmartPhone(){}
	
	public SmartPhone(String brand, String type){
		super(brand, type);
	}
	
	public void sendMess() {
		System.out.println("��������+ͼƬ+��Ƶ����Ϣ");
	}

	public void call() {
		System.out.println("��Ƶͨ��");
	}

	public void playVideo(String name) {
		System.out.println("������Ƶ��"+ name +"��");
	}

	public void netWork() {
		System.out.println("����");
	}

	public void takePhotos() {
		System.out.println("����");
	}

}
