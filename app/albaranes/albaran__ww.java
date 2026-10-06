package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranes.albaran__ww", "/app.albaranes.albaran__ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class albaran__ww extends GXWebObjectStub
{
   public albaran__ww( )
   {
   }

   public albaran__ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( albaran__ww.class ));
   }

   public albaran__ww( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new albaran__ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new albaran__ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Albaranes";
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

