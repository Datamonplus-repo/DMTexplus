package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.tccdefvar", "/app.controlcalidadhtd.tccdefvar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tccdefvar extends GXWebObjectStub
{
   public tccdefvar( )
   {
   }

   public tccdefvar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tccdefvar.class ));
   }

   public tccdefvar( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tccdefvar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tccdefvar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCCDef Var";
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

