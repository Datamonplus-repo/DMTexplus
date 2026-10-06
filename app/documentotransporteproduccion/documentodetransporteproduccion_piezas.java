package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.documentodetransporteproduccion_piezas", "/app.documentotransporteproduccion.documentodetransporteproduccion_piezas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentodetransporteproduccion_piezas extends GXWebObjectStub
{
   public documentodetransporteproduccion_piezas( )
   {
   }

   public documentodetransporteproduccion_piezas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentodetransporteproduccion_piezas.class ));
   }

   public documentodetransporteproduccion_piezas( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentodetransporteproduccion_piezas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentodetransporteproduccion_piezas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla LMETPI";
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

