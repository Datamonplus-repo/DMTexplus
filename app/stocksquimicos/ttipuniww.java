package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipuniww", "/app.stocksquimicos.ttipuniww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipuniww extends GXWebObjectStub
{
   public ttipuniww( )
   {
   }

   public ttipuniww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipuniww.class ));
   }

   public ttipuniww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipuniww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipuniww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipo de Unidad";
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

