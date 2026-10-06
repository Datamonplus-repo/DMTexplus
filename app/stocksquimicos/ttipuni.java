package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipuni", "/app.stocksquimicos.ttipuni"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipuni extends GXWebObjectStub
{
   public ttipuni( )
   {
   }

   public ttipuni( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipuni.class ));
   }

   public ttipuni( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipuni_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipuni_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TIPOS DE UNIDADES";
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

