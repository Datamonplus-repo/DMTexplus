package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion_anulacion", "/app.documentotransporteproduccion_anulacion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentotransporteproduccion_anulacion extends GXWebObjectStub
{
   public documentotransporteproduccion_anulacion( )
   {
   }

   public documentotransporteproduccion_anulacion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentotransporteproduccion_anulacion.class ));
   }

   public documentotransporteproduccion_anulacion( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentotransporteproduccion_anulacion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentotransporteproduccion_anulacion_impl(context).cleanup();
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

