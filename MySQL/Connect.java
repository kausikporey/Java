import java.sql.*;
public class Connect{
public static void main(String args[]){
Connection conn=null;
try{
String userName="root";
String password="1234";
String url="jdbc:mysql://localhost:3306/test";
Class.forName("com.mysql.jdbc.Driver").newInstance();
conn=DriverManager.getConnection(url,userName,password);
System.out.println("Database Connection Established");
}
catch(Exception e){
System.err.println("Cannot Connect to Database server : " +e);
} finally{
if(conn!= null){
try{
conn.close();
System.out.println("Database Connection terminated");
}catch(Exception e){}
}
}
}
}

