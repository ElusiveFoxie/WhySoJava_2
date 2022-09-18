
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class Server extends UnicastRemoteObject implements RMIInterface {
    private static final long serialVersionUID = 12L;
    protected Server() throws RemoteException {
        super();
    }
    @Override
    public String getNamespace(String prefix)throws RemoteException{
        return "EF{'1_kn0w_h0w_70_bru73f0rc3_r3m073_m37h0d5'}";
    }

    public static void main(String[] args){

        try {
            //System.setProperty("java.rmi.server.hostname","127.0.0.1");
            Registry rgsty = LocateRegistry.createRegistry(1888);
            //Naming.rebind("rmi://192.168.1.2/myObject",obj);
            rgsty.rebind("challenge_2", new Server());
            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}