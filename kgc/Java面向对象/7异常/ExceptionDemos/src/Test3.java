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

//	catch��������return��ִ�е�returnʱ����ֱ���˳�������������ִ��finally��֮����ִ��return���˳�������
//	���н����
//		�����뱻������100
//		�����������b
//		�����˴��������
//		java.util.InputMismatchException
//			at java.util.Scanner.throwFor(Scanner.java:909)
//			at java.util.Scanner.next(Scanner.java:1530)
//			at java.util.Scanner.nextInt(Scanner.java:2160)
//			at java.util.Scanner.nextInt(Scanner.java:2119)
//			at Test3.main(Test3.java:12)
//		��лʹ�ñ�����