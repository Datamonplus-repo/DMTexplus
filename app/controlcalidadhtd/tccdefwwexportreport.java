package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.tccdefwwexportreport", "/app.controlcalidadhtd.tccdefwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tccdefwwexportreport extends GXWebObjectStub
{
   public tccdefwwexportreport( )
   {
   }

   public tccdefwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tccdefwwexportreport.class ));
   }

   public tccdefwwexportreport( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tccdefwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tccdefwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCCDef WWExport Report";
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

