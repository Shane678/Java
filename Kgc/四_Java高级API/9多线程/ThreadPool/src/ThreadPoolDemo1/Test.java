package ThreadPoolDemo1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 使用newCachedThreadPool()方法创建线程池
 * @author Shane
 *
 */
public class Test {
	public static void main(String[] args) {
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		
		// 在线程池中执行10个任务
		for (int i = 0; i < 10; i++) {
			cachedThreadPool.execute(new MyRunnable(i));
			// 可以通过调整休眠时间来看到更多的线程执行，没有休眠后，执行时间变短，会有更多的线程参与进来。并且一个线程执行完一个任务后，随后还可能执行另一个任务，这样就可以不用再创建新的线程了。
			/*try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
	}
}

class MyRunnable implements Runnable {
	int num;
	public MyRunnable(int num) {
		super();
		this.num = num;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName() + ":" + num);
	}
	
}