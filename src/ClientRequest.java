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
                (Search)Naming.lookup("rmi://155.246.211.160:5002"+"/CPE545"); //Change based on Faris
            List<String> list = access.query(value);
            if(list.size() == 0) {
            	System.out.println("No Names Found");
            }
            else {
	        	Iterator<String> iter = list.iterator();
	        	System.out.println("Students name(s):");
	        	while(iter.hasNext()) {
	        		answer = iter.next();      		
	        		System.out.println(value + " " + answer);
	        	}
            }
        }
           
        catch(Exception ae)
        {
            System.out.println(ae);
        }
    }
}