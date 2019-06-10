import java.util.HashMap;
import java.util.Map;

// �洢����Ӣ�ļ��-����ȫ�ƣ���-ֵ�ԣ�
public class MapDemo {
	public static void main(String[] args) {
		Map countries = new HashMap();
		// ��Map��������Ӽ�ֵ��
		countries.put("CN", "�л����񹲺͹�");
		countries.put("RU", "����˹����");
		countries.put("FR", "���������͹�");
		countries.put("US", "��������ڹ�");
		
		// ��ȡMap��Ԫ�ظ���
		System.out.println(countries.size());
		
		// ͨ��ĳ������ȡ��Ӧ��ֵ
		String cnStr = (String)countries.get("CN");
		System.out.println(cnStr);
		
		// �ж�map���Ƿ����ĳ����
		boolean flag = countries.containsKey("US");
		System.out.println("�������Ƿ����US��" + flag);
		
		// ɾ���ض�����Ӧ�ļ�ֵ��
		countries.remove("US");
		System.out.println(countries.size());
		
		flag = countries.containsKey("US");
		System.out.println("�������Ƿ����US��" + flag);
		
		// �ֱ���ʾmap�м��ļ��ϡ�ֵ�ļ��Ϻͼ�ֵ�Եļ���
		System.out.println(countries.keySet());
		System.out.println(countries.values());
		System.out.println(countries);
		
		// ���
		countries.clear();
		if(countries.isEmpty()) {
			System.out.println("Map�����Ѿ����");
		}
	}
}
