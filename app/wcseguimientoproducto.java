package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcseguimientoproducto", "/app.wcseguimientoproducto"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcseguimientoproducto extends GXWebObjectStub
{
   public wcseguimientoproducto( )
   {
   }

   public wcseguimientoproducto( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcseguimientoproducto.class ));
   }

   public wcseguimientoproducto( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcseguimientoproducto_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcseguimientoproducto_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seguimiento Pedidos por Producto";
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

