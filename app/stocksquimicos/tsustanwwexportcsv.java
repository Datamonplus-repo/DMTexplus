package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tsustanwwexportcsv", "/app.stocksquimicos.tsustanwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tsustanwwexportcsv extends GXWebObjectStub
{
   public tsustanwwexportcsv( )
   {
   }

   public tsustanwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tsustanwwexportcsv.class ));
   }

   public tsustanwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tsustanwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tsustanwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TSUSTANWWExport CSV";
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

