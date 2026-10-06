package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tposbot", "/app.tposbot"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tposbot extends GXWebObjectStub
{
   public tposbot( )
   {
   }

   public tposbot( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tposbot.class ));
   }

   public tposbot( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tposbot_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tposbot_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "POSICION BOTA EN ALMACEN";
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

