package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.documentotransporteproduccion_fecha_hora_salida_hash", "/app.documentotransporteproduccion.documentotransporteproduccion_fecha_hora_salida_hash"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentotransporteproduccion_fecha_hora_salida_hash extends GXWebObjectStub
{
   public documentotransporteproduccion_fecha_hora_salida_hash( )
   {
   }

   public documentotransporteproduccion_fecha_hora_salida_hash( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentotransporteproduccion_fecha_hora_salida_hash.class ));
   }

   public documentotransporteproduccion_fecha_hora_salida_hash( int remoteHandle ,
                                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentotransporteproduccion_fecha_hora_salida_hash_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentotransporteproduccion_fecha_hora_salida_hash_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Preparo XML AT Documentode Transporte Produccion";
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

