package com.kgc.lock;

//������
public class TheftProofDoor extends Door implements Lock, TakePhoto {

	@Override
	public void lockUp() {
		// TODO Auto-generated method stub
		System.out.println("���Կ�ף�����ת��Ȧ�����꣬������.......");
	}

	@Override
	public void lockOpen() {
		// TODO Auto-generated method stub
		System.out.println("���Կ�ף�����ת��Ȧ�����꣬������.......");
		
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("����");
		
	}

	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		System.out.println("�������ã����꣬�����ˣ��浵��.......");
	}
	
}
