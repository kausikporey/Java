import java.util.Scanner;
class Gcd{
	int m,n;
	int gcd(int m,int n) {
		if(m>n) return gcd(n,m);
		if(m==0) return n;
		if(m==1) return 1;
		if(m==n)  return m;
		return gcd(m,n%m);
		}
	public static void main(String args[]) {
		Scanner s=new Scanner (System.in);
		Gcd z = new Gcd();
	    System.out.println("Enter the value of m  =  ");
	    z.m=s.nextInt();
	    System.out.println("Enter the value of n  =  ");
	    z.n=s.nextInt();
	    System.out.printf("GCD between %d and %d is %d",z.m,z.n,z.gcd(z.m,z.n));
}
}
