//program for server application
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.*;
import java.rmi.registry.*;
public class SearchServer
{
    public static void main(String args[]) throws UnknownHostException
    {
    	String hostname = InetAddress.getLocalHost().getHostAddress();
    	System.out.println("this host IP is " + hostname);
        try
        {
            // Create an object of the interface
            // implementation class
            Search obj = new SearchQuery();
 
            // rmiregistry within the server JVM with
            // port number 1900
            LocateRegistry.createRegistry(5002);
 
            // Binds the remote object by the name
            // geeksforgeeks
            Naming.rebind("rmi://155.246.211.41:5002"+
                          "/CPE545",obj);
        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }
    }
}