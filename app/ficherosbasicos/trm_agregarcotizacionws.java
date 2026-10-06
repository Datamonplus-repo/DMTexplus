package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.trm_agregarcotizacionws", "/app.ficherosbasicos.trm_agregarcotizacionws"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trm_agregarcotizacionws extends GXWebObjectStub
{
   public trm_agregarcotizacionws( )
   {
   }

   public trm_agregarcotizacionws( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trm_agregarcotizacionws.class ));
   }

   public trm_agregarcotizacionws( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trm_agregarcotizacionws_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trm_agregarcotizacionws_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Agregar cotización desde WS";
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

