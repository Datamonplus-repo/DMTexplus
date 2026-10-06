package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.diferenciasrecuentos_wc", "/app.diferenciasrecuentos_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class diferenciasrecuentos_wc extends GXWebObjectStub
{
   public diferenciasrecuentos_wc( )
   {
   }

   public diferenciasrecuentos_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( diferenciasrecuentos_wc.class ));
   }

   public diferenciasrecuentos_wc( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new diferenciasrecuentos_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new diferenciasrecuentos_wc_impl(context).cleanup();
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

