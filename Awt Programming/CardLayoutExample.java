import java.awt.*;
import java.applet.Applet;
public class CardLayoutExample extends Applet{
CardLayout c;
public void init(){
c=new CardLayout();
setLayout(c);
Button b1=new Button("Card1");
Button b2=new Button("Card2");
Button b3=new Button("Card3");
Button b4=new Button("Card4");
Button b5=new Button("Card5");
add("1",b1);
add("2",b2);
add("3",b3);
add("4",b4);
add("5",b5);
}
public boolean keyDown(Event e,int key){
c.next(this);
return(true);
}
}
/*
<html>
<body>
<applet code="CardLayoutExample.class" width=300 height=300>
</applet>
</body>
</html>
*/