package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.rfa0006", "/app.facturacion.rfa0006"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rfa0006 extends GXWebObjectStub
{
   public rfa0006( )
   {
   }

   public rfa0006( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rfa0006.class ));
   }

   public rfa0006( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rfa0006_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rfa0006_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DIARIO DE FACTURACION";
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

