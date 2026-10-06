package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcpedco", "/app.tcpedco"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcpedco extends GXWebObjectStub
{
   public tcpedco( )
   {
   }

   public tcpedco( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcpedco.class ));
   }

   public tcpedco( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcpedco_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcpedco_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PEDIDOS COMERCIALES";
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

