abstract class Base_2{
	Base_2(){System.out.println("Base class constructor is called");}
	abstract void fun();
}

	class Derived_2 extends Base_2{
		Derived_2(){
			super();
			System.out.println("Derived class constructor is called");}
		    void fun() {System.out.println("fun method from Derived class is called");}
	}
	class AbstractClass_3{
		public static void main(String args[]) {
			Derived_2 d=new Derived_2();
			d.fun();
		}
	}