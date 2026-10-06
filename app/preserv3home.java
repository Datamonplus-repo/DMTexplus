package app ;
import app.*;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface preserv3home extends EJBHome
{
   preserv3remote create( ) throws RemoteException, CreateException
   ;
}

