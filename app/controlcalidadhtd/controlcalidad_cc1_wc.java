package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.controlcalidad_cc1_wc", "/app.controlcalidadhtd.controlcalidad_cc1_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlcalidad_cc1_wc extends GXWebObjectStub
{
   public controlcalidad_cc1_wc( )
   {
   }

   public controlcalidad_cc1_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlcalidad_cc1_wc.class ));
   }

   public controlcalidad_cc1_wc( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlcalidad_cc1_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlcalidad_cc1_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Presento datos de la linea";
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

