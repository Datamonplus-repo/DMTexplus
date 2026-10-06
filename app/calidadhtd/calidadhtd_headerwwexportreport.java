package app.calidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.calidadhtd.calidadhtd_headerwwexportreport", "/app.calidadhtd.calidadhtd_headerwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class calidadhtd_headerwwexportreport extends GXWebObjectStub
{
   public calidadhtd_headerwwexportreport( )
   {
   }

   public calidadhtd_headerwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( calidadhtd_headerwwexportreport.class ));
   }

   public calidadhtd_headerwwexportreport( int remoteHandle ,
                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new calidadhtd_headerwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new calidadhtd_headerwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Calidad HTD_header WWExport Report";
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

