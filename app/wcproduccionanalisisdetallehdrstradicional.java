package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcproduccionanalisisdetallehdrstradicional", "/app.wcproduccionanalisisdetallehdrstradicional"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcproduccionanalisisdetallehdrstradicional extends GXWebObjectStub
{
   public wcproduccionanalisisdetallehdrstradicional( )
   {
   }

   public wcproduccionanalisisdetallehdrstradicional( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcproduccionanalisisdetallehdrstradicional.class ));
   }

   public wcproduccionanalisisdetallehdrstradicional( int remoteHandle ,
                                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcproduccionanalisisdetallehdrstradicional_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcproduccionanalisisdetallehdrstradicional_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCProduccion Analisis Detalle Hdrs Tradicional";
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

