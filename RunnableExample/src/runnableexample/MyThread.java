package runnableexample;

public class MyThread implements Runnable {

	Thread thread;
	public MyThread(String threadName){
		
		thread = new Thread(this, threadName);
		
		//Priority is normal by default 
		//we can also set normal/minimum/maximum as priority
				
		if(threadName.equals("First Thread"))			
			thread.setPriority(Thread.MAX_PRIORITY);
		else
			thread.setPriority(Thread.MIN_PRIORITY);
		thread.start();
	}
	
	@Override
	public void run() {
		
		for(int i=1; i<=5; i++){	
			System.out.println(Thread.currentThread().getName() + ": " + i);
		} 
		
	}
	

}
