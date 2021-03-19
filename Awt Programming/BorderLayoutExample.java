import java.awt.*;
public class BorderLayoutExample{
public static void main(String args[]){
Frame f=new Frame("Frame");
f.setSize(400,400);
f.setVisible(true);
Button b1=new Button("NORTH");
Button b2=new Button("SOUTH");
Button b3=new Button("WEST");
Button b4=new Button("EAST");
Button b5=new Button("CENTRE");
f.add(b1,BorderLayout.NORTH);
f.add(b2,BorderLayout.SOUTH);
f.add(b3,BorderLayout.WEST);
f.add(b4,BorderLayout.EAST);
f.add(b5,BorderLayout.CENTER);
}
}


