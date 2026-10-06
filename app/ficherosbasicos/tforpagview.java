package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tforpagview", "/app.ficherosbasicos.tforpagview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tforpagview extends GXWebObjectStub
{
   public tforpagview( )
   {
   }

   public tforpagview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tforpagview.class ));
   }

   public tforpagview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tforpagview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tforpagview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TFORPAGView";
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

