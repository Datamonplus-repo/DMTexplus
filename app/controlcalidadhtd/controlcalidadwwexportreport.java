package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.controlcalidadwwexportreport", "/app.controlcalidadhtd.controlcalidadwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlcalidadwwexportreport extends GXWebObjectStub
{
   public controlcalidadwwexportreport( )
   {
   }

   public controlcalidadwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlcalidadwwexportreport.class ));
   }

   public controlcalidadwwexportreport( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlcalidadwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlcalidadwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control Calidad WWExport Report";
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

