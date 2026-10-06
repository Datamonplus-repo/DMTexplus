package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.localutilizacion", "/app.stocksquimicos.localutilizacion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class localutilizacion extends GXWebObjectStub
{
   public localutilizacion( )
   {
   }

   public localutilizacion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( localutilizacion.class ));
   }

   public localutilizacion( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new localutilizacion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new localutilizacion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Local Utilizacion";
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

