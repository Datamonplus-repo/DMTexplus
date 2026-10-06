package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.penalizaciones_wc", "/app.facturacion.penalizaciones_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class penalizaciones_wc extends GXWebObjectStub
{
   public penalizaciones_wc( )
   {
   }

   public penalizaciones_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( penalizaciones_wc.class ));
   }

   public penalizaciones_wc( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new penalizaciones_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new penalizaciones_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Penalizaciones";
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

