package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidoclienteproceso", "/app.pedidoclienteproceso"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pedidoclienteproceso extends GXWebObjectStub
{
   public pedidoclienteproceso( )
   {
   }

   public pedidoclienteproceso( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pedidoclienteproceso.class ));
   }

   public pedidoclienteproceso( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pedidoclienteproceso_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pedidoclienteproceso_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Pedido Cliente Proceso";
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

