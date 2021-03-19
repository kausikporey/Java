import javax.swing.*;
public class Slider extends JFrame{
public static void main(String args[]){
	Slider s2=new Slider();
	s2.setVisible(true);
	s2.pack();
}
Slider(){
JPanel p=new JPanel();
JSlider s=new JSlider(JSlider.HORIZONTAL,0,50,20);
p.add(s);
add(p);
}
}