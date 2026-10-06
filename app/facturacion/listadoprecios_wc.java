package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.listadoprecios_wc", "/app.facturacion.listadoprecios_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadoprecios_wc extends GXWebObjectStub
{
   public listadoprecios_wc( )
   {
   }

   public listadoprecios_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadoprecios_wc.class ));
   }

   public listadoprecios_wc( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadoprecios_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadoprecios_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Precios";
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

