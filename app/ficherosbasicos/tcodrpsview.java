package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tcodrpsview", "/app.ficherosbasicos.tcodrpsview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcodrpsview extends GXWebObjectStub
{
   public tcodrpsview( )
   {
   }

   public tcodrpsview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcodrpsview.class ));
   }

   public tcodrpsview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcodrpsview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcodrpsview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCODRPSView";
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

