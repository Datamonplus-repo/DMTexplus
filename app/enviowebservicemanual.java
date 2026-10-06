package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.enviowebservicemanual", "/app.enviowebservicemanual"})
@jakarta.servlet.annotation.MultipartConfig
public final  class enviowebservicemanual extends GXWebObjectStub
{
   public enviowebservicemanual( )
   {
   }

   public enviowebservicemanual( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( enviowebservicemanual.class ));
   }

   public enviowebservicemanual( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new enviowebservicemanual_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new enviowebservicemanual_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Envio Webservice Manual";
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

