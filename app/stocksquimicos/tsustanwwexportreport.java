package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tsustanwwexportreport", "/app.stocksquimicos.tsustanwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tsustanwwexportreport extends GXWebObjectStub
{
   public tsustanwwexportreport( )
   {
   }

   public tsustanwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tsustanwwexportreport.class ));
   }

   public tsustanwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tsustanwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tsustanwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TSUSTANWWExport Report";
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

