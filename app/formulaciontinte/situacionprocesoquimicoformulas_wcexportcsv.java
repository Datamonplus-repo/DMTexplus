package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.situacionprocesoquimicoformulas_wcexportcsv", "/app.formulaciontinte.situacionprocesoquimicoformulas_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class situacionprocesoquimicoformulas_wcexportcsv extends GXWebObjectStub
{
   public situacionprocesoquimicoformulas_wcexportcsv( )
   {
   }

   public situacionprocesoquimicoformulas_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( situacionprocesoquimicoformulas_wcexportcsv.class ));
   }

   public situacionprocesoquimicoformulas_wcexportcsv( int remoteHandle ,
                                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new situacionprocesoquimicoformulas_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new situacionprocesoquimicoformulas_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Situacion Proceso Quimico Formulas_WCExport CSV";
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

