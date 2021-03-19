import java.awt.*;
import java.applet.*;
public class Face extends Applet{
public void paint(Graphics g){
g.drawRect(50,50,12,45);
g.drawOval(100,50,50,100);
g.fillOval(50,150,50,20);
g.drawArc(200,200,100,50,30,20);
}
}
/*
<html>
<body>
<applet code="Face.class" width=500 height=500>
</applet>
</body>
</html>
*/