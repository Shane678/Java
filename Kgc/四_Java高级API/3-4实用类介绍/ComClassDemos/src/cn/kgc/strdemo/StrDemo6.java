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
		System.out.println("������һ���ַ�����");
		String info = input.next();
		System.out.println("��������Ҫ��ѯ���ַ���");
		String want = input.next();
//		String[] splitedInfos = info.split("-");
		String[] splitedInfos = new String[info.length()];
		
		// �ض��ַ����ֵĴ���
		int count = 0;
		for (int i = 0; i < splitedInfos.length; i++) {
			splitedInfos[i] = info.substring(i, i + 1);
			if (splitedInfos[i].equals(want)) {
				count++;
			}
		}

		System.out.println("\"" + want + "\"��\"" + info + "\"��" + "���ֵĴ���Ϊ��" + count + "�Ρ�"); // ת����ţ�\
		
	}
}
