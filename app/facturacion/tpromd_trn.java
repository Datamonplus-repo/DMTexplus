package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tpromd_trn", "/app.facturacion.tpromd_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpromd_trn extends GXWebObjectStub
{
   public tpromd_trn( )
   {
   }

   public tpromd_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpromd_trn.class ));
   }

   public tpromd_trn( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpromd_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpromd_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Programas";
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

