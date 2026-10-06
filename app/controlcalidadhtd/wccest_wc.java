package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.wccest_wc", "/app.controlcalidadhtd.wccest_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wccest_wc extends GXWebObjectStub
{
   public wccest_wc( )
   {
   }

   public wccest_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wccest_wc.class ));
   }

   public wccest_wc( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wccest_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wccest_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Estadisticas";
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

