package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.controlcalidadww", "/app.controlcalidadhtd.controlcalidadww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlcalidadww extends GXWebObjectStub
{
   public controlcalidadww( )
   {
   }

   public controlcalidadww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlcalidadww.class ));
   }

   public controlcalidadww( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlcalidadww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlcalidadww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Control Calidad";
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

