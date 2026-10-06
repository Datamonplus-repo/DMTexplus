package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.documentodetransporteproduccion_3", "/app.documentotransporteproduccion.documentodetransporteproduccion_3"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentodetransporteproduccion_3 extends GXWebObjectStub
{
   public documentodetransporteproduccion_3( )
   {
   }

   public documentodetransporteproduccion_3( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentodetransporteproduccion_3.class ));
   }

   public documentodetransporteproduccion_3( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentodetransporteproduccion_3_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentodetransporteproduccion_3_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Detalle de Producciones";
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

