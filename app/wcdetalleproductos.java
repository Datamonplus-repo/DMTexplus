package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcdetalleproductos", "/app.wcdetalleproductos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcdetalleproductos extends GXWebObjectStub
{
   public wcdetalleproductos( )
   {
   }

   public wcdetalleproductos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcdetalleproductos.class ));
   }

   public wcdetalleproductos( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcdetalleproductos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcdetalleproductos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Historico Recetas (Detalle)";
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

