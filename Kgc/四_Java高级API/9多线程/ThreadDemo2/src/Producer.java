
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
				this.movie.setName("���ν��");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.movie.setInfo("һ���ƻõ�Ӱ��");
				flag = false;
			} else {
				this.movie.setName("��͵�̰�");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.movie.setInfo("һ��3D������Ӱ��");
				flag = true;
			}
		}
	}

}
