package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.wcprocesosformula", "/app.formulaciontinte.wcprocesosformula"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcprocesosformula extends GXWebObjectStub
{
   public wcprocesosformula( )
   {
   }

   public wcprocesosformula( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcprocesosformula.class ));
   }

   public wcprocesosformula( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcprocesosformula_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcprocesosformula_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Procesos quimicos ";
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

