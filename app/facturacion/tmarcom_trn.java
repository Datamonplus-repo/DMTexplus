package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tmarcom_trn", "/app.facturacion.tmarcom_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmarcom_trn extends GXWebObjectStub
{
   public tmarcom_trn( )
   {
   }

   public tmarcom_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmarcom_trn.class ));
   }

   public tmarcom_trn( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmarcom_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmarcom_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Margem Comercialiçao";
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

