import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

// ���������������ַ������������D:\JJSha\text.txt����д����
// �����ַ����������ļ����ݶ�������ʾ�ڿ���̨��
public class BufferedWriterDemo {
	public static void main(String[] args) {
		Writer fw = null;
		BufferedWriter bw = null;
		
		Reader fr = null;
		BufferedReader br = null;
		try {
			// ���
			fw = new FileWriter("D:/JJSha/text.txt", true);
			bw = new BufferedWriter(fw);
			
			bw.write("ʮ�³���");
			bw.newLine();
			bw.write("77");
			// ʹ�������ʱ��һ��Ҫ�ǵ���ջ��棨flush����ر�������������д���ݻ�ʧ�ܡ�
			bw.flush();
			
			// ����
			fr = new FileReader("D:/JJSha/text.txt");
			br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
