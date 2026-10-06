package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.horasalidadocumentoenvioat", "/app.almacensindetalle.horasalidadocumentoenvioat"})
@jakarta.servlet.annotation.MultipartConfig
public final  class horasalidadocumentoenvioat extends GXWebObjectStub
{
   public horasalidadocumentoenvioat( )
   {
   }

   public horasalidadocumentoenvioat( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( horasalidadocumentoenvioat.class ));
   }

   public horasalidadocumentoenvioat( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new horasalidadocumentoenvioat_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new horasalidadocumentoenvioat_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Hora Salida Documento Envio AT";
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

