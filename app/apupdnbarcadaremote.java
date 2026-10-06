package app ;
import app.*;
import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface apupdnbarcadaremote extends EJBObject
{
   public void execute( ) throws RemoteException
   ;
}

