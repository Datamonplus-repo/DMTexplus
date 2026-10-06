package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.producwwexportcsv", "/app.stocksquimicos.producwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class producwwexportcsv extends GXWebObjectStub
{
   public producwwexportcsv( )
   {
   }

   public producwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( producwwexportcsv.class ));
   }

   public producwwexportcsv( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new producwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new producwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRODUCWWExport CSV";
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

