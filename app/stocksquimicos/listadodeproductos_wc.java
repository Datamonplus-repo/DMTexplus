package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.listadodeproductos_wc", "/app.stocksquimicos.listadodeproductos_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadodeproductos_wc extends GXWebObjectStub
{
   public listadodeproductos_wc( )
   {
   }

   public listadodeproductos_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadodeproductos_wc.class ));
   }

   public listadodeproductos_wc( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadodeproductos_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadodeproductos_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento de Productos Quimicos";
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

