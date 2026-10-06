package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consumoprdquimicos_wc", "/app.consumoprdquimicos_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consumoprdquimicos_wc extends GXWebObjectStub
{
   public consumoprdquimicos_wc( )
   {
   }

   public consumoprdquimicos_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consumoprdquimicos_wc.class ));
   }

   public consumoprdquimicos_wc( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consumoprdquimicos_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consumoprdquimicos_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " ESTADISTICA DE PRODUCTOS";
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

