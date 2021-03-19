import java.awt.*;
public class CheckBox{
	CheckBox(){
Frame f=new Frame("My Frame");
Checkbox c1=new Checkbox("Java");
Checkbox c2=new Checkbox("Python",true);
c1.setBounds(20,30,50,50);
c2.setBounds(20,100,50,50);
f.resize(500,500);
f.add(c1);
f.add(c2);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String args[]){
	new CheckBox();
}
}