package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcseguimientoproductoexportcsv", "/app.wcseguimientoproductoexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcseguimientoproductoexportcsv extends GXWebObjectStub
{
   public wcseguimientoproductoexportcsv( )
   {
   }

   public wcseguimientoproductoexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcseguimientoproductoexportcsv.class ));
   }

   public wcseguimientoproductoexportcsv( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcseguimientoproductoexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcseguimientoproductoexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCSeguimiento Producto Export CSV";
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

