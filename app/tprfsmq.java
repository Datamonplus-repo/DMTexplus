package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprfsmq", "/app.tprfsmq"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprfsmq extends GXWebObjectStub
{
   public tprfsmq( )
   {
   }

   public tprfsmq( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprfsmq.class ));
   }

   public tprfsmq( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprfsmq_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprfsmq_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PARAMETROS FASE-MAQUINA";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

