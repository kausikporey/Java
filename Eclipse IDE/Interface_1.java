interface A{
	int i=100;
	void display();
}
interface B{
	int j=200;
	void display_2();
}
class Demo_3 implements A,B{
	public void display() {System.out.println("The value of i : "+i);}
	public void display_2() {System.out.println("The value of j : "+j);}
	}
class Interface_1 {
	public static void main(String args[]) {
		Demo_3 d=new Demo_3();
		d.display();
		d.display_2();
	}
}