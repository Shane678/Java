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
			// step3����ȡ�ļ��������ݣ�ʹ���������ķ���
			int data;
			while ((data = fis.read()) != -1) {
				System.out.print((char)data);
			}
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
