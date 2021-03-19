import java.io.*;
import java.net.*;
public class URLClass{
public static void main(String args[]){
try{
URL url =new URL("https://nptel.ac.in/course.php");
System.out.println("Protocol: "+url.getProtocol());
System.out.println("Host: "+url.getHost());
System.out.println("Port: "+url.getPort());
System.out.println("File: "+url.getFile());
}
catch(Exception e){
System.out.println(e);
}
}
}

