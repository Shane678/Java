package cn.kgc.strdemo;

import java.util.Scanner;

// �ַ�����ַ�����split()
public class StrDemo6 {
	public static void main(String[] args) {
		/*String originalLyrics = "��ͤ�� �ŵ��� ���ݱ����� ���� �������� Ϧ��ɽ��ɽ";
		String[] changedLyrics = new String[100];
		
		System.out.println("***ԭ��ʸ�ʽ***");
		System.out.println(originalLyrics);
		changedLyrics = originalLyrics.split(" ");
		System.out.println("***��ֺ��ʸ�ʽ***");
		for (String lyrics : changedLyrics) {
			System.out.println(lyrics);
		}*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������-�����ַ�����ÿ���ַ��á�-���������磺��-��-��-��-������");
		String info = input.next();
		System.out.println("��������Ҫ��ѯ���ַ���");
		String want = input.next();
		String[] splitedInfos = info.split("-");
		// �ض��ַ����ֵĴ���
		int count = 0;
		for (int i = 0; i < splitedInfos.length; i++) {
			if (splitedInfos[i].equals(want)) {
				count++;
			}
		}
		System.out.println("\"" + want + "\"��\"" + info + "\"��" + "���ֵĴ���Ϊ��" + count + "�Ρ�");
		
	}
}
