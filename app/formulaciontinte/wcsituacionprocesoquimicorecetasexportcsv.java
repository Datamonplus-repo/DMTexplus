package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.wcsituacionprocesoquimicorecetasexportcsv", "/app.formulaciontinte.wcsituacionprocesoquimicorecetasexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcsituacionprocesoquimicorecetasexportcsv extends GXWebObjectStub
{
   public wcsituacionprocesoquimicorecetasexportcsv( )
   {
   }

   public wcsituacionprocesoquimicorecetasexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcsituacionprocesoquimicorecetasexportcsv.class ));
   }

   public wcsituacionprocesoquimicorecetasexportcsv( int remoteHandle ,
                                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcsituacionprocesoquimicorecetasexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcsituacionprocesoquimicorecetasexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCSituacion Proceso Quimico Recetas Export CSV";
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

