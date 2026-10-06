package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.listadodeprecios_wc", "/app.listadodeprecios_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadodeprecios_wc extends GXWebObjectStub
{
   public listadodeprecios_wc( )
   {
   }

   public listadodeprecios_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadodeprecios_wc.class ));
   }

   public listadodeprecios_wc( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadodeprecios_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadodeprecios_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado de Precios Productos";
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

