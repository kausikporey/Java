import javax.swing.*;
public class ProgressBar extends JFrame{
int i=0,num=0;
JProgressBar pb;
ProgressBar(){
pb=new JProgressBar(0,2000);
pb.setBounds(100,100,150,50);
pb.setValue(0);
add(pb);
setSize(300,400);
setLayout(null);
setVisible(true);
pb.setStringPainted(true);
}
public void iterate(){
while(i<=2000){
pb.setValue(i);
i=i+20;
try{Thread.sleep(150);}catch(Exception e){}
}
}
public static void main(String args[]){
ProgressBar b=new ProgressBar();
b.setVisible(true);
b.iterate();
}
}
