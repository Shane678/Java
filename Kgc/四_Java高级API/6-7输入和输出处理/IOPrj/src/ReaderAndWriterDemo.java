import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

// ��pet.template�ļ��е����ݶ�ȡ����
// ����ȡ�����������ض����ֽ����滻
// ���滻�������������д�뵽����һ���ļ���
public class ReaderAndWriterDemo {
	public static void main(String[] args) {
		BufferedReader reader = null;
		InputStreamReader isr = null;
		FileInputStream fis = null;
		
		try {
			// FileInputStreamΪ�ֽ���
			fis = new FileInputStream("D:\\JJSha\\pet.template");
			// ���ֽ��������ַ���
			isr = new InputStreamReader(fis, "utf-8");
			reader = new BufferedReader(isr);
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				isr.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
