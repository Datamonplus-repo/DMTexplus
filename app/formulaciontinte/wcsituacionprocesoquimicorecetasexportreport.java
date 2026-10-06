package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.wcsituacionprocesoquimicorecetasexportreport", "/app.formulaciontinte.wcsituacionprocesoquimicorecetasexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcsituacionprocesoquimicorecetasexportreport extends GXWebObjectStub
{
   public wcsituacionprocesoquimicorecetasexportreport( )
   {
   }

   public wcsituacionprocesoquimicorecetasexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcsituacionprocesoquimicorecetasexportreport.class ));
   }

   public wcsituacionprocesoquimicorecetasexportreport( int remoteHandle ,
                                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcsituacionprocesoquimicorecetasexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcsituacionprocesoquimicorecetasexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCSituacion Proceso Quimico Recetas Export Report";
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

