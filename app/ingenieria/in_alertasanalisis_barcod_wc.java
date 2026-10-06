package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.in_alertasanalisis_barcod_wc", "/app.ingenieria.in_alertasanalisis_barcod_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class in_alertasanalisis_barcod_wc extends GXWebObjectStub
{
   public in_alertasanalisis_barcod_wc( )
   {
   }

   public in_alertasanalisis_barcod_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( in_alertasanalisis_barcod_wc.class ));
   }

   public in_alertasanalisis_barcod_wc( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new in_alertasanalisis_barcod_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new in_alertasanalisis_barcod_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Datos de la HDR";
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

