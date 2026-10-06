package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.devoluciontejido_6exportcsv", "/app.almacensindetalle.devoluciontejido_6exportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class devoluciontejido_6exportcsv extends GXWebObjectStub
{
   public devoluciontejido_6exportcsv( )
   {
   }

   public devoluciontejido_6exportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( devoluciontejido_6exportcsv.class ));
   }

   public devoluciontejido_6exportcsv( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new devoluciontejido_6exportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new devoluciontejido_6exportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Devolucion Tejido_6 Export CSV";
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

