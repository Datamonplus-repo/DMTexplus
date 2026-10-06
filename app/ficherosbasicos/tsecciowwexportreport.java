package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tsecciowwexportreport", "/app.ficherosbasicos.tsecciowwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tsecciowwexportreport extends GXWebObjectStub
{
   public tsecciowwexportreport( )
   {
   }

   public tsecciowwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tsecciowwexportreport.class ));
   }

   public tsecciowwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tsecciowwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tsecciowwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TSECCIOWWExport Report";
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

