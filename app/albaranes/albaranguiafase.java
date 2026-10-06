package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranes.albaranguiafase", "/app.albaranes.albaranguiafase"})
@jakarta.servlet.annotation.MultipartConfig
public final  class albaranguiafase extends GXWebObjectStub
{
   public albaranguiafase( )
   {
   }

   public albaranguiafase( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( albaranguiafase.class ));
   }

   public albaranguiafase( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new albaranguiafase_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new albaranguiafase_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Guia / Fases";
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

