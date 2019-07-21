package cn.kgc.p2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
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
			User user = new User("tom", "123456");
			// ͨ��socket��ȡ�����
			OutputStream os = socket.getOutputStream();
			// ��socket���������װ�ɶ��������
			ObjectOutputStream oos = new ObjectOutputStream(os);
			// �Ѷ���д��ȥ
			oos.writeObject(user);
			/*String info = "�û�����Tom�����룺123456";
			OutputStream os = socket.getOutputStream();
			byte[] infos = info.getBytes();
			os.write(infos);*/
			
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
			br.close();
			is.close();
			oos.close();
			os.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
