import javax.swing.*;
public class ComboBox{
public static void main(String args[]){
JFrame f=new JFrame();
f.setSize(300,300);
f.setVisible(true);
f.setLayout(null);
String country[]={"India","Australia","Japan","USA","Pakistan"};
JComboBox cb=new JComboBox(country);
f.add(cb);
cb.setBounds(100,100,100,50);
}
}