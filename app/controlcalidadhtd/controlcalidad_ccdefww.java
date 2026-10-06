package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.controlcalidad_ccdefww", "/app.controlcalidadhtd.controlcalidad_ccdefww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlcalidad_ccdefww extends GXWebObjectStub
{
   public controlcalidad_ccdefww( )
   {
   }

   public controlcalidad_ccdefww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlcalidad_ccdefww.class ));
   }

   public controlcalidad_ccdefww( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlcalidad_ccdefww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlcalidad_ccdefww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Definición de Cont. de Calidad";
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

