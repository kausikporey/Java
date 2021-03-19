import java.awt.*;
import java.awt.event.*;
public class ShowStatus extends Frame implements MouseListener{
Label l1;
ShowStatus(){
addMouseListener(this);
l1=new Label();
l1.setBounds(100,100,100,30);
add(l1);
setLayout(null);
setVisible(true);
setSize(300,300);
}
public void mouseClicked(MouseEvent e){l1.setText("Mouse Clicked");}
public void mouseEntered(MouseEvent e){l1.setText("Mouse Entered");}
public void mouseDragged(MouseEvent e){l1.setText("Mouse Dragged");}
public void mouseMoved(MouseEvent e){l1.setText("Mouse Moved");}
public void mouseExited(MouseEvent e){l1.setText("Mouse Exited");}
public void mouseReleased(MouseEvent e){l1.setText("Mouse Released");}
public void mousePressed(MouseEvent e){l1.setText("Mouse Pressed");}
public static void main(String[] args){
	new ShowStatus();
}
}
