import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {
    public String getNamespace(String prefix) throws RemoteException;
}