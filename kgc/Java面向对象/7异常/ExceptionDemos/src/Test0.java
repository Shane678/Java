//import java.util.Scanner;

//�����쳣���д���
public class Test0 {
	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		System.out.print("�����뱻������");
		int num1 = in.nextInt();
		System.out.print("�����������");
		int num2 = in.nextInt();
		System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
		System.out.println("��лʹ�ñ�����");*/
		try{
			int[] nums = new int[2];
			System.out.println(nums[7]);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("*******");
			System.out.println(e.getMessage());
		}
//		���н����
//			java.lang.ArrayIndexOutOfBoundsException: 7
//				at Test0.main(Test0.java:15)
//			*******
//			7
//		���Կ�����getMessage()��õ���ð�ź�������ݡ�
	}
}
