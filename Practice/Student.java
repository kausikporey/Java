import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Student{
JLabel l1,l2,l3,l4,l5;
JFrame f;
JButton b1,b2;
JTextField t1,t2,t3,t4;
Choice c;
Student(){
f=new JFrame("REGISTRATION FORM");
f.setSize(800,800);
f.setLayout(null);
f.setVisible(true);
l1=new JLabel("Name : ");
l1.setBounds(50,50,100,30);
l2=new JLabel("Department : ");
l2.setBounds(50,100,100,20);
l3=new JLabel("Semester : ");
l3.setBounds(50,200,100,20);
l4=new JLabel("Roll No. : ");
l4.setBounds(50,250,150,20); 
l5=new JLabel("Gender : ");
l5.setBounds(50,300,100,20);
b1=new JButton("Submit");
b1.setBounds(100,400,100,30);
b2=new JButton("Cancel");
b2.setBounds(300,400,100,30);
c=new Choice();
c.add("Male");
c.add("Female");
c.add("Others");
c.setBounds(200,300,70,30);
t2=new JTextField();
t3=new JTextField();
t1=new JTextField();
t4=new JTextField();
t1.setBounds(200,50,150,30);
t2.setBounds(200,100,150,30);
t3.setBounds(200,200,150,30);
t4.setBounds(200,250,150,30);
f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(b1);f.add(b2);f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(c);f.add(l5);
b1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	JPanel p=new JPanel();
	p.setBackground(Color.yellow);
	JLabel l=new JLabel();
	p.add(l);
	f.add(p);
	p.setBounds(500,100,200,300);
    l.setBounds(50,50,200,50);
	l.setBackground(Color.white);
	String name = "Name : "+t1.getText().toString();
	name += " , Gender : "+c.getSelectedItem().toString();
	l.setText(name);
	
}
});
b2.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	t1.setText(null);
	t2.setText(null);
	t3.setText(null);
	t4.setText(null);
}
});
}
public static void main(String args[]){
	new Student();
}
}