package Sale;
/**
 * ģ�������Ʊ
 * @author Shane
 *
 */
public class Test {
	public static void main(String[] args) {
		Site site = new Site();
		Thread person1 = new Thread(site, "С��");
		Thread person2 = new Thread(site, "��");
		Thread person3 = new Thread(site, "qi");
		person1.start();
		person2.start();
		person3.start();
	}
}
