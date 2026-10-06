package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.controlcalidadnotificacionww", "/app.controlcalidadhtd.controlcalidadnotificacionww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlcalidadnotificacionww extends GXWebObjectStub
{
   public controlcalidadnotificacionww( )
   {
   }

   public controlcalidadnotificacionww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlcalidadnotificacionww.class ));
   }

   public controlcalidadnotificacionww( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlcalidadnotificacionww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlcalidadnotificacionww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Control Calidad Notificacion";
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

