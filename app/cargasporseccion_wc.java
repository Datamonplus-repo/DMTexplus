package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.cargasporseccion_wc", "/app.cargasporseccion_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cargasporseccion_wc extends GXWebObjectStub
{
   public cargasporseccion_wc( )
   {
   }

   public cargasporseccion_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cargasporseccion_wc.class ));
   }

   public cargasporseccion_wc( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cargasporseccion_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cargasporseccion_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla BARFAS";
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

