package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recetadetinte02_wp", "/app.recetadetinte02_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetadetinte02_wp extends GXWebObjectStub
{
   public recetadetinte02_wp( )
   {
   }

   public recetadetinte02_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetadetinte02_wp.class ));
   }

   public recetadetinte02_wp( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetadetinte02_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetadetinte02_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Receta de Tinte (Mto)";
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

