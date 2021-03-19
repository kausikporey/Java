import javax.swing.*;
public class RadioButton{
public static void main(String args[]){
JFrame f=new JFrame();
JRadioButton r1=new JRadioButton("A)Male");
JRadioButton r2=new JRadioButton("B)Female");
JRadioButton r3=new JRadioButton("C)Others");
r1.setBounds(30,50,100,20);
r2.setBounds(30,100,100,20);
r3.setBounds(30,150,100,20);
f.setSize(500,500);
f.add(r1);f.add(r2);f.add(r3);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
ButtonGroup bg=new ButtonGroup();
bg.add(r1);bg.add(r2);bg.add(r3);
}
}
