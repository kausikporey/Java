import javax.swing.*;
public class List{
public static void main(String args[]){
JFrame f=new JFrame();
f.setSize(300,400);
f.setVisible(true);
f.setLayout(null);
DefaultListModel<String> l=new DefaultListModel<>();
l.addElement("Item 1");
l.addElement("Item 2");
l.addElement("Item 3");
l.addElement("Item 4");
JList<String> l2=new JList<>(l);
l2.setBounds(50,50,50,100);
f.add(l2);
}
}