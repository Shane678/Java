import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// ����d:\�ҵ��ഺ˭����.txt�����ݸ��Ƶ���C:\Users\Shane\Desktop\hello.txt����ȥ
public class InputAndOutputDemo {
	public static void main(String[] args) {
		// �����������︺���d�̵��ļ����ݶ�����
		FileInputStream fis =null;
		// ����������︺��Ѷ�����������д��c�̵��ļ�
		FileOutputStream fos =null;
		
		try {
			fis = new FileInputStream("d:\\�ҵ��ഺ˭����.txt");
			// ����Դ�ļ�����
//			fos = new FileOutputStream("C:/Users/Shane/Desktop/hello.txt");
			// ׷������
			fos = new FileOutputStream("C:/Users/Shane/Desktop/hello.txt", true);
			
			byte[] words = new byte[1024];
			int len;
			while ((len = fis.read(words)) != -1) {
				fos.write(words, 0, len);
			}
			// �������󣺣�1����д��һ���ֽڹ��� ��2����д�˺ܶ�ո����
			/*while (fis.read() != -1) {
				fis.read(words); // ��ȡ�ļ�
				fos.write(words, 0, words.length); // д���ļ�
			}*/
			System.out.println("�ļ�������ɣ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// ͨ������£����Ĺر�˳��Ϊ����򿪵��ȹ�
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
