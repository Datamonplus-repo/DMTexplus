package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientoproductosreceta_trn", "/app.mantenimientoproductosreceta_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mantenimientoproductosreceta_trn extends GXWebObjectStub
{
   public mantenimientoproductosreceta_trn( )
   {
   }

   public mantenimientoproductosreceta_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mantenimientoproductosreceta_trn.class ));
   }

   public mantenimientoproductosreceta_trn( int remoteHandle ,
                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mantenimientoproductosreceta_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mantenimientoproductosreceta_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento de Productos (Receta)";
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

