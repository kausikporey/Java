class Demo2{
	int x,y;
	void setPoint(int a,int b) {
	x=a;
	y=b;
}
}

class Java2{
	public static void main(String args[]) {
		Demo2 g=new Demo2();
		g.setPoint(15,20);
		System.out.println("x= "+g.x);
		System.out.println("y ="+g.y);
	}
}
