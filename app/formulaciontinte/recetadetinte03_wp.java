package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.recetadetinte03_wp", "/app.formulaciontinte.recetadetinte03_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetadetinte03_wp extends GXWebObjectStub
{
   public recetadetinte03_wp( )
   {
   }

   public recetadetinte03_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetadetinte03_wp.class ));
   }

   public recetadetinte03_wp( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetadetinte03_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetadetinte03_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recetas Tinte (Mantenimiento)";
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

