public class Balance {
	int balance;
	String name;
   public Balance(String n,int b){
		name=n;
		balance=b;
	}
	void show() {
	   System.out.println(name +" :  "+balance);
	}

}
