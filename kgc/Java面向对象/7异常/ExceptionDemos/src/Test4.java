import java.util.InputMismatchException;
import java.util.Scanner;


public class Test4 {
	//һ�����������׳��쳣�����֪ͨ�����ߣ�
	//��ʽ1�������߼��������쳣
	public static void main(String[] args) throws ArithmeticException, InputMismatchException { // main����������쳣�׸�JVM����
		Test4 t = new Test4();
		t.divide();
	}
	
	//���������ĳ������㣬�����÷����������쳣
	public void divide() throws ArithmeticException, InputMismatchException{
		Scanner in = new Scanner(System.in);
		System.out.print("�����뱻������");
		int num1 = in.nextInt();
		System.out.print("�����������");
		int num2 = in.nextInt();
		System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
	}
	
}
