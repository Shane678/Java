package com.kgc.phone;

//��ͨ�ֻ���
public class CommonPhone extends HandSet implements Playing {

	public CommonPhone(){}
	
	public CommonPhone(String brand, String type){
		super(brand, type);
	}
	
	@Override
	public void playVideo(String name) {
		// TODO Auto-generated method stub
		System.out.println("������Ƶ����"+ name +"��");
	}

	@Override
	public void sendMess() {
		// TODO Auto-generated method stub
		System.out.println("�������ֶ���");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("����ͨ��");
	}
	
}
