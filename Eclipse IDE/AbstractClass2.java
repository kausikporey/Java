abstract class Bas {
	abstract void fun();
}
	class Derive extends Bas{
		//Derived2(){
			//System.out.println("Derived class constructor is called");}
		    void fun() {System.out.println("fun method from Derive class is called");}
	}
	class Deriv extends Bas{
		void fun() {
			System.out.println("fun method from Deriv class is called");
		}
	}
	class AbstractClass2{
		public static void main(String args[]) {
			Bas b=new Derive();
			Bas c=new Deriv();
			b.fun();
			c.fun();
		}
	}