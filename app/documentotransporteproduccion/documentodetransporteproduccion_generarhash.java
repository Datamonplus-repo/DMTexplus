package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.documentodetransporteproduccion_generarhash", "/app.documentotransporteproduccion.documentodetransporteproduccion_generarhash"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentodetransporteproduccion_generarhash extends GXWebObjectStub
{
   public documentodetransporteproduccion_generarhash( )
   {
   }

   public documentodetransporteproduccion_generarhash( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentodetransporteproduccion_generarhash.class ));
   }

   public documentodetransporteproduccion_generarhash( int remoteHandle ,
                                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentodetransporteproduccion_generarhash_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentodetransporteproduccion_generarhash_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Documento de Transporte Produccion (Generar Hash)";
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

