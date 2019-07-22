package cn.kgc.p3;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

// �߳���
// ���տͻ����󣬸��ͻ�һ����Ӧ��֮ǰ�������������飩
// �̹߳��췽����ȥ�󶨿ͻ��˵�Socket
public class LoginThread extends Thread {
	private Socket socket;
	
	public LoginThread(Socket socket) { // ��Ҫ�����ǿͻ��˵�socket
		this.socket = socket; // �̵߳�socket�󶨿ͻ��˵�socket
	}
	
	// �߳������¶���ͨ��run()����ʵ��
	// ���տͻ����󣬸��ͻ�һ����Ӧ��֮ǰ�������������飩	
	public void run() {
		try{
			// ���socket��������������û�������
			InputStream is = socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			User user = (User)ois.readObject();
			System.out.println("�ͻ���˵��" + user.getUserName() + "-" + user.getPwd());
	
			// ��ÿͻ��˵�IP��Ϣ
			InetAddress ia = socket.getInetAddress();
			String ip = ia.getHostAddress();
			System.out.println("��Ӧ�ͻ��˵�IP:" + ip);
			
			// ���ͻ���һ����Ӧ
			String reply = "��ӭ��¼!";
			// ͨ�����������Ӧ���ͻؿͻ���
			OutputStream os = socket.getOutputStream();
			os.write(reply.getBytes());
			
			// �ͷ���Ӧ��Դ
			ois.close();
			os.close();
			is.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
