import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

// ��pet.template�ļ��е����ݶ�ȡ����
// ����ȡ�����������ض����ֽ����滻
// ���滻�������������д�뵽����һ���ļ���
public class ReaderAndWriterDemo {
	public static void main(String[] args) {
		// 1.1����������ɶ�ȡ����
		BufferedReader reader = null;
		InputStreamReader isr = null;
		FileInputStream fis = null;
		
		// 3.1����������д�빦��
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			// 1.2����Դ�ļ��ж�ȡ
			// FileInputStreamΪ�ֽ���
			fis = new FileInputStream("D:\\JJSha\\pet.template");
			// ���ֽ��������ַ���
			isr = new InputStreamReader(fis, "utf-8");
			reader = new BufferedReader(isr);
			StringBuffer sbf = new StringBuffer();
			String line = null;
			while ((line = reader.readLine()) != null) {
				sbf.append(line);
			}
			
			// 2���ļ������滻
			System.out.println("�滻ǰ��" + sbf);
//			String newStr1 = sbf.toString().replace("{name}", "ŷŷ");
//			String newStr2 = newStr1.replace("{type}", "����");
//			String newStr = newStr2.replace("{master}", "����");
			String newStr = sbf.toString().replace("{name}", "ŷŷ").replace("{type}", "����").replace("{master}", "����");
			System.out.println("�滻��" + newStr);
			
			// 3.2�����滻���������д�����ļ�
			fw = new FileWriter("D:\\JJSha\\newPet.txt"); // ����д���ĸ����ļ���
			bw = new BufferedWriter(fw); // �ô����������ַ��������FileWriter������
			bw.write(newStr); // ���µ��ַ���д�����ļ���
			bw.flush(); // д���ǵð�Writer��ջ�����
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
				
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
