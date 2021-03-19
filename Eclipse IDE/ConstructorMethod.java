class ConstructorChecking{
	ConstructorChecking(){System.out.println("I am Your Constructor");
	}
}
class Constructor extends ConstructorChecking{
	public static void main(String args[]) {
		
		ConstructorChecking c=new ConstructorChecking();
	}
}
	