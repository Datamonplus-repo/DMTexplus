package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.controlcalidad_ccfas", "/app.controlcalidadhtd.controlcalidad_ccfas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlcalidad_ccfas extends GXWebObjectStub
{
   public controlcalidad_ccfas( )
   {
   }

   public controlcalidad_ccfas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlcalidad_ccfas.class ));
   }

   public controlcalidad_ccfas( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlcalidad_ccfas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlcalidad_ccfas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Controles Calidad por Fase";
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

