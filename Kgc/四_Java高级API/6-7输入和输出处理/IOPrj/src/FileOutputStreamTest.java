import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// ʹ���ֽ���������ļ���д����
public class FileOutputStreamTest {
	public static void main(String[] args){
		FileOutputStream fos = null;
		try {
			// ���������FileOutputStream����
			fos = new FileOutputStream("d:\\JJSha\\hello.txt");
			// ������Ҫд��ȥ������
			String str = "��Java";
			// ��Ҫ���ַ���ת��Ϊ�ֽ�����
			byte[] words = str.getBytes();
			// ������words�ĵ�0��λ�ÿ�ʼд��д��ȥ�ĳ���Ϊ��������ĳ��ȣ��ж��ٸ��ֽڶ�д��ȥ��
			fos.write(words, 0, words.length);
			System.out.println("hello�ļ��Ѹ��£�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
