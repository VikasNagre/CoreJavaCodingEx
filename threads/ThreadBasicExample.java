package threads;

import java.util.Iterator;

public class ThreadBasicExample {
	
	public static void main(String[] args) {
		System.out.println("Main "+Thread.currentThread());
		
		ThreadA threadAObj = new ThreadA();
		threadAObj.start();
		
		ThreadRunnable threadObj = new ThreadRunnable();
		threadObj.run();
	}
}


class ThreadA extends Thread{
	@Override
	public void run() {
		System.out.println("ThreadA"+ThreadA.currentThread());
		for (int i=20;i>0;i--) {
		System.out.println("ThreadA class with i "+i);
		}
	}
}

class ThreadRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ThreadRunnable "+Thread.currentThread());
		for (int i=20;i>0;i--) {
			System.out.println("ThreadA class with i "+i);
			
	}
	
}


}
