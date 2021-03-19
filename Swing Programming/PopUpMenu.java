import javax.swing.*;
import java.awt.event.*;
public class PopUpMenu{
public static void main(String args[]){
 final JFrame f=new JFrame();
f.setSize(400,500);
f.setLayout(null);
f.setVisible(true);
final JPopupMenu p=new JPopupMenu();
JMenuItem i1,i2,i3,i4;
i1=new JMenuItem("Cut");
i2=new JMenuItem("Copy");
i3=new JMenuItem("Paste");
i4=new JMenuItem("Edit");
p.add(i1);
p.add(i2);
p.add(i3);
p.add(i4);
f.addMouseListener(new MouseAdapter(){
public void mouseClicked(MouseEvent e){
p.show(f,e.getX(),e.getY());
}
});
}
}