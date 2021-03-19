import javax.swing.*;
public class Table{
public static void main(String args[]){
JFrame f=new JFrame();
f.setSize(300,400);
f.setVisible(true);
String data[][]={{"01","India","25"},{"02","Australia","65"},{"03","USA","27"}};
String column[]={"SL.No.","COUNTRY","RANK"};
JTable t=new JTable(data,column);
JScrollPane sp=new JScrollPane(t);
f.add(sp);
t.setBounds(30,40,200,300);
}
}