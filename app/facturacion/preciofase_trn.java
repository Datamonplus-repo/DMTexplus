package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.preciofase_trn", "/app.facturacion.preciofase_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class preciofase_trn extends GXWebObjectStub
{
   public preciofase_trn( )
   {
   }

   public preciofase_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( preciofase_trn.class ));
   }

   public preciofase_trn( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new preciofase_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new preciofase_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Precio Fase ";
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

