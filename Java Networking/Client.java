import java.net.*;
import java.io.*;
public class Client{
public static void main(String args[]) throws IOException{
Socket s=new Socket("localhost",6666);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
dout.writeUTF("HELLO SERVER");
dout.flush();
dout.close();
s.close();
}
}
