package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.recetadetinte06_wp", "/app.formulaciontinte.recetadetinte06_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetadetinte06_wp extends GXWebObjectStub
{
   public recetadetinte06_wp( )
   {
   }

   public recetadetinte06_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetadetinte06_wp.class ));
   }

   public recetadetinte06_wp( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetadetinte06_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetadetinte06_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Agregar Procesos Quimicos";
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

