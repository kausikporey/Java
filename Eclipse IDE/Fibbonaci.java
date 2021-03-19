import java.util.Scanner;
class Fibbonaci{
	int x;
	int f(int x) {
		if (x==0)
			return (0);
		else if(x==1)
			return (1);
		else
			return (f(x-1)+f(x-2));
	}
	public static void main(String args[]) {
		Scanner s=new Scanner (System.in);
		Fibbonaci n = new Fibbonaci ();
	    System.out.println("Enter the value  =  ");
	    n.x=s.nextInt();
	    for(int i=0;i<=n.x;i++) {
	    System.out.println(n.f(i));
	    }
}
}