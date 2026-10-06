package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcseguimientonpedidoexportcsv", "/app.wcseguimientonpedidoexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcseguimientonpedidoexportcsv extends GXWebObjectStub
{
   public wcseguimientonpedidoexportcsv( )
   {
   }

   public wcseguimientonpedidoexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcseguimientonpedidoexportcsv.class ));
   }

   public wcseguimientonpedidoexportcsv( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcseguimientonpedidoexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcseguimientonpedidoexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCSeguimiento NPedido Export CSV";
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

