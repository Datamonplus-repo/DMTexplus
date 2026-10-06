package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webconalbexportreport", "/app.webconalbexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webconalbexportreport extends GXWebObjectStub
{
   public webconalbexportreport( )
   {
   }

   public webconalbexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webconalbexportreport.class ));
   }

   public webconalbexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webconalbexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webconalbexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web CONALBExport Report";
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

