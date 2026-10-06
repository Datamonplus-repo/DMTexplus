package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.incfgww", "/app.ingenieria.incfgww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class incfgww extends GXWebObjectStub
{
   public incfgww( )
   {
   }

   public incfgww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( incfgww.class ));
   }

   public incfgww( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new incfgww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new incfgww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Configuración";
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

