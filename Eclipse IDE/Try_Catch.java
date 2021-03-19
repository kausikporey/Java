public class Try_Catch{
	    static int f(int x,int y) {
		try {
				int a=x/y;
				return a;
			}
		catch(ArithmeticException e){
			System.out.println("Division By Zero");
		}
		return 0;
	}
		public static void main(String args[]) {
		int a=0;
		int b=0;
		int result;
		try{
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
		   }
		catch(Exception e) {
			System.out.println("Args Array store only two no:"+e);
		}
		result=f(a,b);
		System.out.println("Result : "+result);
}
}