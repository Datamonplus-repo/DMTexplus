package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.incfg", "/app.ingenieria.incfg"})
@jakarta.servlet.annotation.MultipartConfig
public final  class incfg extends GXWebObjectStub
{
   public incfg( )
   {
   }

   public incfg( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( incfg.class ));
   }

   public incfg( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new incfg_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new incfg_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Configuración";
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

