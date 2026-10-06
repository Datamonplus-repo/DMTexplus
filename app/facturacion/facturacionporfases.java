package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.facturacionporfases", "/app.facturacion.facturacionporfases"})
@jakarta.servlet.annotation.MultipartConfig
public final  class facturacionporfases extends GXWebObjectStub
{
   public facturacionporfases( )
   {
   }

   public facturacionporfases( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( facturacionporfases.class ));
   }

   public facturacionporfases( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new facturacionporfases_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new facturacionporfases_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Facturacion por Fases";
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

