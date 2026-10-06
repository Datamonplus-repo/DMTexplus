package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.listadodeprocesosquimicos_wc", "/app.formulaciontinte.listadodeprocesosquimicos_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadodeprocesosquimicos_wc extends GXWebObjectStub
{
   public listadodeprocesosquimicos_wc( )
   {
   }

   public listadodeprocesosquimicos_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadodeprocesosquimicos_wc.class ));
   }

   public listadodeprocesosquimicos_wc( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadodeprocesosquimicos_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadodeprocesosquimicos_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento de Procesos Quimicos";
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

