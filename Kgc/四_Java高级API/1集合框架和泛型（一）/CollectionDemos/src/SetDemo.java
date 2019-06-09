import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//����Set��ʹ��
public class SetDemo {
	public static void main(String[] args) {
		NewsTitle title1 = new NewsTitle(1, "�Ͼ�������1", "admin");
		NewsTitle title2 = new NewsTitle(2, "�Ͼ�������2", "admin");
		NewsTitle title3 = new NewsTitle(3, "�Ͼ�������3", "admin");
		NewsTitle title4 = new NewsTitle(4, "�Ͼ�������4", "admin");
		NewsTitle title5 = new NewsTitle(5, "�Ͼ�������5", "admin");
		
		Set set = new HashSet(); // Set�ǽӿڣ�û��new��ֻ��new����ʵ���ࡣ
		set.add(title1);
		set.add(title2);
		set.add(title3);
		set.add(title4);
		set.add(title5);
		
		System.out.println("�����ܼ�¼����" + set.size());
		
		/* ��������ļ��ϣ�����ʹ�õ�������ʽ��
		 * ��1����ǿ��for
		 * ��2��iterator������ */
		
		// ����ÿ��������Ϣ����ǿ��for��ʽ��
		// Set�����˳��������ģ�����ӵ�˳����һ���ġ�
		for(Object obj : set){
			NewsTitle title = (NewsTitle)obj;
			System.out.println(title.getId() + "-" + title.getTitle());
		}
		System.out.println("*******");
		
		// ʹ�õ���������
		Iterator itor = set.iterator(); // ��õ�����itor
		// ͨ������������������Ԫ��
		while(itor.hasNext()){
			NewsTitle title = (NewsTitle)itor.next();
			System.out.println(title.getId() + "-" + title.getTitle());
		}
	}
}
