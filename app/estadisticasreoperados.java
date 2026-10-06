package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.estadisticasreoperados", "/app.estadisticasreoperados"})
@jakarta.servlet.annotation.MultipartConfig
public final  class estadisticasreoperados extends GXWebObjectStub
{
   public estadisticasreoperados( )
   {
   }

   public estadisticasreoperados( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( estadisticasreoperados.class ));
   }

   public estadisticasreoperados( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new estadisticasreoperados_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new estadisticasreoperados_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Estadisticas Reoperados";
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

