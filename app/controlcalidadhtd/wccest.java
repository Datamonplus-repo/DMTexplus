package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.wccest", "/app.controlcalidadhtd.wccest"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wccest extends GXWebObjectStub
{
   public wccest( )
   {
   }

   public wccest( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wccest.class ));
   }

   public wccest( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wccest_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wccest_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Est. Controles HTD";
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

