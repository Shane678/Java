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
//			return;
		}catch(InputMismatchException e){ 
			System.err.println("�������Ϊ������");
			e.printStackTrace();
			// �˳�JVM   exit()ֻҪ��һ�������int����ֵ����
//			System.exit(7);
//			return;
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
}

// ע�⣺��ͬ�Ŀ飨{...}������Գ���ͬ���ģ��ֲ���������
// ����catch��˳��Ϊ��д���࣬��д���ࡣ
// ����ȥ��׽��ȷ���쳣���Ա��о�ȷ����ʾ��