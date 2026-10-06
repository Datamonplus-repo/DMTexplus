package app ;
import app.*;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface apupdnbarcadahome extends EJBHome
{
   apupdnbarcadaremote create( ) throws RemoteException, CreateException
   ;
}

