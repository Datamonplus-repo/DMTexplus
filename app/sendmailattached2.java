package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.sendmailattached2", "/app.sendmailattached2", "/servlet/app.sendmailattached2/gxobject", "/app.sendmailattached2/gxobject"})
@jakarta.servlet.annotation.MultipartConfig
public final  class sendmailattached2 extends GXWebObjectStub
{
   public sendmailattached2( )
   {
   }

   public sendmailattached2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( sendmailattached2.class ));
   }

   public sendmailattached2( int remoteHandle ,
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
         new sendmailattached2_impl(context).doExecute();
      }
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new sendmailattached2_impl(context).cleanup();
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

