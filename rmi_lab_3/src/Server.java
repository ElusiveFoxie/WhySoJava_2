
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
    public String exploit(int i) throws RemoteException {
        return "exploited";
    }

    @Override
    public String exploit2(boolean i) throws RemoteException {
        return "exploited";
    }

    @Override
    public String exploit3(int[] i) throws RemoteException {
        return "exploited";
    }

    @Override
    public String exploit4(String s) throws RemoteException {
        return "exploited";
    }

    @Override
    public String exploit5(Object o) throws RemoteException {
        return "exploited";
    }

    @Override
    public void exploit6(int i) throws RemoteException {
        System.out.println("test");
    }

    @Override
    public void exploit7(boolean i) throws RemoteException {
        System.out.println("test");
    }

    @Override
    public void exploit8(int[] i) throws RemoteException {
        System.out.println("test");
    }

    @Override
    public void exploit9(String s) throws RemoteException {
        System.out.println("test");
    }

    @Override
    public void exploit10(Object o) throws RemoteException {
        System.out.println("test");
    }


    public static void main(String[] args){

        try {
            System.setProperty("java.rmi.server.hostname","127.0.0.1");
            Registry rgsty = LocateRegistry.createRegistry(1888);
            rgsty.rebind("lab3", new Server());
            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }


}