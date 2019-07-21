import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// ������
public class LoginServer {
	public static void main(String[] args) {
		try {
			// ���տͻ�������
			// 1������һ���������˵�Socket���˿ں�5000��
			ServerSocket serverSocket = new ServerSocket(5000);
			// 2��ʹ��accept()��������û�����ӽ���֮ǰһֱ���������ȴ�״̬�����������յ���ServerSocket�����ӣ������socket�������Ϊ�ͻ��˵�socket��
			Socket socket = serverSocket.accept();
			// ���������������û�������
			InputStream is = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String info;
			while ((info = br.readLine()) != null) {
				System.out.println("�ͻ���˵��" + info);
			}
			
			// ���ͻ���һ����Ӧ
			String reply = "��ӭ��¼!";
			// ͨ�����������Ӧ���ͻؿͻ���
			OutputStream os = socket.getOutputStream();
			os.write(reply.getBytes());
			
			// �ͷ���Ӧ��Դ
			os.close();
			br.close();
			is.close();
			socket.close();
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
