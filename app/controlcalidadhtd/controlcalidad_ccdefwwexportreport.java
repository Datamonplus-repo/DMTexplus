package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.controlcalidad_ccdefwwexportreport", "/app.controlcalidadhtd.controlcalidad_ccdefwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlcalidad_ccdefwwexportreport extends GXWebObjectStub
{
   public controlcalidad_ccdefwwexportreport( )
   {
   }

   public controlcalidad_ccdefwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlcalidad_ccdefwwexportreport.class ));
   }

   public controlcalidad_ccdefwwexportreport( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlcalidad_ccdefwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlcalidad_ccdefwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control Calidad_CCDEFWWExport Report";
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

