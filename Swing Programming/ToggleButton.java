import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ToggleButton extends JFrame implements ItemListener{
public static void main(String args[]){
	new ToggleButton();
}
private JToggleButton tb;
ToggleButton(){
setSize(300,300);
setVisible(true);
setJToggleButton();
setLayout(new FlowLayout());
setAction();
}
private void setJToggleButton(){
	tb=new JToggleButton("TRUE");
	add(tb);
}
private void setAction(){
tb.addItemListener(this);
}
public void itemStateChanged(ItemEvent eve){
if(tb.isSelected())
   tb.setText("TRUE");
else
   tb.setText("FALSE");
}
}
