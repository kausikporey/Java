import java.awt.*;
public class ChoiceExample{
public static void main(String args[]){
Frame f=new Frame("Frame");
Choice c=new Choice();
c.add("Option 1");
c.add("option 2");
c.add("option 3");
f.add(c);
c.setBounds(200,200,100,100);
f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);
}
}