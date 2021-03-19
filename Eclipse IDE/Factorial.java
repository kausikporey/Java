import java.util.Scanner;
class Factorial{
	int x;
	int f(int x) {
		if (x==0)
		    return (1);
		else 
			return (x*f(x-1));
		}
	public static void main(String args[]) {
		Scanner s=new Scanner (System.in);
		Factorial n = new Factorial ();
	    System.out.println("Enter the value  =  ");
	    n.x=s.nextInt();
	    System.out.println("Result is  =  "+n.f(n.x));

	}
}