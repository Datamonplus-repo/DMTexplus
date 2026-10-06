package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.precioporcolor_clienteexportcsv", "/app.facturacion.precioporcolor_clienteexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class precioporcolor_clienteexportcsv extends GXWebObjectStub
{
   public precioporcolor_clienteexportcsv( )
   {
   }

   public precioporcolor_clienteexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( precioporcolor_clienteexportcsv.class ));
   }

   public precioporcolor_clienteexportcsv( int remoteHandle ,
                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new precioporcolor_clienteexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new precioporcolor_clienteexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Preciopor Color_Cliente Export CSV";
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

