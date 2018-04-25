// Creating a Search interface
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
public interface Search extends Remote
{
    // Declaring the method prototype
    public List<String> query(String search) throws RemoteException;
}