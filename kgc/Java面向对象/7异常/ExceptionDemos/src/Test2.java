import java.util.Scanner;

//ʹ��try-catch�����쳣
//��һ�������try���ֵĴ�����������������쳣������������ʱִ����try���ֺ������catch���ֵĴ��룬ֱ��ִ�к���Ĵ��롣
//�ڶ��������try���ֵĴ�������쳣�����쳣����ƥ�䣨��������Ĵ�������ʱ����ĳ���Ϊ0������������ʱ�����catch���֣�ִ����catch���ֺ󻹻�ִ�к���Ĵ��롣
public class Test2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�����뱻������");
		try{
			int num1 = in.nextInt();
			System.out.print("�����������");
			int num2 = in.nextInt();
			System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
		}catch(ArithmeticException e){ 
			System.err.println("�����˴��������");
			//�쳣����e   printStackTrace()����ӡ�쳣��ջ��Ϣ
			e.printStackTrace();
		}
		System.out.println("��лʹ�ñ�����");
	}
}

// java�����е��쳣����Exception�����ࣩ
// ����Ϊ0���쳣��ArithmeticException�����ࣩ
// ����ĸ�ʽ����ȷ��InputMismatchException�����ࣩ
// catch��������������Exception���ͣ��ŵ��ǿ���ץס�����쳣��ȱ����ץס���쳣�����塢����׼��

//���������в��Թ��̣�
//	�����뱻������100
//	�����������0
//	�����˴��������
//	��лʹ�ñ�����
//	java.lang.ArithmeticException: / by zero
//		at Test2.main(Test2.java:14)

