import java.awt.*;
import java.applet.Applet;
public class InteractiveApplet extends Applet{
TextField A,B;
public void init(){
A=new TextField(2);
B=new TextField(2);
add(A);
add(B);
A.setText("0");
B.setText("0");
}
public void paint(Graphics g){
int x=0,y=0,z=0;
String s;
s=A.getText();x=Integer.parseInt(s);
s=B.getText();y=Integer.parseInt(s);
z=x+y;
s=String.valueOf(z);
g.drawString("Enter Two Number",10,100);
g.drawString("The Sum Of This Two Number Is : ",10,120);
g.drawString(s,100,260);
}
}
/*
<html>
<body>
<applet code="InteractiveApplet.class" width=300 height=300>
</applet>
</body>
</html>
*/
