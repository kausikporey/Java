import java.applet.Applet;
import java.awt.Graphics;
public class ParameterPassing extends Applet{
int Age;
int Class;
String Name;
public void start(){
Age=Integer.parseInt(getParameter("Age"));
Class=Integer.parseInt(getParameter("Class"));
Name=getParameter("Name");
}
public void paint(Graphics g){
g.drawString("Age : "+Age,120,95);
g.drawString("Name : "+Name,120,80);
g.drawString("Class : "+Class,120,110);
}
}
/*
<html>
<body>
<applet code="ParameterPassing.class" width="300" height="300">
<param name=Name value="Kausik">
<param name=Age value="41">
<param name=Class value ="6">
</applet>
</body>
</html>
*/