package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.tpedidoview", "/app.comprasquimicos.tpedidoview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpedidoview extends GXWebObjectStub
{
   public tpedidoview( )
   {
   }

   public tpedidoview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpedidoview.class ));
   }

   public tpedidoview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpedidoview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpedidoview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPEDIDOView";
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

