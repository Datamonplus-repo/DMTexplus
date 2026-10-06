package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcprocesosquimicos", "/app.wcprocesosquimicos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcprocesosquimicos extends GXWebObjectStub
{
   public wcprocesosquimicos( )
   {
   }

   public wcprocesosquimicos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcprocesosquimicos.class ));
   }

   public wcprocesosquimicos( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcprocesosquimicos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcprocesosquimicos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Historico Recetas (Procesos)";
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

