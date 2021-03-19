import java.lang.*;
import java.util.Scanner;
import java.util.ArrayList;
public class SimpleArray{
	public static void main(String args[]){
		int sum=0;
		float avg=0;
		ArrayList<Integer> l=new ArrayList<Integer>();
		System.out.print("Enter Your Input  ");
		Scanner input=new Scanner(System.in);
		while(input.hasNextInt()) {
			l.add(input.nextInt());
	
}
		for(int i=0;i<l.size();i++)
		{
			sum=sum+l.get(i);
	    }
		avg=sum/l.size();
	System.out.println("Average Value "+avg);
}
}