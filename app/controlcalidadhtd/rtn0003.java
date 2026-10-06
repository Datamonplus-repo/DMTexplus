package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.rtn0003", "/app.controlcalidadhtd.rtn0003"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rtn0003 extends GXWebObjectStub
{
   public rtn0003( )
   {
   }

   public rtn0003( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rtn0003.class ));
   }

   public rtn0003( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rtn0003_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rtn0003_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Controles de Calidad";
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

