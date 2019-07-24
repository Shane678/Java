import java.io.File;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class Dom4jDemo {
	private Document document;
	
	//���document����
	public void loadDocument() {
		SAXReader saxReader = new SAXReader();
		try {
			document = saxReader.read(new File("�ղ���Ϣ.xml"));
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	// ��ʾ�ֻ���Ʒ�Ƽ��ͺ�
	public void showPhoneInfo(){
		// ��ȡXML���ڵ�
		Element root = document.getRootElement();
		// ��ȡ����<Brand>
		Iterator eleBrands = root.elementIterator();
		while (eleBrands.hasNext()) {
			Element brand = (Element)eleBrands.next();
			System.out.println(brand.attributeValue("name"));
			Iterator eleTypes = brand.elementIterator();
			while (eleTypes.hasNext()) {
				Element type = (Element)eleTypes.next();
				System.out.println("\t" + type.attributeValue("name"));
			}
		}
	}
	
	public static void main(String[] args) {
		Dom4jDemo domDemo = new Dom4jDemo();
		domDemo.loadDocument();
		domDemo.showPhoneInfo();
	}
}
