package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranes.albaranguiafase__ww", "/app.albaranes.albaranguiafase__ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class albaranguiafase__ww extends GXWebObjectStub
{
   public albaranguiafase__ww( )
   {
   }

   public albaranguiafase__ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( albaranguiafase__ww.class ));
   }

   public albaranguiafase__ww( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new albaranguiafase__ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new albaranguiafase__ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Guia / Fases";
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

