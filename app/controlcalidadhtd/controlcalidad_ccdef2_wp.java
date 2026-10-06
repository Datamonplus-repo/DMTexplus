package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.controlcalidad_ccdef2_wp", "/app.controlcalidadhtd.controlcalidad_ccdef2_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlcalidad_ccdef2_wp extends GXWebObjectStub
{
   public controlcalidad_ccdef2_wp( )
   {
   }

   public controlcalidad_ccdef2_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlcalidad_ccdef2_wp.class ));
   }

   public controlcalidad_ccdef2_wp( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlcalidad_ccdef2_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlcalidad_ccdef2_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Control Calidad_CCDEF2 (lista, rango)";
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

