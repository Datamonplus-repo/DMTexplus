package app ;
import app.*;
import javax.ejb.*;
import javax.jms.*;
import com.genexus.*;

public class apupdnbarcadamessagebean implements MessageDrivenBean, MessageListener
{
   MessageDrivenContext sc;
   public void onMessage( Message msg )
   {
      com.genexus.GxEjbContext gxEjbContext = new com.genexus.GxEjbContext();
      com.genexus.Application.init(GXcfg.class);
      int remoteHandle = -1;
      ModelContext context = new ModelContext( app.apupdnbarcada.class );
      com.genexus.LocalUtil localUtil = com.genexus.Application.getConnectionManager().createUserInformation(com.genexus.db.Namespace.getNamespace(context.getNAME_SPACE())).getLocalUtil();
      if ( msg instanceof MapMessage )
      {
         MapMessage mm = (MapMessage) msg;
         apupdnbarcada beanObject = new  apupdnbarcada (com.genexus.GXProcedure.IN_NEW_UTL, context);
         beanObject.execute_int();
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

