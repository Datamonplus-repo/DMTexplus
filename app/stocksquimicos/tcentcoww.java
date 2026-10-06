package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tcentcoww", "/app.stocksquimicos.tcentcoww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcentcoww extends GXWebObjectStub
{
   public tcentcoww( )
   {
   }

   public tcentcoww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcentcoww.class ));
   }

   public tcentcoww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcentcoww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcentcoww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Centro de Coste";
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

