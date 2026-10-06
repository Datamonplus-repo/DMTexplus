package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ccstkswwexportreport", "/app.ccstkswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ccstkswwexportreport extends GXWebObjectStub
{
   public ccstkswwexportreport( )
   {
   }

   public ccstkswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ccstkswwexportreport.class ));
   }

   public ccstkswwexportreport( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ccstkswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ccstkswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CCSTKSWWExport Report";
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

