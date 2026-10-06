package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.sustitucionprocesoquimicoformulas_wc", "/app.formulaciontinte.sustitucionprocesoquimicoformulas_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class sustitucionprocesoquimicoformulas_wc extends GXWebObjectStub
{
   public sustitucionprocesoquimicoformulas_wc( )
   {
   }

   public sustitucionprocesoquimicoformulas_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( sustitucionprocesoquimicoformulas_wc.class ));
   }

   public sustitucionprocesoquimicoformulas_wc( int remoteHandle ,
                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new sustitucionprocesoquimicoformulas_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new sustitucionprocesoquimicoformulas_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Sustitucion Proceso Quimico Formulas";
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

