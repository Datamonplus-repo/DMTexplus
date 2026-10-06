package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.webseguimientoproducto", "/app.comprasquimicos.webseguimientoproducto"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webseguimientoproducto extends GXWebObjectStub
{
   public webseguimientoproducto( )
   {
   }

   public webseguimientoproducto( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webseguimientoproducto.class ));
   }

   public webseguimientoproducto( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webseguimientoproducto_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webseguimientoproducto_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seguimiento p/Producto";
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

