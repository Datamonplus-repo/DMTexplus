package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webestadisticasreoperados", "/app.webestadisticasreoperados"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webestadisticasreoperados extends GXWebObjectStub
{
   public webestadisticasreoperados( )
   {
   }

   public webestadisticasreoperados( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webestadisticasreoperados.class ));
   }

   public webestadisticasreoperados( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webestadisticasreoperados_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webestadisticasreoperados_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Estadisticas Reoperados";
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

