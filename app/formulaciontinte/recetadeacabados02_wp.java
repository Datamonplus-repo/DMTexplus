package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.recetadeacabados02_wp", "/app.formulaciontinte.recetadeacabados02_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetadeacabados02_wp extends GXWebObjectStub
{
   public recetadeacabados02_wp( )
   {
   }

   public recetadeacabados02_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetadeacabados02_wp.class ));
   }

   public recetadeacabados02_wp( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetadeacabados02_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetadeacabados02_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla LRECET";
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

