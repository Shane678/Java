
public class Consumer implements Runnable {
	private Movie movie = null;
	public Consumer(Movie movie) {
		super();
		this.movie = movie;
	}
	public void run() {
		// ѭ����ʾ50�ε�Ӱ��Ϣ
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.movie.get();
		}
	}

}
