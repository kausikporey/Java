import java.awt.*;
public class ScrollbarExample{
public static void main(String args[]){
Frame f=new Frame("Frame");
Scrollbar s=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,100);
Scrollbar v=new Scrollbar(Scrollbar.VERTICAL,0,30,0,100);
f.add(v);
f.add(s);
s.setBounds(20,50,400,50);
v.setBounds(20,200,50,400);
f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);
}
}