package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tarticpwwexportreport", "/app.tarticpwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tarticpwwexportreport extends GXWebObjectStub
{
   public tarticpwwexportreport( )
   {
   }

   public tarticpwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tarticpwwexportreport.class ));
   }

   public tarticpwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tarticpwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tarticpwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TARTICPWWExport Report";
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

