package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.generaraccesorios_wp", "/app.pedidos.generaraccesorios_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class generaraccesorios_wp extends GXWebObjectStub
{
   public generaraccesorios_wp( )
   {
   }

   public generaraccesorios_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( generaraccesorios_wp.class ));
   }

   public generaraccesorios_wp( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new generaraccesorios_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new generaraccesorios_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Generar Accesorios";
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

