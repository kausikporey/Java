import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class KeyStatus extends Applet implements KeyListener{
String msg= "";
int X=10,Y=20;
public void init(){
addKeyListener(this);
requestFocus();
}
public void keyPressed(KeyEvent ke){showStatus("Key Down");}
public void keyReleased(KeyEvent ke){showStatus("Key Up");}
public void keyTyped(KeyEvent ke){ 
msg += ke.getKeyChar();
repaint();}
public void paint(Graphics g){
g.drawString(msg,X,Y);
}
}
/* 
<html>
<body>
<applet code="KeyStatus.class" width=300 height=300>
</applet>
</body>
</html>
*/
