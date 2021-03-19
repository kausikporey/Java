class CircleA{
	double x,y,r;
	double area(){
		return 2*3.114*r;
	}
	double circumfurence(){
		return 3.114*r*r;
	}
	
}
class Box{
	double width,depth,height;
	double volume() {
		double v;
		v=(depth*width*height);
		return v;
			}
}
class MultiClass {
	public static void main(String args[]) {
	CircleA c=new CircleA();
	Box b=new Box();
	b.depth=5;
	b.height=6;
	b.width=6;
	c.x=0.0;
	c.y=0.0;
	c.r=1.23;
	System.out.println("Area=  " +c.area());
	System.out.println("Circumfurence=  "  +c.circumfurence());
	System.out.println("Volume =   "  +b.volume());
	
}
}