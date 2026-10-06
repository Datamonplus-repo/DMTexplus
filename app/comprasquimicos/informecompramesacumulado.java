package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.informecompramesacumulado", "/app.comprasquimicos.informecompramesacumulado"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informecompramesacumulado extends GXWebObjectStub
{
   public informecompramesacumulado( )
   {
   }

   public informecompramesacumulado( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informecompramesacumulado.class ));
   }

   public informecompramesacumulado( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informecompramesacumulado_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informecompramesacumulado_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " LPRDES_TRN";
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

