package ThreadDemo6;
/**
 * ʵ������
 * @author Shane
 *
 */
public class Wait {
	public static void bySec(long s){
		for (int i = 0; i < s; i++) {
			System.out.println(i + 1 + "��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
}
