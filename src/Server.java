import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            // Create remote object
            RemoteObject obj = new RemoteObject();

            // Start RMI registry
            Registry registry = LocateRegistry.createRegistry(1099);

            // Bind object to registry
            registry.rebind("HelloService", obj);

            System.out.println("RMI Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
