import javax.swing.*;
public class SpinnerExample{
public static void main(String args[]){
JFrame f=new JFrame();
f.setSize(300,300);
f.setVisible(true);
f.setLayout(null);
SpinnerModel m=new SpinnerNumberModel(2,1,20,0.1);//initial,min,max,range
JSpinner s=new JSpinner(m);
f.add(s);
s.setBounds(50,100,50,50);
}
}

