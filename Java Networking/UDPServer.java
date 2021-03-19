import java.io.*;
import java.net.*;
public class UDPServer{
public static void main(String args[]) throws IOException {
DatagramSocket ds=new DatagramSocket(1234);
byte[] receive=new byte[65478];
DatagramPacket dp=null;
while(true){
dp=new DatagramPacket(receive,receive.length);
ds.receive(dp);
System.out.println("Client : "+data(receive));
if(data(receive).toString().equals("bye"))
{
System.out.println("client sent bye.....Exiting");
break;
}
receive=new byte[65478];
}
}
public static StringBuilder data(byte[] a){
if(a==null)
return null;
StringBuilder ret = new StringBuilder();
int i=0;
while(a[i] != 0)
{
	ret.append((char) a[i]);
	i++;
	}
	return ret;
}
}