import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;


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

	// �����µ��ֻ�Ʒ����Ϣ���൱���޸�DOM����
	public void addNewPhone(){
		// ���XML��Ԫ��
		Element root = document.getRootElement();
		// ����<Brand>
		Element elBrand = root.addElement("Brand");
		elBrand.addAttribute("name", "��Ϊ");
		// ����<Type name="HW123">
		Element elType = elBrand.addElement("Type");
		elType.addAttribute("name", "HW123");
		
		saveXML("newInfo.xml");
	}
	
	// �޸Ľڵ�
	public void updatePhone() {
		// �ȰѸ�Ԫ���õ�
		Element root = document.getRootElement();
		Iterator eleBrands = root.elementIterator();
		int id = 0;
		while (eleBrands.hasNext()) {
			Element brand = (Element)eleBrands.next();
			id++;
			brand.addAttribute("id", id + "");
		}
		saveXML("newInfo.xml");
	}
	
	// �����޸ĵ�XML�ļ�
	public void saveXML(String path){
		// OutputFormat�൱��ת����
		OutputFormat format = OutputFormat.createPrettyPrint();
//		format.setEncoding("GBK");
//		XMLWriter writer = new XMLWriter(new OutputStreamWriter(new FileOutputStream(path)));
		format.setEncoding("GBK");
		XMLWriter writer = null;
		try {
			writer = new XMLWriter(new OutputStreamWriter(new FileOutputStream(path), "GBK"), format);
			writer.write(document);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// �ر������
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Dom4jDemo domDemo = new Dom4jDemo();
		domDemo.loadDocument();
//		domDemo.addNewPhone();
		domDemo.updatePhone();
		domDemo.showPhoneInfo();
	}
}
