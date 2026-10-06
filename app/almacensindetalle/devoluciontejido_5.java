package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.devoluciontejido_5", "/app.almacensindetalle.devoluciontejido_5"})
@jakarta.servlet.annotation.MultipartConfig
public final  class devoluciontejido_5 extends GXWebObjectStub
{
   public devoluciontejido_5( )
   {
   }

   public devoluciontejido_5( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( devoluciontejido_5.class ));
   }

   public devoluciontejido_5( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new devoluciontejido_5_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new devoluciontejido_5_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Test WEBSERVICE";
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

