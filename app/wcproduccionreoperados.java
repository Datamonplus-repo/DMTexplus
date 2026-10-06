package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcproduccionreoperados", "/app.wcproduccionreoperados"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcproduccionreoperados extends GXWebObjectStub
{
   public wcproduccionreoperados( )
   {
   }

   public wcproduccionreoperados( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcproduccionreoperados.class ));
   }

   public wcproduccionreoperados( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcproduccionreoperados_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcproduccionreoperados_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCProduccion Reoperados";
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

