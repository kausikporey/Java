import java.awt.*;
public class ListExample{
public static void main(String args[]){
Frame f=new Frame("Frame");
List l=new List(5);
l.add("Option 1");
l.add("option 2");
l.add("option 3");
f.add(l);
l.setBounds(200,200,100,100);
f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);
}
}