package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.controlcalidad_cc1_wkp", "/app.controlcalidadhtd.controlcalidad_cc1_wkp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlcalidad_cc1_wkp extends GXWebObjectStub
{
   public controlcalidad_cc1_wkp( )
   {
   }

   public controlcalidad_cc1_wkp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlcalidad_cc1_wkp.class ));
   }

   public controlcalidad_cc1_wkp( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlcalidad_cc1_wkp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlcalidad_cc1_wkp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Datos Lineas (CC1)";
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

