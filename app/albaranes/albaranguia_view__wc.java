package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranes.albaranguia_view__wc", "/app.albaranes.albaranguia_view__wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class albaranguia_view__wc extends GXWebObjectStub
{
   public albaranguia_view__wc( )
   {
   }

   public albaranguia_view__wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( albaranguia_view__wc.class ));
   }

   public albaranguia_view__wc( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new albaranguia_view__wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new albaranguia_view__wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Guias";
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

