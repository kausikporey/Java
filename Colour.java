import java.applet.*;
import java.awt.*;
public class Colour extends Applet{
String msg;
public void init(){
setBackground(Color.green);
setForeground(Color.red);
msg ="Starting Init Method   ";
}
public void start(){
msg +="Starting Start Method  ";
}
public void paint(Graphics g){
msg +="Starting Paint Method.";
g.drawString(msg,10,30);
}
}
