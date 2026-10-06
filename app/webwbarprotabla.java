package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwbarprotabla", "/app.webwbarprotabla"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwbarprotabla extends GXWebObjectStub
{
   public webwbarprotabla( )
   {
   }

   public webwbarprotabla( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwbarprotabla.class ));
   }

   public webwbarprotabla( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwbarprotabla_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwbarprotabla_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento de Procesos (Hdr)";
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

