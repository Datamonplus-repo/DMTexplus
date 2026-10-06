package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.wcsituacionprocesoquimicorecetas_crecet", "/app.formulaciontinte.wcsituacionprocesoquimicorecetas_crecet"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcsituacionprocesoquimicorecetas_crecet extends GXWebObjectStub
{
   public wcsituacionprocesoquimicorecetas_crecet( )
   {
   }

   public wcsituacionprocesoquimicorecetas_crecet( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcsituacionprocesoquimicorecetas_crecet.class ));
   }

   public wcsituacionprocesoquimicorecetas_crecet( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcsituacionprocesoquimicorecetas_crecet_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcsituacionprocesoquimicorecetas_crecet_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento Procesos Quimicos";
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

