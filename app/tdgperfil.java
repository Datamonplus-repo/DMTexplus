package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdgperfil", "/app.tdgperfil"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdgperfil extends GXWebObjectStub
{
   public tdgperfil( )
   {
   }

   public tdgperfil( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdgperfil.class ));
   }

   public tdgperfil( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdgperfil_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdgperfil_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PERFIL COLOR ESTAMPACION DIGITAL";
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

