package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tlinprdview", "/app.ficherosbasicos.tlinprdview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tlinprdview extends GXWebObjectStub
{
   public tlinprdview( )
   {
   }

   public tlinprdview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tlinprdview.class ));
   }

   public tlinprdview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tlinprdview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tlinprdview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TLINPRDView";
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

