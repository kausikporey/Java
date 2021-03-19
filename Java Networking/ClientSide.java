import java.io.*;
import java.net.*;
public class ClientSide{
public static void main(String args []) throws IOException{
Socket s=new Socket("localhost",3333);
DataInputStream dis=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
String str="",str2="";
while(!str.equals("stop"))
{
str=buf.readLine();
dout.writeUTF(str);
dout.flush();
str2=dis.readUTF();
System.out.println("Server Says : "+str2);
}
dout.close();
s.close();
}
}
    