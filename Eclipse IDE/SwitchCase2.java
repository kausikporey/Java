import java.util.Scanner;
class D{
	public static void main(String args[]) {
	int n,i,p;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Your Number : ");
	n=s.nextInt();
	{
	if(n<30)
		i=1;
	else if(n<60 & n>30)
		i=2;
	else if(n<80 & n>60)
		i=3;
	else if(n<100 & n>80)
		i=4;
	else 
		i=5;
	}
	switch(i)
	{
	case 1:
		System.out.println("No");
		break;
	case 2:
		System.out.println("Yes");
		break;
	case 3:
		System.out.println("Maybe");
		break;
	case 4:
		System.out.println("Never");
		break;
	case 5:
		System.out.println("Later");
		break;
		}
	}
	
}