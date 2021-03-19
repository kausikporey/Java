 class ThreadA extends Thread{
	 public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("value of i : "+i);
			}
		System.out.println("Existing from thread A....");
	}
}
class ThreadB extends Thread{
	public void run() {
		for(int j=0;j<3;j++) {
			System.out.println("value of j : "+j);
		}
		System.out.println("Existing from thread B....");
	}
	
}
class ThreadC extends Thread{
	public void run() {
		for(int k=0;k<3;k++) {
			System.out.println("value of k : "+k);
		}
		System.out.println("Existing from thread C...");
	}
}
class ABCThread{
	public static void main(String args[]) {
		ThreadA a=new ThreadA();
		ThreadB b=new ThreadB();
		ThreadC c=new ThreadC();
		a.start();
		b.start();
		c.start();
		System.out.println("Multithreading has been completed");

		
	}
}