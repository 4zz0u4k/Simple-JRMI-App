import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            // Locate the registry
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Lookup the remote object
            RemoteInterface stub = (RemoteInterface) registry.lookup("HelloService");

            // Invoke remote method
            String response = stub.sayHello();
            System.out.println("Response from server: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
