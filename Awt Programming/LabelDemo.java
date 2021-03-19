import java.awt.*;
public class LabelDemo{
public static void main(String args[]){
Frame f=new Frame("Frame");
Label l1=new Label("First label");
Label l2=new Label("Second label");
f.add(l1);
f.add(l2);
f.resize(500,500);
l1.setBounds(150,200,100,30);
l2.setBounds(150,250,100,30);
f.setLayout(null);
f.setVisible(true);
}
}