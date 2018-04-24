import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	 public static void main(String args[]) throws UnknownHostException, IOException
	 {
		 // int number, temp;
		 String Name, temp;
		 Scanner sc = new Scanner(System.in);
		 Socket s = new Socket("127.0.0.1",1234);
		 Scanner sc1 = new Scanner(s.getInputStream());
		 System.out.println("Enter any Name");
		 // For CPE 545 project, just change this to name
		 
		 // number = sc.nextInt();
		 Name = sc.next();
		 //will have to edit this to accept string
		 PrintStream p = new PrintStream(s.getOutputStream());
		 // p.println(number);
		 p.println(Name);
		 //creates socket, takes number from user, prints number
		 // temp = sc1.nextInt();
		 temp = sc1.next();
		 System.out.println(temp);
	 }
}
