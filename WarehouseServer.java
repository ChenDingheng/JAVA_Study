import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.RemoteServer;
import javax.naming.*;

/**
 * This server program instantiates a remote warehouse object, registers it with the naming
 * service, and waits for clients to invoke methods.
 * @version 1.12 2007-10-09
 * @author Cay Horstmann
 */
public class WarehouseServer
{
    public static void main(String[] args) throws RemoteException, NamingException, MalformedURLException {
        System.out.println("Constructing server implementation...");
        WarehouseImpl centralWarehouse = new WarehouseImpl();

        System.out.println("Binding server implementation to registry...");
        //Context namingContext = new InitialContext();

        LocateRegistry.createRegistry(8807);
        //System.setProperty("java.rmi.server.hostname","10.22.75.185");
        //namingContext.rebind("//localhost:8807/central_warehouse", centralWarehouse);
        Naming.rebind("//localhost:8807/central_warehouse", centralWarehouse);

        System.out.println("Waiting for invocations from clients...");
    }
}