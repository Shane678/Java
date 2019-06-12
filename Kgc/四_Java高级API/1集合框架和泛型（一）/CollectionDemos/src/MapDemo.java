import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import sun.swing.text.CountingPrintable;

// �洢����Ӣ�ļ��-����ȫ�ƣ���-ֵ�ԣ�
public class MapDemo {
	public static void main(String[] args) {
		Map countries = new HashMap();
		// ��Map��������Ӽ�ֵ��
		countries.put("CN", "�л����񹲺͹�");
		countries.put("RU", "����˹����");
		countries.put("FR", "���������͹�");
		countries.put("US", "��������ڹ�");
		
		// ��ȡMap��Ԫ���飨�ԣ���
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
		/*countries.clear();
		if(countries.isEmpty()) {
			System.out.println("Map�����Ѿ����");
		}*/
		
		System.out.println("*******");
		// �ֱ��ȡMap�еļ���ֵ
		// ��1���Ȼ�ȡ��ÿ��key��Ȼ�����ÿ��key�õ���Ӧ��value��
		Set keys = countries.keySet();
		// ����һ��ʹ����ǿ��for�õ�ÿ��key
		for(Object obj : keys){
			String key = (String)obj;
			String value = (String)countries.get(key);
			System.out.println(key + "-" + value);
		}
		System.out.println("*******");
		// ��������ʹ��Iterator���������õ�ÿ��key
		Iterator itor = keys.iterator();
		while(itor.hasNext()){
			String key = (String)itor.next();
			String value = (String)countries.get(key);
			System.out.println(key + "-" + value);
		}
		
		System.out.println("*******");
		// ��2�����õ�Map�еļ�ֵ�ԣ�Ȼ������ÿ����ֵ���зֱ�ȡ������ֵ
		Set ms = countries.entrySet(); // entrySet()�õ�����Map�����м�ֵ�Եļ��ϣ����ص���Set��
		for(Object obj : ms){ // �ó�����ÿһ����ֵ������ʵ������Map.Entry���͵ģ�����Ϊ����û���÷��ͣ��������Ͷ���ΪObject���ͣ�������ת��ΪMap.Entry���͡�
			Map.Entry me = (Map.Entry)obj; // Map�е�ÿһ����ֵ�ԣ�Map.Entry���ͣ�
			Object key = me.getKey(); // ȡ��ÿ����ֵ���еļ�
			Object value = me.getValue(); // ȡ��ÿ����ֵ���е�ֵ
			System.out.println((String)key + "-" + (String)value);
		}
		
		
	}
}
