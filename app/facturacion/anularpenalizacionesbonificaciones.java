package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.anularpenalizacionesbonificaciones", "/app.facturacion.anularpenalizacionesbonificaciones"})
@jakarta.servlet.annotation.MultipartConfig
public final  class anularpenalizacionesbonificaciones extends GXWebObjectStub
{
   public anularpenalizacionesbonificaciones( )
   {
   }

   public anularpenalizacionesbonificaciones( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( anularpenalizacionesbonificaciones.class ));
   }

   public anularpenalizacionesbonificaciones( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new anularpenalizacionesbonificaciones_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new anularpenalizacionesbonificaciones_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Anular Penalizaciones Bonificaciones";
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

