package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.documentodetransporteproduccion_12", "/app.documentotransporteproduccion.documentodetransporteproduccion_12"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentodetransporteproduccion_12 extends GXWebObjectStub
{
   public documentodetransporteproduccion_12( )
   {
   }

   public documentodetransporteproduccion_12( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentodetransporteproduccion_12.class ));
   }

   public documentodetransporteproduccion_12( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentodetransporteproduccion_12_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentodetransporteproduccion_12_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Observaciones";
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

