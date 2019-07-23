import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

// ʹ��DOM����XML�ļ�
public class ParseXMLDemo {
	// ���ղ���Ϣ.xml����Ӧ��Document����
	private Document document;
	
	// ���DOM�������Document����
	public void getDemo() {
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
}
