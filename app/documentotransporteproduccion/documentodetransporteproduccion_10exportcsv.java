package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.documentodetransporteproduccion_10exportcsv", "/app.documentotransporteproduccion.documentodetransporteproduccion_10exportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentodetransporteproduccion_10exportcsv extends GXWebObjectStub
{
   public documentodetransporteproduccion_10exportcsv( )
   {
   }

   public documentodetransporteproduccion_10exportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentodetransporteproduccion_10exportcsv.class ));
   }

   public documentodetransporteproduccion_10exportcsv( int remoteHandle ,
                                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentodetransporteproduccion_10exportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentodetransporteproduccion_10exportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Documentode Transporte Produccion_10 Export CSV";
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

