package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tclimarcasview", "/app.ficherosbasicos.tclimarcasview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclimarcasview extends GXWebObjectStub
{
   public tclimarcasview( )
   {
   }

   public tclimarcasview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclimarcasview.class ));
   }

   public tclimarcasview( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclimarcasview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclimarcasview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCLIMARCASView";
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

