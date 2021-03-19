package p1;

public class MyThirdClass
{
	public static void main(String args[])
	{
		int a[][]=new int [2][3];
		int i,j;
		for(i=0;i<2;i++)
			for(j=0;j<3;j++)
				a[i][j]= i * j;
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j] + "   ");
			}
			System.out.println();
		}
	}
}
