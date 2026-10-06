package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranes.albaran_hrasalidadocumento", "/app.albaranes.albaran_hrasalidadocumento"})
@jakarta.servlet.annotation.MultipartConfig
public final  class albaran_hrasalidadocumento extends GXWebObjectStub
{
   public albaran_hrasalidadocumento( )
   {
   }

   public albaran_hrasalidadocumento( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( albaran_hrasalidadocumento.class ));
   }

   public albaran_hrasalidadocumento( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new albaran_hrasalidadocumento_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new albaran_hrasalidadocumento_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Hora Salida de Documento";
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

