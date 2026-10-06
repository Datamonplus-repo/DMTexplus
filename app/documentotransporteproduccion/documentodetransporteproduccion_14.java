package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.documentodetransporteproduccion_14", "/app.documentotransporteproduccion.documentodetransporteproduccion_14"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentodetransporteproduccion_14 extends GXWebObjectStub
{
   public documentodetransporteproduccion_14( )
   {
   }

   public documentodetransporteproduccion_14( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentodetransporteproduccion_14.class ));
   }

   public documentodetransporteproduccion_14( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentodetransporteproduccion_14_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentodetransporteproduccion_14_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Modificacion Precios Fases";
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

