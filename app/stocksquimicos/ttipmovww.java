package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipmovww", "/app.stocksquimicos.ttipmovww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipmovww extends GXWebObjectStub
{
   public ttipmovww( )
   {
   }

   public ttipmovww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipmovww.class ));
   }

   public ttipmovww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipmovww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipmovww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipos de Movimientos";
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

