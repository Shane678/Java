import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// ҵ����
public class MemberDao {
	Scanner input = new Scanner(System.in);
	// ��֪����Ա�������ü��ϱ�����á�����ļ�����ֻ�л�Ա���÷��͡�ArrayList<>��������Ч
	List<Member> memberList = new ArrayList<Member>();

	// ��ʼ�˵�
	public void menu() {
		System.out.println("*************************��ӭ���볬�л�Ա����ϵͳ*************************");
		System.out.println("1.�����ۼ�       2.���ֶһ�       3.��ѯʣ�����       4.�޸�����       5.����       6.�˳�");
		System.out.println("*******************************************************************");
		System.out.print("��ѡ��");
	}

	public void start() {
		do {
			menu();
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				if (saveScore()) {
					System.out.println("�����ۼƳɹ���");
				} else {
					System.out.println("�����ۼ�ʧ�ܣ�");
				}
				continue;
			case 2:
				if (minusScore()) {
					System.out.println("���ֶһ��ɹ���");
				} else {
					System.out.println("���ֶһ�ʧ�ܣ�");
				}
				continue;
			case 3:
				showScore();
				continue;
			case 4:
				if (changePwd()) {
					System.out.println("�޸�����ɹ���");
				} else {
					System.out.println("�޸�����ʧ�ܣ�");
				}
				continue;
			case 5:
				register();
				continue;
			case 6:
				System.out.println("��л����ʹ�ã���ӭ�´�ʹ�ã�");
				break;
			default:
				System.out.println("���Ĳ�������������ѡ��");
				continue;
			}
			break;
		} while (true);
	}

	// ��ѯ��ǰ��Ա�Ƿ���ڣ����ݻ�Ա���ż�������Ҹû�Ա�Ƿ���ڣ������ڣ����ػ�Ա���󣻲����ڣ�����null��
	public Member hasMember(int cardId, String pwd) {
		for (Member member : memberList) {
			if (member.getCardId() == cardId && member.getPassword().equals(pwd)) {
				return member;
			} 
		}
		return null;
	}
	
	// �����ۼ�
	public boolean saveScore() {
		boolean flag;
		System.out.print("�������Ա���ţ�");
		int cardId = input.nextInt();
		System.out.print("���������룺");
		String pwd = input.next();
		Member member = hasMember(cardId, pwd);
		if (member != null) {
			System.out.print("���������˴ε����ѽ�1Ԫ��1�֣���");
			int score = input.nextInt();
			member.setScore(member.getScore() + score);
			flag = true;
		} else {
			System.out.println("��Ǹ���û�Ա�������ڣ��޷����֣�");
			flag = false;
		}
		return flag;
	}

	// ���ֶһ�
	public boolean minusScore() {
		boolean flag;
		System.out.print("�������Ա���ţ�");
		int cardId = input.nextInt();
		System.out.print("���������룺");
		String pwd = input.next();
		Member member = hasMember(cardId, pwd);
		if (member != null) {
			System.out.print("���������˴�������һ��Ļ��֣�");
			int score = input.nextInt();
			if (score <= member.getScore()) {
				member.setScore(member.getScore() - score);
				System.out.println("���˴ζһ���" + score / 100 * 0.1 + "Ԫ");
			} else {
				System.out.println("��Ǹ�����ֲ��㣬�޷��һ���");
			}
			flag = true;
		} else {
			System.out.println("��Ǹ���û�Ա�������ڣ��޷��һ����֣�");
			flag = false;
		}
		return flag;
	}

	// ��ѯʣ�����
	public void showScore() {
		System.out.print("�������Ա���ţ�");
		int cardId = input.nextInt();
		System.out.print("���������룺");
		String pwd = input.next();
		Member member = hasMember(cardId, pwd);
		if (member != null) {
			System.out.println("��Ա����\t����\tʣ�����\t��������");
			System.out.println(member.getCardId() + "\t" + member.getName() + "\t" + member.getScore() + "\t" + member.getRegisterDate());
		} else {
			System.out.println("��Ǹ���û�Ա�������ڣ��޷���ѯ��");
		}

	}

	// �޸�����
	public boolean changePwd() {
		// ������
		return false;
	}

	// �����������
	public int createId(){
		Random random = new Random();
		int cardId = random.nextInt(9999999);
		for (Member member : memberList) {
			// �������Ѵ��ڣ����������ɡ�
			if (member.getCardId() == cardId) {
				cardId = random.nextInt(9999999);
			}
		}
		
		return cardId;
	}
	
	// ����
	public void register() {
		Member member = new Member();
		System.out.print("������ע��������");
		member.setName(input.next());
		// ��Ա�����������
		int cardId = createId();
		member.setCardId(cardId);
		// ��֤�û�����������ȷ
		System.out.print("������ע�����룺");
		String pwd;
		boolean flag = true;
		do{
			pwd = input.next();
			if (pwd.length() < 6) {
				System.out.print("��Ա���벻��С��6λ�������������������룺");
				flag = false;
			} else {
				flag = true;
				member.setPassword(pwd);
			}
		}while(!flag);
		// ÿ��Ĭ�Ͽ���������100����
		member.setScore(100);
		// ��������
		Date date = new Date();
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		String sDate = formater.format(date);
		member.setRegisterDate(sDate);
		System.out.println("��ϲ������Ա����ͨ�ɹ���ϵͳ��������100���֣����Ļ�Ա����Ϊ��" + cardId);
		// �ѻ�Ա�ӵ���Ա������
		memberList.add(member);
	}

}
