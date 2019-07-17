// step1��������ص���
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// ��ȡ�ļ�d:\JJSha\text.txt�е�����
public class FileInputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			// step2�������ļ�������FileInputStream����
			fis = new FileInputStream("d:\\JJSha\\text.txt");
			// ���Զ�ȡ�����ֽ���
			System.out.println("���Զ�ȡ�����ֽ�����" + fis.available());
			// step3����ȡ�ļ��������ݣ�ʹ����������read()����
			int data;
			while ((data = fis.read()) != -1) {
				System.out.print((char)data);
			}
//			// step3����ȡ�ļ��������ݣ�ʹ����������read(byte[] b)����
//			byte[] b = new byte[1024];
//			int data;
//			while ((data = fis.read(b)) != -1) {
//				for (int i = 0; i < data; i++) {
//					System.out.print((char)b[i]);
//				}
//			}
			// ��������󣬿��Զ�ȡ�����ֽ�����Ϊ0�ˡ�
			System.out.println("\n���Զ�ȡ�����ֽ�����" + fis.available());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// step4���ر��ļ�������
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
