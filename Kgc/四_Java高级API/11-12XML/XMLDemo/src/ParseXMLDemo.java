import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

// ʹ��DOM����XML�ļ�
public class ParseXMLDemo {
	// ���ղ���Ϣ.xml����Ӧ��Document����
	private Document document;
	
	// ���DOM�������Document����
	public void getDom() {
		// ��ý���������
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			// ���ݽ�����������ý�����
			DocumentBuilder builder = factory.newDocumentBuilder();
			// ������������XML�ļ����Document����
			document = builder.parse("�ղ���Ϣ.xml"); // ����д�������·����ǰ���Ǵ�XML�ļ�Ҫֱ�ӷ��ڵ�ǰ��Ŀ�¡�
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// ��ȡ�ֻ�Ʒ�Ƽ��ͺ������Ϣ
	public void showInfo() {
		// ��Document����㣬���õ����е�Brand�ڵ�
		NodeList brands = document.getElementsByTagName("Brand");
		// ����brands�������ó�ÿһ��Brand
		for (int i = 0; i < brands.getLength(); i++) {
			Node node = brands.item(i);
			Element eleBrand = (Element)node;
			// ͨ����������ȡ����ֵ
			String brandName = eleBrand.getAttribute("name");
			System.out.println(brandName);
			
			// �������ң���ÿ��Brand���ӽڵ������
			NodeList types = eleBrand.getChildNodes();
			for (int j = 0; j < types.getLength(); j++) {
				Node typeNode = types.item(j);
				// �жϸ��ӽڵ��Ƿ�ΪԪ�ؽڵ�
				if (typeNode.getNodeType() == Node.ELEMENT_NODE) {
					Element typeEle = (Element)typeNode;
					System.out.println("\t" + typeEle.getAttribute("name"));
				}
				
			}
		}
	}
	
	public static void main(String[] args){
		ParseXMLDemo pd = new ParseXMLDemo();
		pd.getDom();
		pd.showInfo();
	}
}
