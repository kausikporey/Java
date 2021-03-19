class Animal{
	void eat() {System.out.println("Eating.....");}
}
	class Dog extends Animal{
		void eat() {System.out.println("Eating Bread....");}
		void bark() {System.out.println("Eating bark...");}
		void work() { 
			eat();
		    bark();
			super.eat();
	}
	}
		class SuperClass{
			public static void main(String args[]) {
				Dog d=new Dog();
				d.work();
			}
		}