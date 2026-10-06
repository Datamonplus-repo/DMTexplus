package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.documentodetransporteproduccion_hash_manual", "/app.documentotransporteproduccion.documentodetransporteproduccion_hash_manual"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentodetransporteproduccion_hash_manual extends GXWebObjectStub
{
   public documentodetransporteproduccion_hash_manual( )
   {
   }

   public documentodetransporteproduccion_hash_manual( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentodetransporteproduccion_hash_manual.class ));
   }

   public documentodetransporteproduccion_hash_manual( int remoteHandle ,
                                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentodetransporteproduccion_hash_manual_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentodetransporteproduccion_hash_manual_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Manual , Hash";
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

