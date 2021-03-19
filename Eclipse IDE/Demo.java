class Account {
	public int balance;
	public int Account;
	public void display() {
		System.out.println("Account No : "+Account+ "   Balance : "+balance);
	}
	synchronized void withdraw(int amount) {
		balance=balance-amount;
		System.out.println("Your Withdrawal Balance is : "+amount);
		display();
	}
	synchronized void deposit(int amount) {
		balance=balance+amount;
		System.out.println("Your deposited balance is : "+amount);
		display();
	}
	
}
class TransectionDeposit implements Runnable{
	int amount;
	Account AccountX;
	TransectionDeposit(Account x,int amount){
		this.amount=amount;
		AccountX=x;
		new Thread(this).start();
	}
	public void run() {
		AccountX.deposit(amount);
	}
}
class TransectionWithdraw implements Runnable{
	Account AccountY;
	int amount;
	TransectionWithdraw(Account y,int amount){
		this.amount=amount;
		AccountY=y;
		new Thread(this).start();
	}
	public void run() {
		AccountY.withdraw(amount);
	}
}
class Demo{
	public static void main(String args[]) {
		Account ABC=new Account();
		ABC.balance=1100;
		ABC.Account=592901001;
		TransectionDeposit t1=new TransectionDeposit(ABC,600);
		TransectionWithdraw t2=new TransectionWithdraw(ABC,100);
	}
}