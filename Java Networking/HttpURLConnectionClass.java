import java.io.*;
import java.net.*;
public class HttpURLConnectionClass{
public static void main(String args[]){
try{
URL url =new URL("https://nptel.ac.in/course.php");
HttpURLConnection huc=(HttpURLConnection)url.openConnection();
for(int i=1;i<8;i++)
System.out.println(huc.getHeaderFieldKey(i) +"=" +huc.getHeaderField(i));
}
catch(Exception e){
System.out.println(e);
}
}
}

