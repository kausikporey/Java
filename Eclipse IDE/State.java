 class ThreadI extends Thread{
	 public void run() {
		 System.out.println("Start Thread A  : ");
		for(int i=0;i<3;i++) {
			if (i==1)
				yield();
			System.out.println("value of i : "+i);
			}
		System.out.println("Existing from thread A....");
	}
}
class ThreadJ extends Thread{
	public void run() {
		System.out.println("Start Thread B  :  ");
		for(int j=0;j<5;j++) {
			if (j==2)
				stop();
			System.out.println("value of j : "+j);
		}
		System.out.println("Existing from thread B....");
	}
	
}
class ThreadK extends Thread{
	public void run() {
		System.out.println("Start Thread C  :  ");
		for(int k=0;k<4;k++) {
			if(k==2) {
				try {
					sleep(1000);
				}
				catch(Exception e) {
			}
			}
			System.out.println("value of k : "+k);
		}
		System.out.println("Existing from thread C...");
	}
}
class Demonstration_7{
	public static void main(String args[]) {
		ThreadI a=new ThreadI();
		ThreadJ b=new ThreadJ();
		ThreadK c=new ThreadK();
		a.start();
		b.start();
		c.start();
		System.out.println("Multithreading has been completed");

		
	}
}