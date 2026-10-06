package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipmovwwexportcsv", "/app.stocksquimicos.ttipmovwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipmovwwexportcsv extends GXWebObjectStub
{
   public ttipmovwwexportcsv( )
   {
   }

   public ttipmovwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipmovwwexportcsv.class ));
   }

   public ttipmovwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipmovwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipmovwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPMOVWWExport CSV";
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

