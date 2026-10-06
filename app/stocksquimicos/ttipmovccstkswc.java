package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipmovccstkswc", "/app.stocksquimicos.ttipmovccstkswc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipmovccstkswc extends GXWebObjectStub
{
   public ttipmovccstkswc( )
   {
   }

   public ttipmovccstkswc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipmovccstkswc.class ));
   }

   public ttipmovccstkswc( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipmovccstkswc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipmovccstkswc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPMOVCCSTKSWC";
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

