package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternos.trabajoexterno_horasalidadocumentoenvioat", "/app.trabajosexternos.trabajoexterno_horasalidadocumentoenvioat"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trabajoexterno_horasalidadocumentoenvioat extends GXWebObjectStub
{
   public trabajoexterno_horasalidadocumentoenvioat( )
   {
   }

   public trabajoexterno_horasalidadocumentoenvioat( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trabajoexterno_horasalidadocumentoenvioat.class ));
   }

   public trabajoexterno_horasalidadocumentoenvioat( int remoteHandle ,
                                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trabajoexterno_horasalidadocumentoenvioat_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trabajoexterno_horasalidadocumentoenvioat_impl(context).cleanup();
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

