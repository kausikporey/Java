import java.awt.event.*;
import javax.swing.*;
public class PasswordUsername{
public static void main(String args[]){
JFrame f1=new JFrame("Username");
f1.setSize(300,300);
f1.setLayout(null);
f1.setVisible(true);
final JLabel label=new JLabel();
label.setBounds(20,150,300,75);
JLabel l1=new JLabel("USERNAME : ");
l1.setBounds(20,20,80,30);
JLabel l2=new JLabel("PASSWORD : ");
l2.setBounds(20,75,80,30);
JButton b=new JButton("LogIn");
b.setBounds(100,120,80,30);
JTextField t=new JTextField();
t.setBounds(100,20,100,30);
final JPasswordField p=new JPasswordField();
p.setBounds(100,75,100,30);

f1.add(b);
f1.add(label);
f1.add(l1);
f1.add(l2);
f1.add(p);
f1.add(t);
b.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e){
		String data="Username : "+t.getText();
		data +=",  Password : "+new String(p.getPassword());
		label.setText(data);
	}
});
}
}