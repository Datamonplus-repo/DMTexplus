package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.controlcalidadvariable_lineas_wp", "/app.controlcalidadhtd.controlcalidadvariable_lineas_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlcalidadvariable_lineas_wp extends GXWebObjectStub
{
   public controlcalidadvariable_lineas_wp( )
   {
   }

   public controlcalidadvariable_lineas_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlcalidadvariable_lineas_wp.class ));
   }

   public controlcalidadvariable_lineas_wp( int remoteHandle ,
                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlcalidadvariable_lineas_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlcalidadvariable_lineas_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Control Calidad Variable (lineas)";
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

