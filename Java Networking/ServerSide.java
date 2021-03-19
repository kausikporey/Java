import java.io.*;
import java.net.*;
public class ServerSide{
public static void main(String args []) throws IOException{
ServerSocket ss=new ServerSocket(3333);
Socket s=ss.accept();
DataInputStream dis=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
String str="",str2="";
while(!str.equals("stop"))
{
str=dis.readUTF();
System.out.println("Client Says:"+str);
str2=buf.readLine();
dout.writeUTF(str2);
dout.flush();
}
dout.close();
s.close();
ss.close();
}
}
