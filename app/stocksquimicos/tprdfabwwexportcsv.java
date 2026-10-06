package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tprdfabwwexportcsv", "/app.stocksquimicos.tprdfabwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprdfabwwexportcsv extends GXWebObjectStub
{
   public tprdfabwwexportcsv( )
   {
   }

   public tprdfabwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprdfabwwexportcsv.class ));
   }

   public tprdfabwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprdfabwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprdfabwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPRDFABWWExport CSV";
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

