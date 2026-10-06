package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.webwhdrpziexportreport", "/app.expedicionesautomatizadas.webwhdrpziexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwhdrpziexportreport extends GXWebObjectStub
{
   public webwhdrpziexportreport( )
   {
   }

   public webwhdrpziexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwhdrpziexportreport.class ));
   }

   public webwhdrpziexportreport( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwhdrpziexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwhdrpziexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web WHDRPZIExport Report";
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

