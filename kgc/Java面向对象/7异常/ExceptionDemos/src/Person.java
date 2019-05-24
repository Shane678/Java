
public class Person {
	//��װ������˽�У�����������
	private String name;
	private int age;
	private String sex;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) throws GenderException { //throws�����������߱��ˣ��˷����׳����쳣
		if(sex.equals("��") || sex.equals("Ů")){
			this.sex = sex;
		}else{
			//�׳��Զ����쳣��throw������׳��쳣����һ������throw���ͱ���Ҫ��throws������try-catch��
			throw new GenderException("�Ա�ֻ��Ϊ��Ů��"); 
		}
	}

	//���������Ϣ
	public void print(){
		System.out.println(this.getName() + "-" + this.getSex() + "-" + this.getAge());
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		try{
			p.setSex("boy");
			p.print();
		}catch(GenderException e){
			e.printStackTrace();
		}
	}
}
