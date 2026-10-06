package app ;
import app.*;
import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface preserv3remote extends EJBObject
{
   public RetPreserv3 execute( String inParm0 ,
                               String inParm1 ,
                               String inParm2 ) throws RemoteException
   ;
}

