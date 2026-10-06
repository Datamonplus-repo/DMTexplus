package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.documentodetransporteproduccion_10exportreport", "/app.documentotransporteproduccion.documentodetransporteproduccion_10exportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentodetransporteproduccion_10exportreport extends GXWebObjectStub
{
   public documentodetransporteproduccion_10exportreport( )
   {
   }

   public documentodetransporteproduccion_10exportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentodetransporteproduccion_10exportreport.class ));
   }

   public documentodetransporteproduccion_10exportreport( int remoteHandle ,
                                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentodetransporteproduccion_10exportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentodetransporteproduccion_10exportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Lectura fichero Result.xml";
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

