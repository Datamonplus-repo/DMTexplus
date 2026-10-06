package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.tpedidogeneral", "/app.comprasquimicos.tpedidogeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpedidogeneral extends GXWebObjectStub
{
   public tpedidogeneral( )
   {
   }

   public tpedidogeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpedidogeneral.class ));
   }

   public tpedidogeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpedidogeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpedidogeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPEDIDOGeneral";
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

