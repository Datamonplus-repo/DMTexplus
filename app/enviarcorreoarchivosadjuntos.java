package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.enviarcorreoarchivosadjuntos", "/app.enviarcorreoarchivosadjuntos", "/servlet/app.enviarcorreoarchivosadjuntos/gxobject", "/app.enviarcorreoarchivosadjuntos/gxobject"})
@jakarta.servlet.annotation.MultipartConfig
public final  class enviarcorreoarchivosadjuntos extends GXWebObjectStub
{
   public enviarcorreoarchivosadjuntos( )
   {
   }

   public enviarcorreoarchivosadjuntos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( enviarcorreoarchivosadjuntos.class ));
   }

   public enviarcorreoarchivosadjuntos( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      if ( HttpUtils.isUploadRequest(context) )
      {
         new GXObjectUploadServices().doInternalExecute(context);
      }
      else
      {
         new enviarcorreoarchivosadjuntos_impl(context).doExecute();
      }
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new enviarcorreoarchivosadjuntos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Envio de Correo (Archivos Adjuntos)";
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

