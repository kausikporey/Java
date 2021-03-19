import javax.swing.*;
public class TabbedPane{
public static void main(String args[]){
JFrame f=new JFrame();
f.setSize(300,300);
f.setVisible(true);
JTextArea ta=new JTextArea();
JPanel p1=new JPanel();
p1.add(ta);
JPanel p2=new JPanel();
JPanel p3=new JPanel();
JTabbedPane tp=new JTabbedPane();
tp.add("Main",p1);
tp.add("View",p2);
tp.add("Others",p3);
f.add(tp);
}
}

