//program for client application
import java.rmi.Naming;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class ClientRequest
{
    public static void main(String args[])
    {
    	System.out.println("Please enter a name:");
        String answer,value; // value = userinput
        Scanner sc = new Scanner(System.in);
        value = sc.next();
        try
        {
            // lookup method to find reference of remote object
            Search access =
                (Search)Naming.lookup("rmi://localhost:5002"+"/CPE545"); //Change based on Faris
            List<String> list = access.query(value);
        	Iterator<String> iter = list.iterator();
        	System.out.println("Students name(s):");
        	while(iter.hasNext()) {
        		answer = iter.next();      		
        		System.out.println(value + " " + answer);
        	}
        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }
    }
}