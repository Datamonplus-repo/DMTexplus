package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.cargasproduccionporfase_wc", "/app.produccion.cargasproduccionporfase_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cargasproduccionporfase_wc extends GXWebObjectStub
{
   public cargasproduccionporfase_wc( )
   {
   }

   public cargasproduccionporfase_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cargasproduccionporfase_wc.class ));
   }

   public cargasproduccionporfase_wc( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cargasproduccionporfase_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cargasproduccionporfase_wc_impl(context).cleanup();
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

