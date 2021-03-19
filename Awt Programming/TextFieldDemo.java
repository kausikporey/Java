import java.awt.*;
public class TextFieldDemo{
public static void main(String args[]){
Frame f=new Frame("Frame");
TextField t1=new TextField("My Name is Kausik Porey");
TextField t2=new TextField("My Age Is 21");
TextArea ta=new TextArea("Welcome to java my Friends");
f.add(ta);
f.add(t1);
f.add(t2);
f.setSize(500,500);
ta.setBounds(150,400,100,50);
t1.setBounds(150,200,200,50);
t2.setBounds(150,250,100,50);
f.setLayout(null);
f.setVisible(true);
}
}