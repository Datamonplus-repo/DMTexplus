package app.recetasdeacabados ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recetasdeacabados.recetadeacabado00_wp", "/app.recetasdeacabados.recetadeacabado00_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetadeacabado00_wp extends GXWebObjectStub
{
   public recetadeacabado00_wp( )
   {
   }

   public recetadeacabado00_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetadeacabado00_wp.class ));
   }

   public recetadeacabado00_wp( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetadeacabado00_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetadeacabado00_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Receta de Acabado";
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

