import java.util.Scanner;

/*
 * ��ͳ��ʽ�������쳣
 */
public class Test1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�����뱻������");
		int num1 = in.nextInt();
		System.out.print("�����������");
		int num2 = 0;
		if(in.hasNextInt()){ // hasNextInt()�����ж��û��ڿ���̨������Ƿ�Ϊ���������ǣ�����true�������ǣ�����false��
			//¼���������
			num2 = in.nextInt();
			if(num2 == 0){
				System.err.println("����ĳ�����0�������˳���"); // errָerror������������   �����ʽ����ɫ���Ƚ���Ŀ
				System.exit(1); //�����˳�JVM�����Ĳ���ֻҪ�Ƿ�0���������ͱ�ʾ�˳�JVM��
			}else{
				System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
				System.out.println("��лʹ�ñ�����");
			}
		}else{
			//¼��Ĳ�������
			System.err.println("¼��ĳ������������������˳�");
			System.exit(1); //�˳�JVM�����Ĳ���ֻҪ�Ƿ�0���������ͱ�ʾ�˳�JVM��
		}
	}
}
