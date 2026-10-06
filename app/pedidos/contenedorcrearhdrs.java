package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.contenedorcrearhdrs", "/app.pedidos.contenedorcrearhdrs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class contenedorcrearhdrs extends GXWebObjectStub
{
   public contenedorcrearhdrs( )
   {
   }

   public contenedorcrearhdrs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( contenedorcrearhdrs.class ));
   }

   public contenedorcrearhdrs( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new contenedorcrearhdrs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new contenedorcrearhdrs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Creacion de HDRs";
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

