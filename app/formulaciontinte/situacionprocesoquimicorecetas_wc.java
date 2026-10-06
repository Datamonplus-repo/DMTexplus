package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.situacionprocesoquimicorecetas_wc", "/app.formulaciontinte.situacionprocesoquimicorecetas_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class situacionprocesoquimicorecetas_wc extends GXWebObjectStub
{
   public situacionprocesoquimicorecetas_wc( )
   {
   }

   public situacionprocesoquimicorecetas_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( situacionprocesoquimicorecetas_wc.class ));
   }

   public situacionprocesoquimicorecetas_wc( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new situacionprocesoquimicorecetas_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new situacionprocesoquimicorecetas_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Situacion Proceso Quimico Recetas";
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

