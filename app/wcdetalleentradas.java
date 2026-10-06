package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcdetalleentradas", "/app.wcdetalleentradas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcdetalleentradas extends GXWebObjectStub
{
   public wcdetalleentradas( )
   {
   }

   public wcdetalleentradas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcdetalleentradas.class ));
   }

   public wcdetalleentradas( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcdetalleentradas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcdetalleentradas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCDetalle Entradas";
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

