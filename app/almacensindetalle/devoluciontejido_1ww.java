package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.devoluciontejido_1ww", "/app.almacensindetalle.devoluciontejido_1ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class devoluciontejido_1ww extends GXWebObjectStub
{
   public devoluciontejido_1ww( )
   {
   }

   public devoluciontejido_1ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( devoluciontejido_1ww.class ));
   }

   public devoluciontejido_1ww( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new devoluciontejido_1ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new devoluciontejido_1ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Devolucion Tejido";
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

