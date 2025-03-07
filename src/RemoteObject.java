import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class RemoteObject extends UnicastRemoteObject implements RemoteInterface {

    protected RemoteObject() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello from the remote server!";
    }
}
