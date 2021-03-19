class Abcd{
	int x,y;
	void setPoint() {
		x=10;
		y=20;
	}
}
class Java{
	public static void main(String args[]) {
		Abcd x=new Abcd();
		x.setPoint();
		System.out.println("x= "+x.x);
		System.out.println("y ="+x.y);
	}
}