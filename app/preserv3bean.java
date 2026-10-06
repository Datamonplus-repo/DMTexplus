package app ;
import app.*;
import java.rmi.RemoteException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import com.genexus.*;

public class preserv3bean implements SessionBean
{
   SessionContext sc;
   public RetPreserv3 execute( String inParm0 ,
                               String inParm1 ,
                               String inParm2 )
   {
      String[] aP0 = new String[] {inParm0};
      String[] aP1 = new String[] {inParm1};
      String[] aP2 = new String[] {inParm2};
      com.genexus.GxEjbContext gxEjbContext = new com.genexus.GxEjbContext();
      com.genexus.Application.init(GXcfg.class);
      ModelContext context = new ModelContext( app.preserv3.class );
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
      app.preserv3 beanObject = new  app.preserv3 (com.genexus.GXProcedure.IN_NEW_UTL, context);
      beanObject.execute(aP0, aP1, aP2);
      RetPreserv3 retval = new RetPreserv3 ();
      retval.setEmprCod(aP0[0]);
      retval.setPrd1(aP1[0]);
      retval.setPrd2(aP2[0]);
      return retval ;
   }

   public void PReserv3bean( )
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

