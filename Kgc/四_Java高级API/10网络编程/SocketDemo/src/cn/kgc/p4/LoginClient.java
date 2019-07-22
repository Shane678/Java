package cn.kgc.p4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

// ����UDP��Socketͨ�ţ��ͻ���
public class LoginClient {
	public static void main(String[] args) {
		// ������
		String info = "�����ɿ�����";
		byte[] infos = info.getBytes();
		// �Է��ĵ�ַ���ʱࣨ�˿ںţ�
		InetAddress ia;
		// ��ݵ�
		DatagramSocket socket = null;
		try {
			// ����ռ��˵�ַ
			ia = InetAddress.getByName("localhost");
			// ������װ����
			DatagramPacket dp = new DatagramPacket(infos, infos.length, ia, 5000);
			socket = new DatagramSocket();
			// ͨ����ݵ�����ĳ�����
			socket.send(dp);
			
			// ���շ���������Ӧ
			// ��׼��һ���հ���DatagramPacket��
			byte[] replys = new byte[1024];
			DatagramPacket dp1 = new DatagramPacket(replys, replys.length);
			// �ڿ�ݵ�ȡ����
			socket.receive(dp1);
			// ������
			String reply = new String(dp1.getData(), 0, dp1.getData().length);
			System.out.println("����������Ӧ ��" + reply);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			socket.close();
		}
		
	}
}
