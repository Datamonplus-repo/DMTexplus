package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.wcsituacionprocesoquimicoexportreport", "/app.formulaciontinte.wcsituacionprocesoquimicoexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcsituacionprocesoquimicoexportreport extends GXWebObjectStub
{
   public wcsituacionprocesoquimicoexportreport( )
   {
   }

   public wcsituacionprocesoquimicoexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcsituacionprocesoquimicoexportreport.class ));
   }

   public wcsituacionprocesoquimicoexportreport( int remoteHandle ,
                                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcsituacionprocesoquimicoexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcsituacionprocesoquimicoexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCSituacion Proceso Quimico Export Report";
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

