 class ThreadX implements Runnable{
	 public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("value of i : "+i);
			}
		System.out.println("Existing from thread A....");
	}
}
class ThreadY implements Runnable{
	public void run() {
		for(int j=0;j<3;j++) {
			System.out.println("value of j : "+j);
		}
		System.out.println("Existing from thread B....");
	}
	
}
class ThreadZ implements Runnable{
	public void run() {
		for(int k=0;k<3;k++) {
			System.out.println("value of k : "+k);
		}
		System.out.println("Existing from thread C...");
	}
}
class Demonstration_6{
	public static void main(String args[]) {
		ThreadX a=new ThreadX();
		Thread t1=new Thread(a);
		ThreadY b=new ThreadY();
		Thread t2=new Thread(b);
		Thread t3 =new Thread(new ThreadZ());
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Multithreading has been completed");

		
	}
}