public class Producer implements Runnable {
	private Movie movie = null;
	private boolean flag = false;

	public Producer(Movie movie) {
		super();
		this.movie = movie;
	}

	public void run() {
		// ѭ��¼��50���Ӱ���ݣ�������Ӱ����¼��
		for (int i = 0; i < 50; i++) {
			if (flag) {
				this.movie.set("���ν��", "һ���ƻõ�Ӱ��");
				flag = false;
			} else {
				this.movie.set("��͵�̰�", "һ��3D������Ӱ��");
				flag = true;
			}
		}
	}
}
