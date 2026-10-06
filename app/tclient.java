package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclient", "/app.tclient"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclient extends GXWebObjectStub
{
   public tclient( )
   {
   }

   public tclient( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclient.class ));
   }

   public tclient( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclient_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclient_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CLIENTES -";
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

