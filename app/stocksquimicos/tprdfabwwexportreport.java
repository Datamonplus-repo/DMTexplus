package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tprdfabwwexportreport", "/app.stocksquimicos.tprdfabwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprdfabwwexportreport extends GXWebObjectStub
{
   public tprdfabwwexportreport( )
   {
   }

   public tprdfabwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprdfabwwexportreport.class ));
   }

   public tprdfabwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprdfabwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprdfabwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPRDFABWWExport Report";
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

