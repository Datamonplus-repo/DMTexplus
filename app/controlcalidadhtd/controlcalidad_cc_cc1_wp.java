package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.controlcalidad_cc_cc1_wp", "/app.controlcalidadhtd.controlcalidad_cc_cc1_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlcalidad_cc_cc1_wp extends GXWebObjectStub
{
   public controlcalidad_cc_cc1_wp( )
   {
   }

   public controlcalidad_cc_cc1_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlcalidad_cc_cc1_wp.class ));
   }

   public controlcalidad_cc_cc1_wp( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlcalidad_cc_cc1_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlcalidad_cc_cc1_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control de Calidad por Nº HDR";
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

