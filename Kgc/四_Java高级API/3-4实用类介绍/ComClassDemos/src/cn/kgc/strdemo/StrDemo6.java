package cn.kgc.strdemo;

// �ַ�����ַ�����split()
public class StrDemo6 {
	public static void main(String[] args) {
		String originalLyrics = "��ͤ�� �ŵ��� ���ݱ����� ���� �������� Ϧ��ɽ��ɽ";
		String[] changedLyrics = new String[100];
		
		System.out.println("***ԭ��ʸ�ʽ***");
		System.out.println(originalLyrics);
		changedLyrics = originalLyrics.split(" ");
		System.out.println("***��ֺ��ʸ�ʽ***");
		for (String lyrics : changedLyrics) {
			System.out.println(lyrics);
		}
	}
}
