import java.util.InputMismatchException;
import java.util.Scanner;


public class Test4 {
	//һ�����������׳��쳣�����֪ͨ�����ߣ�
	//��ʽ2�������ߴ����쳣
	public static void main(String[] args) { 
		Test4 t = new Test4();
		try{
			t.divide();
		}catch(InputMismatchException e){ 
			System.err.println("�������Ϊ������");
			e.printStackTrace();
		}catch(ArithmeticException e){
			System.err.println("��������Ϊ0��");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("�������������������");
			e.printStackTrace();
		}finally{
			System.out.println("��лʹ�ñ�����");
		}
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
