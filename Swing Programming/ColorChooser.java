import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ColorChooser extends JFrame implements ActionListener{
JButton b;
Container c;
ColorChooser(){
b=new JButton("COLOR");
c=getContentPane();
c.add(b);
b.addActionListener(this);
c.setLayout(new FlowLayout());
}
public void actionPerformed(ActionEvent e){
Color initial=Color.RED;
Color color =JColorChooser.showDialog(this,"select a colour",initial);
c.setBackground(color);
}
public static void main(String args[]){
ColorChooser ch=new ColorChooser();
ch.setSize(400,400);
ch.setVisible(true);
ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}

