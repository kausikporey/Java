import java.util.Scanner;
class ScannerDemo{
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st no = ");
		int n1,n2;
		n1=s.nextInt();
		System.out.println("Enter 2nd no = ");
		n2=s.nextInt();
		System.out.println("The Sum of this two no = "+(n1+n2));
		}
	
}