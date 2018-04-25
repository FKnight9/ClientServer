// Java program to implement the Search interface
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class SearchQuery extends UnicastRemoteObject
                         implements Search
{
    // Default constructor to throw RemoteException
    // from its parent constructor
	private List<Student> list;
    SearchQuery() throws RemoteException
    {
        super();
        list = listStudents();
    }
    
    private String[] Students = new String[]{"Rahul","Arora","Xinqi","Bao","Thomas","Burrell","Siyu","Chen","Athina","Cordero","Priyanka","Dassani","Omkar","Desai","Yifan","Ding","Thomas","Falsone","Yubao","Geng","Manideep","Gillela","Aakanksha","Gokhe","Ao","Hu","Faris","Ibrahim","Bryan","Jimenez-Rojas","Xin","Li","Ziyue","Liu","Gary","Marshuetz","Divakar","Mer","Madjid","Mousavi","Shivam Patel","Svetlin","Pavlov","Shreyansh","Sharma","Carlos","Tejada","Juan","Vega","Oscar","Victorero","Yicong","Wang","Xuetong","Wei","Yongqi","Yan"};
    
    //List of Students
    private List<Student> listStudents(){
    	List<Student> list = new ArrayList<Student>();
    	
    	for(int i = 1; i < Students.length; i = i+2) {
    		Student student = new Student();
        	student.setFirstName(Students[i-1]);
        	student.setLastName(Students[i]);
        	list.add(student);
    	}
    	return list;
    }
 
    // Implementation of the query interface
    public List<String> query(String search)
                       throws RemoteException
    {
    	List<String> result = new ArrayList<String>();
    	Iterator<Student> iter = list.iterator();
    	while(iter.hasNext()) {
    		if(iter.next().getFirstName() == search) {
    			result.add(iter.next().getLastName());
    		}
    	}
        return result;
    }
}
