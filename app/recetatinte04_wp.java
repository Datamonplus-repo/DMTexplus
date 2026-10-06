package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recetatinte04_wp", "/app.recetatinte04_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetatinte04_wp extends GXWebObjectStub
{
   public recetatinte04_wp( )
   {
   }

   public recetatinte04_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetatinte04_wp.class ));
   }

   public recetatinte04_wp( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetatinte04_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetatinte04_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento Procesos Quimicos";
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

