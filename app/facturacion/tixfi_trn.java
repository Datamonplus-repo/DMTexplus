package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tixfi_trn", "/app.facturacion.tixfi_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tixfi_trn extends GXWebObjectStub
{
   public tixfi_trn( )
   {
   }

   public tixfi_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tixfi_trn.class ));
   }

   public tixfi_trn( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tixfi_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tixfi_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tix Fi_TRN";
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

