import javax.swing.*;
import java.awt.*;
public class ImageIconButton{
public static void main(String args[]){
JButton b=new JButton(new ImageIcon("D:\\kp.png"));
JFrame f=new JFrame("Image Icon Frame");
f.add(b);
f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);
b.setBounds(130,130,50,65);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}

