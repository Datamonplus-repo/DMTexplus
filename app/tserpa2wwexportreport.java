package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tserpa2wwexportreport", "/app.tserpa2wwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tserpa2wwexportreport extends GXWebObjectStub
{
   public tserpa2wwexportreport( )
   {
   }

   public tserpa2wwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tserpa2wwexportreport.class ));
   }

   public tserpa2wwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tserpa2wwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tserpa2wwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TSERPA2 WWExport Report";
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

