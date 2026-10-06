package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcaccap", "/app.tcaccap"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcaccap extends GXWebObjectStub
{
   public tcaccap( )
   {
   }

   public tcaccap( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcaccap.class ));
   }

   public tcaccap( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcaccap_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcaccap_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CAPTURA PARAMETROS CALANDRA";
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

