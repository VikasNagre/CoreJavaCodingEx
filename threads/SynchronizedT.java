package threads;

import threads.Sender.ThreadSend;

public class SynchronizedT {
	public static void main(String[] args) {
		Sender send = new Sender();
		
		ThreadSend s1 = new ThreadSend("Hii", send);
		ThreadSend s2 = new ThreadSend("bye", send);
			
			s1.start();
			s2.start();
		
		}

class Sender{
	public	synchronized void send(String msg) {
		System.out.println("\n"+msg+" sent");
	}
	
class ThreadSend extends Thread{
	
	private String msg;
	Sender sender;
	
	public ThreadSend(String msg, Sender sender) {
		this.msg=msg;
		this.sender=sender;
	}
}

	
}

	

}
