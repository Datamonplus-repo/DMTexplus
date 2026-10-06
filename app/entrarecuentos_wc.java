package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.entrarecuentos_wc", "/app.entrarecuentos_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entrarecuentos_wc extends GXWebObjectStub
{
   public entrarecuentos_wc( )
   {
   }

   public entrarecuentos_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entrarecuentos_wc.class ));
   }

   public entrarecuentos_wc( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entrarecuentos_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entrarecuentos_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla RECUEN";
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

