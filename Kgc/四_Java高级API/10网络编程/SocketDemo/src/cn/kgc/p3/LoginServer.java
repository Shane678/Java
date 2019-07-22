package cn.kgc.p3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// �������������������
// һֱ�����ͻ�����
// һ���������пͻ�������������һ���̣߳������̡߳�
public class LoginServer {
	public static void main(String[] args) {
		try {
			// 1������һ���������˵�Socket���˿ں�5000��
			ServerSocket serverSocket = new ServerSocket(5000);
			while (true) {
				// 2��ʹ��accept()��������û�����ӽ���֮ǰһֱ���������ȴ�״̬�����������յ���ServerSocket�����ӣ������socket�������Ϊ�ͻ��˵�socket��
				Socket socket = serverSocket.accept();
				// ����һ���͸ÿͻ�����Ӧ���߳�
				LoginThread loginThread = new LoginThread(socket);
				// �����̣߳�start()��������ʵ���ǵ���run()������
				loginThread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
