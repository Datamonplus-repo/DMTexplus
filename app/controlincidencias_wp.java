package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlincidencias_wp", "/app.controlincidencias_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlincidencias_wp extends GXWebObjectStub
{
   public controlincidencias_wp( )
   {
   }

   public controlincidencias_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlincidencias_wp.class ));
   }

   public controlincidencias_wp( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlincidencias_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlincidencias_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control Incidencias";
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

