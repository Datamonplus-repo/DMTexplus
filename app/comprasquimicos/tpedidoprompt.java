package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.tpedidoprompt", "/app.comprasquimicos.tpedidoprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpedidoprompt extends GXWebObjectStub
{
   public tpedidoprompt( )
   {
   }

   public tpedidoprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpedidoprompt.class ));
   }

   public tpedidoprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpedidoprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpedidoprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Pedido Proveedor";
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

