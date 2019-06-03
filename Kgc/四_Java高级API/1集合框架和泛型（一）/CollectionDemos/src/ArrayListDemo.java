import java.util.ArrayList;

//���Ź���
public class ArrayListDemo {
	public static void main(String[] args) {
		//������洢�������ű���
		NewsTitle title1 = new NewsTitle(1, "�Ͼ�������1", "admin");
		NewsTitle title2 = new NewsTitle(2, "�Ͼ�������2", "admin");
		NewsTitle title3 = new NewsTitle(3, "�Ͼ�������3", "admin");
		NewsTitle title4 = new NewsTitle(4, "�Ͼ�������4", "admin");
		NewsTitle title5 = new NewsTitle(5, "�Ͼ�������5", "admin");
		
		ArrayList list = new ArrayList();
		//���Ԫ�ص�������
		list.add(title1);
		list.add(title2);
		list.add(title3);
		list.add(title4);
		
		//size()Ϊ��ȡ���ϵĳ��ȣ�Returns the number of elements in this list.��
		System.out.println("���ű����������" + list.size());
		
		//����list��ȡ��ÿ�����ű������Ŀ
		for(int i = 0; i < list.size(); i++){
			NewsTitle title = (NewsTitle)list.get(i);
			System.out.println(title.getTitle());
		}
		
		System.out.println("*******");
		
		//��ǿ��forѭ��
		for(Object obj : list){
			NewsTitle title = (NewsTitle)obj;
			System.out.println(title.getTitle());
		}
	}
}
