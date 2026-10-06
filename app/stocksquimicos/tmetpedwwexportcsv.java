package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tmetpedwwexportcsv", "/app.stocksquimicos.tmetpedwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmetpedwwexportcsv extends GXWebObjectStub
{
   public tmetpedwwexportcsv( )
   {
   }

   public tmetpedwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmetpedwwexportcsv.class ));
   }

   public tmetpedwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmetpedwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmetpedwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMETPEDWWExport CSV";
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

