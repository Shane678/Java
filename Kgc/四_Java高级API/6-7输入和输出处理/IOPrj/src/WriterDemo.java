import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// �����ַ���������D:\JJSha\text.txt����д����
public class WriterDemo {
	public static void main(String[] args) {
		Writer fw = null;
		try {
			fw = new FileWriter("D:/JJSha/text.txt", true);
			String info = "ʮ�³���";
			fw.write(info);
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
