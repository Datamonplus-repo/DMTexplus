package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.rfa00c3", "/app.facturacion.rfa00c3"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rfa00c3 extends GXWebObjectStub
{
   public rfa00c3( )
   {
   }

   public rfa00c3( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rfa00c3.class ));
   }

   public rfa00c3( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rfa00c3_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rfa00c3_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Facturacion p/Fases (Clientes)";
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

