package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.rfa0002", "/app.facturacion.rfa0002"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rfa0002 extends GXWebObjectStub
{
   public rfa0002( )
   {
   }

   public rfa0002( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rfa0002.class ));
   }

   public rfa0002( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rfa0002_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rfa0002_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "RESUMEN FACTURACION";
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

