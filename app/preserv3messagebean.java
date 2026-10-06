package app ;
import app.*;
import javax.ejb.*;
import javax.jms.*;
import com.genexus.*;

public class preserv3messagebean implements MessageDrivenBean, MessageListener
{
   MessageDrivenContext sc;
   public void onMessage( Message msg )
   {
      com.genexus.GxEjbContext gxEjbContext = new com.genexus.GxEjbContext();
      com.genexus.Application.init(GXcfg.class);
      int remoteHandle = -1;
      ModelContext context = new ModelContext( app.preserv3.class );
      com.genexus.LocalUtil localUtil = com.genexus.Application.getConnectionManager().createUserInformation(com.genexus.db.Namespace.getNamespace(context.getNAME_SPACE())).getLocalUtil();
      if ( msg instanceof MapMessage )
      {
         MapMessage mm = (MapMessage) msg;
         try
         {
            String[] aP0 = new String[] {mm.getString("EmprCod")};
            String[] aP1 = new String[] {mm.getString("Prd1")};
            String[] aP2 = new String[] {mm.getString("Prd2")};
            preserv3 beanObject = new  preserv3 (com.genexus.GXProcedure.IN_NEW_UTL, context);
            beanObject.execute_int(aP0, aP1, aP2);
         }
         catch(JMSException e)
         {
            e.printStackTrace();
         }
      }
   }

   public void ejbCreate( )
   {
   }

   public void ejbRemove( )
   {
   }

   public void setMessageDrivenContext( MessageDrivenContext sc )
   {
      this.sc = sc;
   }

}

