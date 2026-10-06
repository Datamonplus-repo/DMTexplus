package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.devoluciontejido_anulacion", "/app.almacensindetalle.devoluciontejido_anulacion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class devoluciontejido_anulacion extends GXWebObjectStub
{
   public devoluciontejido_anulacion( )
   {
   }

   public devoluciontejido_anulacion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( devoluciontejido_anulacion.class ));
   }

   public devoluciontejido_anulacion( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new devoluciontejido_anulacion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new devoluciontejido_anulacion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Anulacion Documento enviado a AT";
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

