package app.recetasdeacabados ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recetasdeacabados.recetadeacabado01_wp", "/app.recetasdeacabados.recetadeacabado01_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetadeacabado01_wp extends GXWebObjectStub
{
   public recetadeacabado01_wp( )
   {
   }

   public recetadeacabado01_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetadeacabado01_wp.class ));
   }

   public recetadeacabado01_wp( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetadeacabado01_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetadeacabado01_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " FASQUI";
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

