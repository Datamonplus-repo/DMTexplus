package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.recetadetinte00_wp", "/app.formulaciontinte.recetadetinte00_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetadetinte00_wp extends GXWebObjectStub
{
   public recetadetinte00_wp( )
   {
   }

   public recetadetinte00_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetadetinte00_wp.class ));
   }

   public recetadetinte00_wp( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetadetinte00_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetadetinte00_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Receta de Tinte";
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

