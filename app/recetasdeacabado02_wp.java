package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recetasdeacabado02_wp", "/app.recetasdeacabado02_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetasdeacabado02_wp extends GXWebObjectStub
{
   public recetasdeacabado02_wp( )
   {
   }

   public recetasdeacabado02_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetasdeacabado02_wp.class ));
   }

   public recetasdeacabado02_wp( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetasdeacabado02_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetasdeacabado02_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recetas de Acabado (Mto)";
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

