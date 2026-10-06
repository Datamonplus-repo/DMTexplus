package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipdtowwexportcsv", "/app.stocksquimicos.ttipdtowwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipdtowwexportcsv extends GXWebObjectStub
{
   public ttipdtowwexportcsv( )
   {
   }

   public ttipdtowwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipdtowwexportcsv.class ));
   }

   public ttipdtowwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipdtowwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipdtowwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPDTOWWExport CSV";
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

