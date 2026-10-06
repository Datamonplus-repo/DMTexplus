package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.precioporcolor_clienteexportreport", "/app.facturacion.precioporcolor_clienteexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class precioporcolor_clienteexportreport extends GXWebObjectStub
{
   public precioporcolor_clienteexportreport( )
   {
   }

   public precioporcolor_clienteexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( precioporcolor_clienteexportreport.class ));
   }

   public precioporcolor_clienteexportreport( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new precioporcolor_clienteexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new precioporcolor_clienteexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Preciopor Color_Cliente Export Report";
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

