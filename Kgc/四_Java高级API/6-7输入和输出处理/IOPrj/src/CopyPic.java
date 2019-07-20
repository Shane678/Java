import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// ����D:/JJSha/peppa.jpg�����Ƶ���D:/JJSha/newPic���ļ�����
public class CopyPic {
	public static void main(String[] args) {
		// ������
		DataInputStream dis = null;
		FileInputStream fis = null;
		
		// �����
		DataOutputStream dos = null;
		FileOutputStream fos = null;		
		try {
			fis = new FileInputStream("D:/JJSha/peppa.jpg");
			dis = new DataInputStream(fis);
			
			fos = new FileOutputStream("D:/JJSha/newPic/newPeppa.jpg");
			dos = new DataOutputStream(fos);
			
			int temp;
			while ((temp = dis.read()) != -1) {
				dos.write(temp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				fos.close();
				dis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
				
	}
}
