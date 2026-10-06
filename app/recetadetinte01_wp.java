package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recetadetinte01_wp", "/app.recetadetinte01_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetadetinte01_wp extends GXWebObjectStub
{
   public recetadetinte01_wp( )
   {
   }

   public recetadetinte01_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetadetinte01_wp.class ));
   }

   public recetadetinte01_wp( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetadetinte01_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetadetinte01_wp_impl(context).cleanup();
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

