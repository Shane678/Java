import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;

//���Ź���
public class ArrayListDemo {
	public static void main(String[] args) {
		//������洢�������ű���
		NewsTitle title1 = new NewsTitle(1, "�Ͼ�������1", "admin");
		NewsTitle title2 = new NewsTitle(2, "�Ͼ�������2", "admin");
		NewsTitle title3 = new NewsTitle(3, "�Ͼ�������3", "admin");
		NewsTitle title4 = new NewsTitle(4, "�Ͼ�������4", "admin");
		NewsTitle title5 = new NewsTitle(5, "�Ͼ�������5", "admin");
		
		ArrayList<NewsTitle> list = new ArrayList<NewsTitle>();
//		List list = new ArrayList(); // ��������ָ��������󣨿����ã�������д��ֻ�ܵ���List��ArrayList���еķ����������ܵ����������еķ�����
		
		//���Ԫ�ص�������
		//���������Ƕ�������ǻ����������ͣ��ᱻ��װ�ɶ���
		list.add(title1);
		list.add(title2);
		list.add(title3);
		list.add(title4);
		list.add(1, title5); // ��ָ��λ�ò���Ԫ��
		
		//size()Ϊ��ȡ���ϵĳ��ȣ�Returns the number of elements in this list.��
		System.out.println("���ű����������" + list.size());
		
		/* ��������ļ��ϣ�����ʹ�������ķ�ʽ��
		 * ��1����ͨfor����������
		 * ��2����ǿ��for
		 * ��3��iterator������ */
		//����list��ȡ��ÿ�����ű������Ŀ
		for(int i = 0; i < list.size(); i++){
			NewsTitle title = list.get(i);
			System.out.println(title.getTitle());
		}
		
		System.out.println("*******");
		
		//��ǿ��forѭ��
		for(NewsTitle obj : list){
			NewsTitle title = obj;
			System.out.println(title.getTitle());
		}
		
		System.out.println("*******");
		
		// iterator��������
		Iterator<NewsTitle> itor = list.iterator();
		while(itor.hasNext()){
			NewsTitle title = itor.next();
			System.out.println(title.getId() + "-" + title.getTitle());
		}
		
		System.out.println("*******");
		
		//contains()��remove()
		System.out.println(list.contains(title1));
		//ɾ��һ��
		list.remove(title1);
		System.out.println(list.contains(title1));
		//��ӡɾ�����list����
		System.out.println(list.size());
		System.out.println("*******");
		//��ռ���
		list.clear();
		System.out.println(list.size());
		//�жϼ����Ƿ�Ϊ��
		System.out.println(list.isEmpty());
	}
}
