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
		}
		System.out.println("��лʹ�ñ�����");
	}
}

//	��try�ڵ��쳣���ͺ�catch������Ͳ�ƥ�䣬����жϳ���catch������Ĵ���Ҳ����ִ�С�
//	���н����
//		�����뱻������100
//		�����������0
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//			at Test3.main(Test3.java:13)
