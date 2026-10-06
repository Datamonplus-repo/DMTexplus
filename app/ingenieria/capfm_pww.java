package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.capfm_pww", "/app.ingenieria.capfm_pww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class capfm_pww extends GXWebObjectStub
{
   public capfm_pww( )
   {
   }

   public capfm_pww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( capfm_pww.class ));
   }

   public capfm_pww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new capfm_pww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new capfm_pww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Clientes-Articulos-Procesos-Fases-Máquinas y sus parámetros";
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

