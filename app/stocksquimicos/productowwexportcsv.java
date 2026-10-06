package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.productowwexportcsv", "/app.stocksquimicos.productowwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productowwexportcsv extends GXWebObjectStub
{
   public productowwexportcsv( )
   {
   }

   public productowwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productowwexportcsv.class ));
   }

   public productowwexportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productowwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productowwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Producto WWExport CSV";
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

