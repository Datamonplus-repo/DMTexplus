package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.preparoxmldocumentodetransporteproduccion", "/app.documentotransporteproduccion.preparoxmldocumentodetransporteproduccion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class preparoxmldocumentodetransporteproduccion extends GXWebObjectStub
{
   public preparoxmldocumentodetransporteproduccion( )
   {
   }

   public preparoxmldocumentodetransporteproduccion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( preparoxmldocumentodetransporteproduccion.class ));
   }

   public preparoxmldocumentodetransporteproduccion( int remoteHandle ,
                                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new preparoxmldocumentodetransporteproduccion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new preparoxmldocumentodetransporteproduccion_impl(context).cleanup();
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

