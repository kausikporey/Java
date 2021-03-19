class Circle{
	double x,y,r;
	double area(){
		return 2*3.114*r;
	}
	double circumfurence(){
		return 3.114*r*r;
	}
}
class CircleDemo {
	public static void main(String args[]) {
	Circle c=new Circle();
	c.x=0.0;
	c.y=0.0;
	c.r=1.23;
	System.out.println("Area=  " +c.area());
	System.out.println("Circumfurence=  "  +c.circumfurence());
}
}