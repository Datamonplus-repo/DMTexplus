package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranes.albaranguia", "/app.albaranes.albaranguia"})
@jakarta.servlet.annotation.MultipartConfig
public final  class albaranguia extends GXWebObjectStub
{
   public albaranguia( )
   {
   }

   public albaranguia( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( albaranguia.class ));
   }

   public albaranguia( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new albaranguia_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new albaranguia_impl(context).cleanup();
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

