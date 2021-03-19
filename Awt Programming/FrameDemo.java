import java.awt.*;
public class FrameDemo{
public static void main(String args[]){
Frame f=new Frame("Frame With Panel");
Panel p=new Panel();
f.resize(200,200);
f.setBackground(Color.blue);
f.setLayout(null);
p.resize(50,50);
p.setBackground(Color.red);
f.add(p);
f.setVisible(true);
}
}
