abstract class Base{
	void fun() {System.out.println("Base class constructor is called");
}
}
	class Derived extends Base{
		Derived(){
			System.out.println("Derived class constructor is called");}
		    void fun() {System.out.println("fun method from Derived class is called");}
	}
	class AbstractClass{
		public static void main(String args[]) {
			Derived d=new Derived();
			d.fun();
		}
	}