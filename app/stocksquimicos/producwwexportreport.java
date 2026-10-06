package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.producwwexportreport", "/app.stocksquimicos.producwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class producwwexportreport extends GXWebObjectStub
{
   public producwwexportreport( )
   {
   }

   public producwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( producwwexportreport.class ));
   }

   public producwwexportreport( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new producwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new producwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRODUCWWExport Report";
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

