// ��Ա��
public class Member {
	// ����  ��Ա����  ����  ����  ��������
	private String name;
	private int cardId;
	private String password;
	private int score;
	private String registerDate;
	
	public Member(){}
	public Member(String name, int cardId, String password, int score,
			String registerDate) {
		super();
		this.name = name;
		this.cardId = cardId;
		this.password = password;
		this.score = score;
		this.registerDate = registerDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	
}
