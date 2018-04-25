//program for client application
import java.rmi.*;
import java.util.Scanner;
public class ClientRequest
{
    public static void main(String args[])
    {
        String answer,value; // value = userinput
        Scanner sc = new Scanner(System.in);
        value = sc.next();
        try
        {
            // lookup method to find reference of remote object
            Search access =
                (Search)Naming.lookup("rmi://155.246.140.51:5002"+"/CPE545"); //Change based on Faris
            answer = access.query(value);
            System.out.println("Students name(s) " + value +
                            " " + answer);
        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }
    }
}