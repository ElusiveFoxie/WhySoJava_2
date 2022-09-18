import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class Server extends UnicastRemoteObject implements RMIInterface {
    private static final long serialVersionUID = 1L;
    protected Server() throws RemoteException {
        super();
    }
    @Override
    public String getFlag() throws RemoteException{
        return "EF{'1_kn0w_h0w_70_port_forward'}";
    }

    public static void main(String[] args){
        try {
            System.setProperty("java.rmi.server.hostname","127.0.0.1");
            Registry rgsty = LocateRegistry.createRegistry(1888);
            rgsty.rebind("challenge", new Server());
            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}