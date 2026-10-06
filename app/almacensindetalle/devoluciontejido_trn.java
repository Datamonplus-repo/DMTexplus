package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.devoluciontejido_trn", "/app.almacensindetalle.devoluciontejido_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class devoluciontejido_trn extends GXWebObjectStub
{
   public devoluciontejido_trn( )
   {
   }

   public devoluciontejido_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( devoluciontejido_trn.class ));
   }

   public devoluciontejido_trn( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new devoluciontejido_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new devoluciontejido_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Devolucion de Tejido";
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

