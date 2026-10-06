package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipmovwwexportreport", "/app.stocksquimicos.ttipmovwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipmovwwexportreport extends GXWebObjectStub
{
   public ttipmovwwexportreport( )
   {
   }

   public ttipmovwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipmovwwexportreport.class ));
   }

   public ttipmovwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipmovwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipmovwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipos de Movimiento";
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

