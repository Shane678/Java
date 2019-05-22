package com.kgc.printer;

//��ӡ��
public class Printer {
	InkBox inkBox; //ī��
	Paper paper; //ֽ��
	public InkBox getInkBox() {
		return inkBox;
	}
	public void setInkBox(InkBox inkBox) {
		this.inkBox = inkBox;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	public void print(){
		System.out.println("ʹ��" + inkBox.getColor() + "��ī����" + paper.getSize() + "ֽ���ϴ�ӡ");
	}
	
	public static void main(String[] args) {
		InkBox inkBox = new GrayInkBox(); // ׼����ī��   �ӿ�����ָ�����ʵ����Ķ��������ڸ�������ָ���������
		Paper paper = new A4Paper(); // ׼����ֽ
		Printer printer = new Printer(); // ׼���ô�ӡ��
		printer.setInkBox(inkBox); // ��ī�з����ӡ��
		printer.setPaper(paper); // ��ֽ�����ӡ��
		printer.print(); // ��ʼ��ӡ
		
		inkBox = new ColorInkBox();
		paper = new B5Paper();
		printer.setInkBox(inkBox);
		printer.setPaper(paper);
		printer.print();
	}
}
