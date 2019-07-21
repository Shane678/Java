package cn.kgc.p1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

// �ͻ���
public class LoginClient {
	public static void main(String[] args) {
		try {
			// �������󵽷�����
			// ������һ���ͻ��˵�Socket
			Socket socket = new Socket("localhost", 5000);
			// ͨ���������������
			String info = "�û�����Tom�����룺123456";
			OutputStream os = socket.getOutputStream();
			byte[] infos = info.getBytes();
			os.write(infos);
			
			// �ȹر������
			socket.shutdownOutput(); 
			// ͨ�����������շ��������ҵ���Ӧ
			InputStream is = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String reply;
			while ((reply = br.readLine()) != null) {
				System.out.println("������˵��" + reply);
			}
			
			// �ͷ���Դ
			os.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
