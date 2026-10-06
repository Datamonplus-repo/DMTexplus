package app ;
import app.*;
import java.rmi.RemoteException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import com.genexus.*;

public class apupdnbarcadabean implements SessionBean
{
   SessionContext sc;
   public void execute( )
   {
      com.genexus.GxEjbContext gxEjbContext = new com.genexus.GxEjbContext();
      com.genexus.Application.init(GXcfg.class);
      ModelContext context = new ModelContext( app.apupdnbarcada.class );
      gxEjbContext.setSessionContext(sc);
      String userId;
      try
      {
         userId = sc.getCallerPrincipal().getName();
      }
      catch(IllegalStateException e)
      {
         userId = "";
      }
      gxEjbContext.setUserId(userId);
      context.setSessionContext(gxEjbContext);
      app.apupdnbarcada beanObject = new  app.apupdnbarcada (com.genexus.GXProcedure.IN_NEW_UTL, context);
      beanObject.execute();
   }

   public void PUpdNBarcadabean( )
   {
   }

   public void ejbCreate( )
   {
   }

   public void ejbRemove( )
   {
   }

   public void ejbActivate( )
   {
   }

   public void ejbPassivate( )
   {
   }

   public void setSessionContext( SessionContext sc )
   {
      this.sc = sc;
   }

}

