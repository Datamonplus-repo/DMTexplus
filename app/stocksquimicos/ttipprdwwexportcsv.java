package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipprdwwexportcsv", "/app.stocksquimicos.ttipprdwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipprdwwexportcsv extends GXWebObjectStub
{
   public ttipprdwwexportcsv( )
   {
   }

   public ttipprdwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipprdwwexportcsv.class ));
   }

   public ttipprdwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipprdwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipprdwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPPRDWWExport CSV";
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

