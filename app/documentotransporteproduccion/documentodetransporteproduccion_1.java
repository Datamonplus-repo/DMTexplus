package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.documentodetransporteproduccion_1", "/app.documentotransporteproduccion.documentodetransporteproduccion_1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentodetransporteproduccion_1 extends GXWebObjectStub
{
   public documentodetransporteproduccion_1( )
   {
   }

   public documentodetransporteproduccion_1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentodetransporteproduccion_1.class ));
   }

   public documentodetransporteproduccion_1( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentodetransporteproduccion_1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentodetransporteproduccion_1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Documento de Transporte Produccion";
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

