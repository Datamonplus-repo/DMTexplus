package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.controlcalidad_ccdef", "/app.controlcalidadhtd.controlcalidad_ccdef"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlcalidad_ccdef extends GXWebObjectStub
{
   public controlcalidad_ccdef( )
   {
   }

   public controlcalidad_ccdef( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlcalidad_ccdef.class ));
   }

   public controlcalidad_ccdef( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlcalidad_ccdef_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlcalidad_ccdef_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Definición de Cont. de Calidad";
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

