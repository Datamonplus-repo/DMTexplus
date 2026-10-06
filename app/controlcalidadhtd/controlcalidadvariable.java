package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.controlcalidadvariable", "/app.controlcalidadhtd.controlcalidadvariable"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlcalidadvariable extends GXWebObjectStub
{
   public controlcalidadvariable( )
   {
   }

   public controlcalidadvariable( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlcalidadvariable.class ));
   }

   public controlcalidadvariable( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlcalidadvariable_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlcalidadvariable_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control Calidad Variable";
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

