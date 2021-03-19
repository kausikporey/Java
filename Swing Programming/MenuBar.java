import javax.swing.*;
public class MenuBar{
public static void main(String args[]){
JFrame f=new JFrame();
f.setSize(600,600);
f.setVisible(true);
JMenu menu=new JMenu("MENU");
JMenu submenu=new JMenu("SUBMENU");
JMenuBar mb=new JMenuBar();
JMenuItem i1,i2,i3,i4;
i1=new JMenuItem("Item1");
i2=new JMenuItem("Item2");
i3=new JMenuItem("Item3");
i4=new JMenuItem("Item4");
menu.add(i1);
menu.add(i2);
menu.add(i3);
submenu.add(i4);
menu.add(submenu);
mb.add(menu);
f.add(mb);
}
}
