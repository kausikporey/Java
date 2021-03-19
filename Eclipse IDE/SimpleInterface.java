 interface anInterface{
	int i=10;
	void display();
}
class Interface implements anInterface{
	public void display() {
		System.out.println("I am the display in Interface");
		
	}
	public static void main(String args[]) {
		Interface i=new Interface();
		i.display();
		System.out.println("The value of i : "+i.i);
	}
}
