package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcacrap", "/app.tcacrap"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcacrap extends GXWebObjectStub
{
   public tcacrap( )
   {
   }

   public tcacrap( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcacrap.class ));
   }

   public tcacrap( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcacrap_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcacrap_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CAPTURA PARAMETROS RAM";
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

