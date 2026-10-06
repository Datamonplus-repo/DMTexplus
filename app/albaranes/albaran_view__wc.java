package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranes.albaran_view__wc", "/app.albaranes.albaran_view__wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class albaran_view__wc extends GXWebObjectStub
{
   public albaran_view__wc( )
   {
   }

   public albaran_view__wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( albaran_view__wc.class ));
   }

   public albaran_view__wc( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new albaran_view__wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new albaran_view__wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Detalle";
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

