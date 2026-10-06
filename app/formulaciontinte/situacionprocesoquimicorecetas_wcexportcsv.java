package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.situacionprocesoquimicorecetas_wcexportcsv", "/app.formulaciontinte.situacionprocesoquimicorecetas_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class situacionprocesoquimicorecetas_wcexportcsv extends GXWebObjectStub
{
   public situacionprocesoquimicorecetas_wcexportcsv( )
   {
   }

   public situacionprocesoquimicorecetas_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( situacionprocesoquimicorecetas_wcexportcsv.class ));
   }

   public situacionprocesoquimicorecetas_wcexportcsv( int remoteHandle ,
                                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new situacionprocesoquimicorecetas_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new situacionprocesoquimicorecetas_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Situacion Proceso Quimico Recetas_WCExport CSV";
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

