import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		//������洢�������ű���
		NewsTitle title1 = new NewsTitle(1, "�Ͼ�������1", "admin");
		NewsTitle title2 = new NewsTitle(2, "�Ͼ�������2", "admin");
		NewsTitle title3 = new NewsTitle(3, "�Ͼ�������3", "admin");
		NewsTitle title4 = new NewsTitle(4, "�Ͼ�������4", "admin");
		NewsTitle title5 = new NewsTitle(5, "�Ͼ�������5", "admin");
		NewsTitle title6 = new NewsTitle(6, "�Ͼ�������6", "admin");
		NewsTitle title7 = new NewsTitle(7, "�Ͼ�������7", "admin");
		
		//ע�⣺�����������޷�ʹ��LinkedList���еķ���
//		List list = new LinkedList(); // ��������ָ����������������ᵼ��list���ò���������еķ����������������LinkedList��6�����з���ʱ�ᱨ��
		LinkedList list = new LinkedList();
		list.add(title1);
		list.add(title2);
		list.add(title3);
		list.add(1, title4);
		
		/* ���ͷ��β */
		list.addFirst(title5); // LinkedList���еķ���
		list.addLast(title6); // LinkedList���еķ���
		
		list.add(title7);
//		System.out.println(list.size());
		
		for(int i = 0; i < list.size(); i++){
			NewsTitle title = (NewsTitle)list.get(i);
			System.out.println(title.getId() + "-" + title.getTitle());
		}
		
		System.out.println("*******");
		
		for(Object obj : list){
			NewsTitle title = (NewsTitle)obj;
			System.out.println(title.getId() + "-" + title.getTitle());
		}
		
		/* ɾ��ͷ��β */
		list.removeFirst();
		System.out.println("*******");
		for(Object obj : list){
			NewsTitle title = (NewsTitle)obj;
			System.out.println(title.getId() + "-" + title.getTitle()); 
		}
		
		list.removeLast();
		System.out.println("*******");
		for(Object obj : list){
			NewsTitle title = (NewsTitle) obj;
			System.out.println(title.getId() + "-" + title.getTitle());
		}
		
		System.out.println("*******");
		
		/* ���ͷ��β */
		NewsTitle firstName = (NewsTitle)list.getFirst();
		System.out.println("ͷ�����ű��⣺" + firstName.getTitle());
		NewsTitle lastName = (NewsTitle)list.getLast();
		System.out.println("ĩ�����ű��⣺" + lastName.getTitle());
	}
}
