import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {

    public String exploit(int i) throws RemoteException;
    public String exploit2(boolean i) throws RemoteException;
    public String exploit3(int[] i) throws RemoteException;
    public String exploit4(String s) throws RemoteException;
    public String exploit5(Object o) throws RemoteException;

    public void exploit6(int i) throws RemoteException;
    public void exploit7(boolean i) throws RemoteException;
    public void exploit8(int[] i) throws RemoteException;
    public void exploit9(String s) throws RemoteException;
    public void exploit10(Object o) throws RemoteException;
}