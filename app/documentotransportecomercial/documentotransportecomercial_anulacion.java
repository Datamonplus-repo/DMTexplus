package app.documentotransportecomercial ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransportecomercial.documentotransportecomercial_anulacion", "/app.documentotransportecomercial.documentotransportecomercial_anulacion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentotransportecomercial_anulacion extends GXWebObjectStub
{
   public documentotransportecomercial_anulacion( )
   {
   }

   public documentotransportecomercial_anulacion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentotransportecomercial_anulacion.class ));
   }

   public documentotransportecomercial_anulacion( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentotransportecomercial_anulacion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentotransportecomercial_anulacion_impl(context).cleanup();
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

