import java.io.File;
import java.io.IOException;

// �ļ������������ļ����鿴�ļ������Ϣ��ɾ���ļ�
public class FileDemo {
	// c:\1\2\3\1.txt	����·��
	// 2\3\1.txt 		���·��
	
	// �����ļ�
	public void create(File file){
		if (!file.exists()) {
			try {
				file.createNewFile(); // �����ļ����������ļ��У���·���е��ļ��в����ڣ���ᱨ��
				System.out.println("�ļ��Ѵ�����");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	// �鿴�ļ������Ϣ
	public void showFileInfo(File file){
		if (file.exists()) {
			// ����ļ����ڣ���鿴����Ϣ
			if (file.isFile()) {
				// ���ļ�
				System.out.println("���ļ����ǣ�" + file.getName());
				System.out.println("���·����" + file.getPath());
				System.out.println("����·����" + file.getAbsolutePath());
				System.out.println("�ļ���С��" + file.length() + "�ֽ�");
			}
			if (file.isDirectory()) {
				System.out.println("���ļ���Ŀ¼��");
			}
		} else {
			System.out.println("�ļ������ڣ�");
		}
	}
	
	// ɾ���ļ�
	public void delete(File file){
		if (file.exists()) {
			file.delete();
			System.out.println("�ļ���ɾ����");
		}
	}
	
	public static void main(String[] args){
		FileDemo fileDemo = new FileDemo();
		File file = new File("d:/JJSha/text.txt");
//		File file = new File("test.txt");
//		fileDemo.create(file); // �ļ�������ʱ���������ھͲ�ִ��������
		fileDemo.showFileInfo(file);
		
//		fileDemo.delete(file);
	}
}
