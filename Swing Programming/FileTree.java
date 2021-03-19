import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class FileTree{
public static void main(String args[]){
JFrame f=new JFrame();
f.setSize(500,500);
f.setVisible(true);
DefaultMutableTreeNode style=new DefaultMutableTreeNode("STYLE");
DefaultMutableTreeNode colour=new DefaultMutableTreeNode("Colour");
DefaultMutableTreeNode font=new DefaultMutableTreeNode("Font");
style.add(colour);
style.add(font);
DefaultMutableTreeNode red=new DefaultMutableTreeNode("RED");
DefaultMutableTreeNode white=new DefaultMutableTreeNode("WHITE");
DefaultMutableTreeNode blue=new DefaultMutableTreeNode("BLUE");
DefaultMutableTreeNode bolt=new DefaultMutableTreeNode("BOLT");
DefaultMutableTreeNode italic=new DefaultMutableTreeNode("ITALIC");
JTree jt=new JTree(style);
colour.add(red);
colour.add(white);
colour.add(blue);
font.add(bolt);
font.add(italic);
f.add(jt);
}
}
