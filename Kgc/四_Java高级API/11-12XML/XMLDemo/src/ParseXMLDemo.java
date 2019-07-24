import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

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
	
	// ΪXML�ļ����Ԫ�أ�ֻ����ӵ��ڴ����û��������ӵ��ļ��У�
	public void addEle(){
		// ����<Brand name="����">
		Element brand = document.createElement("Brand");
		brand.setAttribute("name", "����");
		// ����<Type name="NOTE2">
		Element type = document.createElement("Type");
		type.setAttribute("name", "NOTE2");
		// ��Type��ΪBrand����Ԫ��
		brand.appendChild(type);
		// ��Brand�ŵ�PhoneInfo��ȥ
		document.getElementsByTagName("PhoneInfo").item(0).appendChild(brand);
		saveXML("�ղ���Ϣ.xml");
	}
	
	// ����XML�ļ�����Ҫ����ת������Դ�����µ�DOM���� --> Ŀ�ĵأ����ղ���Ϣ.xml���ļ�����ʵ�����ǽ����������ʵ�֣�
	public void saveXML(String path){
		// ת��������
		TransformerFactory factory = TransformerFactory.newInstance();
		try {
			// ת����
			Transformer transformer = factory.newTransformer();
			// Դ�����µ�DOM���� --> Ŀ�ĵأ����ղ���Ϣ.xml���ļ���
			DOMSource source = new DOMSource(document); // �����µ�DOM���������document����Ϊ��������ȥ
			
			OutputStream out = new FileOutputStream(path); // �ֽ���
			StreamResult result = new StreamResult(new OutputStreamWriter(out)); // OutputStreamWriter(out)���ֽ��������ַ���
			
			transformer.transform(source, result);
			 
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		ParseXMLDemo pd = new ParseXMLDemo();
		pd.getDom();
		pd.addEle();
		pd.showInfo();
	}
}
