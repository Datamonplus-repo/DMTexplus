package app.documentotransportecomercial ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransportecomercial.preparoxmldocumentotransportecomercial", "/app.documentotransportecomercial.preparoxmldocumentotransportecomercial"})
@jakarta.servlet.annotation.MultipartConfig
public final  class preparoxmldocumentotransportecomercial extends GXWebObjectStub
{
   public preparoxmldocumentotransportecomercial( )
   {
   }

   public preparoxmldocumentotransportecomercial( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( preparoxmldocumentotransportecomercial.class ));
   }

   public preparoxmldocumentotransportecomercial( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new preparoxmldocumentotransportecomercial_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new preparoxmldocumentotransportecomercial_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Confirmacion Fecha-Hora salida, Hash, Comunicacion AT";
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

