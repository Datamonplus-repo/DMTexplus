package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcproduccionparos_detalle", "/app.wcproduccionparos_detalle"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcproduccionparos_detalle extends GXWebObjectStub
{
   public wcproduccionparos_detalle( )
   {
   }

   public wcproduccionparos_detalle( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcproduccionparos_detalle.class ));
   }

   public wcproduccionparos_detalle( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcproduccionparos_detalle_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcproduccionparos_detalle_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCProduccion Paros_Detalle";
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

