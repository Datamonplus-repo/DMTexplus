package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttranspww", "/app.ficherosbasicos.ttranspww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttranspww extends GXWebObjectStub
{
   public ttranspww( )
   {
   }

   public ttranspww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttranspww.class ));
   }

   public ttranspww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttranspww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttranspww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " TRANSPORTISTAS";
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

