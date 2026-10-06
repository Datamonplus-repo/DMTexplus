package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.controlcalidad_ccseri", "/app.controlcalidadhtd.controlcalidad_ccseri"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlcalidad_ccseri extends GXWebObjectStub
{
   public controlcalidad_ccseri( )
   {
   }

   public controlcalidad_ccseri( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlcalidad_ccseri.class ));
   }

   public controlcalidad_ccseri( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlcalidad_ccseri_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlcalidad_ccseri_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control de Calidad Cliente-Articulo-Color";
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

