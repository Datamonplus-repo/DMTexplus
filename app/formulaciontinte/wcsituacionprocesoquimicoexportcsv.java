package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.wcsituacionprocesoquimicoexportcsv", "/app.formulaciontinte.wcsituacionprocesoquimicoexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcsituacionprocesoquimicoexportcsv extends GXWebObjectStub
{
   public wcsituacionprocesoquimicoexportcsv( )
   {
   }

   public wcsituacionprocesoquimicoexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcsituacionprocesoquimicoexportcsv.class ));
   }

   public wcsituacionprocesoquimicoexportcsv( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcsituacionprocesoquimicoexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcsituacionprocesoquimicoexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCSituacion Proceso Quimico Export CSV";
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

