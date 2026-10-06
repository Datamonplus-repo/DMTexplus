package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipdefdefectopedidowc", "/app.ficherosbasicos.ttipdefdefectopedidowc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipdefdefectopedidowc extends GXWebObjectStub
{
   public ttipdefdefectopedidowc( )
   {
   }

   public ttipdefdefectopedidowc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipdefdefectopedidowc.class ));
   }

   public ttipdefdefectopedidowc( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipdefdefectopedidowc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipdefdefectopedidowc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPDEFDefecto Pedido WC";
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

