package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.productohistoricopreciosexportcsv", "/app.productohistoricopreciosexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productohistoricopreciosexportcsv extends GXWebObjectStub
{
   public productohistoricopreciosexportcsv( )
   {
   }

   public productohistoricopreciosexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productohistoricopreciosexportcsv.class ));
   }

   public productohistoricopreciosexportcsv( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productohistoricopreciosexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productohistoricopreciosexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Producto Historico Precios Export CSV";
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

