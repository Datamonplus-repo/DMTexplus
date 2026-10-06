package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlincidencias_wcexportreport", "/app.controlincidencias_wcexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlincidencias_wcexportreport extends GXWebObjectStub
{
   public controlincidencias_wcexportreport( )
   {
   }

   public controlincidencias_wcexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlincidencias_wcexportreport.class ));
   }

   public controlincidencias_wcexportreport( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlincidencias_wcexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlincidencias_wcexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control Incidencias_WCExport Report";
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

