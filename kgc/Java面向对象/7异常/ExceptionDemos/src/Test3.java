import java.util.InputMismatchException;
import java.util.Scanner;


public class Test3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�����뱻������");
		try{
			int num1 = in.nextInt();
			System.out.print("�����������");
			int num2 = in.nextInt();
			System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
			return;
		}catch(InputMismatchException e){ 
			System.err.println("�����˴��������");
			e.printStackTrace();
			// �˳�JVM   exit()ֻҪ��һ�������int����ֵ����
//			System.exit(7);
			return;
		}finally{
			System.out.println("��лʹ�ñ�����");
		}
	}
}

//	����try-catch-finally��try��������return��ִ�е�returnʱ����ֱ���˳�������������ִ��finally��֮����ִ��return���˳�������
//	���н����
//		�����뱻������7
//		�����������2
//		7/2=3
//		��лʹ�ñ�����
//	�ܽ᣺����return������try���л���catch���У�����returnʱ��������ȥִ��finally�飬����ִ��return����������
//		ֻ��һ������²���ִ��finally����System.exit(1)�˳�Java�������