package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipuniwwexportcsv", "/app.stocksquimicos.ttipuniwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipuniwwexportcsv extends GXWebObjectStub
{
   public ttipuniwwexportcsv( )
   {
   }

   public ttipuniwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipuniwwexportcsv.class ));
   }

   public ttipuniwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipuniwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipuniwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPUNIWWExport CSV";
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

