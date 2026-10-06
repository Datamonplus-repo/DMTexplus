package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rconman", "/app.rconman"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rconman extends GXWebObjectStub
{
   public rconman( )
   {
   }

   public rconman( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rconman.class ));
   }

   public rconman( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rconman_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rconman_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consumos Manuales";
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

