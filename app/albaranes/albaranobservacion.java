package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranes.albaranobservacion", "/app.albaranes.albaranobservacion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class albaranobservacion extends GXWebObjectStub
{
   public albaranobservacion( )
   {
   }

   public albaranobservacion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( albaranobservacion.class ));
   }

   public albaranobservacion( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new albaranobservacion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new albaranobservacion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Guias / Observación";
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

