import java.util.Scanner;

//ʹ��try-catch�����쳣
//��һ�������try���ֵĴ�����������������쳣������������ʱִ����try���ֺ������catch���ֵĴ��룬ֱ��ִ�к���Ĵ��롣
//�ڶ��������try���ֵĴ�������쳣������catch����쳣����ƥ�䣨��������Ĵ�������ʱ����ĳ���Ϊ0������������ʱ�����catch���֣�ִ����catch���ֺ󻹻�ִ�к���Ĵ��롣
//�����������try���ֵĴ�������쳣������catch����쳣���Ͳ�ƥ�䣨��������Ĵ�������ʱ����ĳ���Ϊ��ĸ������������ʱ�������catch���֣��������쳣���ж����У�����ִ��try-catch���Ĵ���Ρ�
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
//���Եڶ��������
//	�����뱻������100
//	�����������0
//	�����˴��������
//	��лʹ�ñ�����
//	java.lang.ArithmeticException: / by zero
//		at Test2.main(Test2.java:14)
//
//���Ե����������
//	�����뱻������100
//	�����������Z
//	Exception in thread "main" java.util.InputMismatchException
//		at java.util.Scanner.throwFor(Scanner.java:909)
//		at java.util.Scanner.next(Scanner.java:1530)
//		at java.util.Scanner.nextInt(Scanner.java:2160)
//		at java.util.Scanner.nextInt(Scanner.java:2119)
//		at Test2.main(Test2.java:14)
