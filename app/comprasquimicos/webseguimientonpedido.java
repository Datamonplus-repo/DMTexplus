package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.webseguimientonpedido", "/app.comprasquimicos.webseguimientonpedido"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webseguimientonpedido extends GXWebObjectStub
{
   public webseguimientonpedido( )
   {
   }

   public webseguimientonpedido( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webseguimientonpedido.class ));
   }

   public webseguimientonpedido( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webseguimientonpedido_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webseguimientonpedido_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seguimiento p/Nº Pedido";
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

