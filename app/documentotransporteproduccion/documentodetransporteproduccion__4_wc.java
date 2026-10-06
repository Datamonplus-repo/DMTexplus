package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.documentodetransporteproduccion__4_wc", "/app.documentotransporteproduccion.documentodetransporteproduccion__4_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentodetransporteproduccion__4_wc extends GXWebObjectStub
{
   public documentodetransporteproduccion__4_wc( )
   {
   }

   public documentodetransporteproduccion__4_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentodetransporteproduccion__4_wc.class ));
   }

   public documentodetransporteproduccion__4_wc( int remoteHandle ,
                                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentodetransporteproduccion__4_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentodetransporteproduccion__4_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla ALBFAS";
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

