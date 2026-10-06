package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.testcatwwexportreport", "/app.testcatwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class testcatwwexportreport extends GXWebObjectStub
{
   public testcatwwexportreport( )
   {
   }

   public testcatwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( testcatwwexportreport.class ));
   }

   public testcatwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new testcatwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new testcatwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TESTCATWWExport Report";
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

