package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.totif", "/app.totif"})
@jakarta.servlet.annotation.MultipartConfig
public final  class totif extends GXWebObjectStub
{
   public totif( )
   {
   }

   public totif( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( totif.class ));
   }

   public totif( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new totif_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new totif_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "OTIF";
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

