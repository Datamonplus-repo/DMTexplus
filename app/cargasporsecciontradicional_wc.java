package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.cargasporsecciontradicional_wc", "/app.cargasporsecciontradicional_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cargasporsecciontradicional_wc extends GXWebObjectStub
{
   public cargasporsecciontradicional_wc( )
   {
   }

   public cargasporsecciontradicional_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cargasporsecciontradicional_wc.class ));
   }

   public cargasporsecciontradicional_wc( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cargasporsecciontradicional_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cargasporsecciontradicional_wc_impl(context).cleanup();
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

