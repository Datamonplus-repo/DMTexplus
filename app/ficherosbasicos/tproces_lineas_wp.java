package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tproces_lineas_wp", "/app.ficherosbasicos.tproces_lineas_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tproces_lineas_wp extends GXWebObjectStub
{
   public tproces_lineas_wp( )
   {
   }

   public tproces_lineas_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tproces_lineas_wp.class ));
   }

   public tproces_lineas_wp( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tproces_lineas_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tproces_lineas_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Lineas (Proceso)";
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

