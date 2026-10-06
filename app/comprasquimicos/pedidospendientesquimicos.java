package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.pedidospendientesquimicos", "/app.comprasquimicos.pedidospendientesquimicos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pedidospendientesquimicos extends GXWebObjectStub
{
   public pedidospendientesquimicos( )
   {
   }

   public pedidospendientesquimicos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pedidospendientesquimicos.class ));
   }

   public pedidospendientesquimicos( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pedidospendientesquimicos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pedidospendientesquimicos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona PEDIDOS PROVEEDORES";
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

