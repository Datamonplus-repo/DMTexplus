package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.devoluciontejido_1", "/app.almacensindetalle.devoluciontejido_1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class devoluciontejido_1 extends GXWebObjectStub
{
   public devoluciontejido_1( )
   {
   }

   public devoluciontejido_1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( devoluciontejido_1.class ));
   }

   public devoluciontejido_1( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new devoluciontejido_1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new devoluciontejido_1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Devolucion Tejido (cabecera)";
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

