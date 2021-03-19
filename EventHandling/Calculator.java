import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.TextField.*;
public class Calculator extends Applet implements ActionListener{
TextField t1,t2,t3;
Button b1,b2,b3,b4;
public void init(){
Label l1=new Label("First No: ",Label.RIGHT);
Label l2=new Label("Second No : ",Label.RIGHT);
Label l3=new Label("Result : ",Label.RIGHT);

t1=new TextField(3);
t2=new TextField(3);
t3=new TextField(3);

b1=new Button("ADD");
b2=new Button("SUBSTRACT");
b3=new Button("MULTIPLY");
b4=new Button("DIVISION");

add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);

add(b1);
add(b2);
add(b3);
add(b4);

t1.addActionListener(this);
t2.addActionListener(this);
t3.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
public void actionPerformed(ActionEvent ae){
String str=ae.getActionCommand();
float x,y,z=0;
String msg;

x=Float.parseFloat(t1.getText());
y=Float.parseFloat(t2.getText());

if(str.equals("ADD"))
   z=x+y;
if(str.equals("SUBSTRACT"))
   z=x-y;;
if(str.equals("MULTIPLY"))
  z=x*y;
if(str.equals("DIVISION"))
   z=x/y; 
   
msg=String.valueOf(z);
t3.setText(msg);
repaint();
}
public void paint(Graphics g){
}
}
/*
<html>
<body>
<applet code="Calculator.class" width=900 height=200>
</applet>
</body>
</html>
*/

   







