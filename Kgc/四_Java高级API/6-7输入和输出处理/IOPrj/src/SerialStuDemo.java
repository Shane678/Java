import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// ���л��ͷ����л�ѧ������
public class SerialStuDemo {
	public static void main(String[] args) {
		Student stu = new Student("С��", 17, "��", "123456");
		
		// ���������
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		
		// ����������
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		try {
			// ���л�
			fos = new FileOutputStream("D:\\JJSha\\student.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(stu);
			
			// �����л�
			fis = new FileInputStream("D:\\JJSha\\student.txt");
			ois = new ObjectInputStream(fis);
			Student stu1 = (Student)ois.readObject();
			System.out.println("�����л������Ϣ��" + stu1.getName() + "-" + stu1.getAge() + "-" + stu1.getGender() + "-" + stu1.getPassword());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
				
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
