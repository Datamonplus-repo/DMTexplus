package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informediferenciasrecuento_wc", "/app.informediferenciasrecuento_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informediferenciasrecuento_wc extends GXWebObjectStub
{
   public informediferenciasrecuento_wc( )
   {
   }

   public informediferenciasrecuento_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informediferenciasrecuento_wc.class ));
   }

   public informediferenciasrecuento_wc( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informediferenciasrecuento_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informediferenciasrecuento_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla RECUEN";
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

