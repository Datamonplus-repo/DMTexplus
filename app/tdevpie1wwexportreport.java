package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdevpie1wwexportreport", "/app.tdevpie1wwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdevpie1wwexportreport extends GXWebObjectStub
{
   public tdevpie1wwexportreport( )
   {
   }

   public tdevpie1wwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdevpie1wwexportreport.class ));
   }

   public tdevpie1wwexportreport( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdevpie1wwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdevpie1wwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TDev Pie1 WWExport Report";
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

